

public class TestThreeThreads 
{
	public static void main (String[] args)
	{
		Runnable runnable = new PrintMe();
		Thread first = new Thread(runnable);
		Thread second = new Thread(runnable);
		Thread third = new Thread(runnable);
		first.setName("first");
		second.setName("second");
		third.setName("third");
		first.start();
		second.start();
		third.start();
	}
}

class PrintMe implements Runnable
{
	public void run ()
	{
		int cnt = 10;
		while (cnt-- > 0)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}