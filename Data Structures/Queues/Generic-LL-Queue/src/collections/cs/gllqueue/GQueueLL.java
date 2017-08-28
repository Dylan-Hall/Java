/**
 * GQueueLL.java :: Generic-LL-Queue
 *
 *		@author: Dylan Hall
 *		@date: Aug 28, 2017
 *		@lang: Java
 *
 *	interface source code for a linked queue of generic type
 */
package collections.cs.gllqueue;

/**
 * FIFO Queue Interface implemented with a linked list of generic type
 */
public interface GQueueLL {
	
	// queue enqueue method
	/** 
	 * adds data to a queue
	 * @param obj: the object being added to the queue
	 */
	void enqueue(Object obj);
	
	// queue dequeue method
	/**
	 * removes an object from the queue
	 * @return the removed object
	 */
	Object dequeue();
	
	// queue isEmpty method
	/**
	 * checks if the queue is empty 
	 * @return true if so, otherwise return false
	 */
	public boolean _isEmpty();
	
	// queue peek method
	/**
	 * looks at the first object in the queue
	 * @return the first object from the queue
	 */
	public Object peek();
	
	// queue size method
	/**
	 * determines the size of the queue
	 * @return the size of the queue
	 */
	public int _size();
	
	// queue print method
	/**
	 * displays the queue
	 */
	public void print();

} /* END INTERFACE */
