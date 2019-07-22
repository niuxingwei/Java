package PrintJob;

public class CircularQueue implements Queue {

	private Object[] queue;
	private int frontIndex;
	private int backIndex;

	public CircularQueue(int capacity) {
		queue = new Object[capacity];
		frontIndex = 0;
		backIndex = 0;
	}

	public void addBack(Object object) throws FullQueueException {
		// if ( backIndex == (frontIndex + 1) % queue.length ) {
		if ((backIndex + 1) % queue.length == frontIndex) {
			// System.out.println("The Queue if full Waiting¡¤¡¤¡¤");
			throw new FullQueueException(this);
		}
		queue[backIndex] = object;
		backIndex = (backIndex + 1) % queue.length;
	}

	/**
	 * This function retrieves (but not removes) the object on the front of the
	 * queue.
	 *
	 * @return Object the item at the front of the queue
	 *
	 * @throws EmptyQueueException
	 *             when the queue is empty
	 */
	public Object getFront() throws EmptyQueueException {
		if (frontIndex == backIndex) {
			throw new EmptyQueueException(this);
		}
		return queue[frontIndex];
	}

	/**
	 * This function retrieves (but not removes) the object on the front of the
	 * queue.
	 *
	 * @return Object the item at the front of the queue
	 *
	 * @throws EmptyQueueException
	 *             when the queue is empty
	 */
	public Object removeFront() throws EmptyQueueException {
		if (frontIndex == backIndex) {
			throw new EmptyQueueException(this);
		}
		Object object = queue[frontIndex];
		queue[frontIndex] = null;
		frontIndex = (frontIndex + 1) % queue.length;
		return object;
	}

	/**
	 * This function determines whether or not the queue is empty.
	 *
	 * @return boolean <TT>true</TT> if the queue is empty
	 */
	public boolean isEmpty() {
		return (getSize() == 0);
	}

	/**
	 * This function the current length of the queue.
	 *
	 * @return int the length of the queue
	 */
	public int getSize() {
		int length = backIndex - frontIndex;
		if (length < 0) {
			return length + queue.length;

		} else {
			return length;
		}

	}

	/**
	 * This function the maximum size of the queue. It may return <TT>-1</TT>,
	 * if the capacity of the queue is not fixed.
	 *
	 * @return int the capacity of the queue
	 */
	public int getCapacity() {
		return queue.length-1;
	}
}
