package PrintJob;

class PrintJob {
	private String jobName;
	private int pages;

	public PrintJob(String name, int pages) {
		this.jobName = name;
		this.pages = pages;
	}

	public String getName() {
		return this.jobName;
	}

	public int getPages() {
		return this.pages;
	}
}// PrintJob

class Producer implements Runnable {
	private int sizeOfJobs;
	private int numberOfJobs;
	private int delayBetweenJobs;
	private String producerName;

	public Producer(int sizeOfJobs, int numberOfJobs, int delayBetweenJobs, String producerName) {
		this.sizeOfJobs = sizeOfJobs;
		this.numberOfJobs = numberOfJobs;
		this.delayBetweenJobs = delayBetweenJobs;
		this.producerName = producerName;
	}

	@Override

	public void run() {
		try {
			for (int i = 1; i <= this.numberOfJobs; i++) {
				PrintJob newOne = new PrintJob(this.producerName + "#" + i, this.sizeOfJobs);
				Printer.getInstance().addJob(newOne);
				System.out.println("P: Adding job " + "'" + newOne.getName() + "' to the queue");
				synchronized (Printer.getInstance()) {
					Printer.getInstance().notifyAll();
				}
				Thread.sleep(this.delayBetweenJobs);
			}
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

}// Producer

class Printer implements Runnable {
	private static Printer instance = new Printer();
	private CircularQueue printQueue;
	private boolean stateIsRinning;

	private Printer() {
		this.stateIsRinning = true;
		printQueue = new CircularQueue(6);
	}

	public static Printer getInstance() {
		return instance;

	}

	public synchronized void addJob(PrintJob prinJob) throws FullQueueException {
		while (this.printQueue.getSize() >= this.printQueue.getCapacity()) {
			try {

				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		this.printQueue.addBack(prinJob);
		this.notify();

	}

	private synchronized PrintJob getJob() throws EmptyQueueException {
		return (PrintJob) this.printQueue.getFront();

	}

	public synchronized void halt() {
		this.stateIsRinning = false;
	}

	@Override
	public void run() {

		System.out.println("C: Print manager is starting up");
		while (this.stateIsRinning) {

			while (this.printQueue.isEmpty()) {
				System.out.println("C: Waiting on a job to print.");
				synchronized (this) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			synchronized (this) {
				System.out.println("C: Starting job" + "'" + this.getJob().getName() + "'");
				long WaitingTime = 50 * this.getJob().getPages();
				while (WaitingTime > 0) {
					try {
						// System.out.println(WaitingTime);
						long begin = System.currentTimeMillis();
						// System.out.println("****WAITING START****");
						this.wait(WaitingTime);
						long end = System.currentTimeMillis();
						// System.out.println("B-E "+ (end-begin));
						WaitingTime = WaitingTime - (end - begin);
						// System.out.println("****WAITING END****");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println("C: Completed job " + "'" + this.getJob().getName() + "'");
				this.printQueue.removeFront();
				// System.out.println("printQueue.getFront()"+printQueue.getFront());
				this.notifyAll();
			}

		}
		System.out.println("C: Print manager is halted.");
	}
}// Printer

public class TestPrinter {

	public static void main(String[] args) throws InterruptedException {
		Producer p1 = new Producer(5, 3, 2, "Fred");
		Producer p2 = new Producer(15, 3, 6, "Elizabeth");
		Producer p3 = new Producer(25, 3, 10, "Simon");

		Printer manager = Printer.getInstance();
		Thread Manmger = new Thread(manager);
		Manmger.setPriority(Thread.MAX_PRIORITY);
		Manmger.start();

		Thread P11 = new Thread(p1);
		Thread P12 = new Thread(p2);
		Thread P13 = new Thread(p3);

		P12.start();
		P11.start();
		P13.start();

		P11.join();
		P12.join();
		P13.join();

		manager.halt();

	}// main

}// AdvancedThread
