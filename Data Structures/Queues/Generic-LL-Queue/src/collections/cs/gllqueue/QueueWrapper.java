/**
 * QueueWrapper.java :: Generic-LL-Queue
 *
 *		@author: Dylan Hall
 *		@date: Aug 28, 2017
 *		@lang: Java
 *
 *	source code for a queue implemented with a wrapper around Java's built in Linked List class
 */
package collections.cs.gllqueue;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Queue wrapper class implemented and wrapped with Java's LinkedList class
 */
public class QueueWrapper implements GQueueLL {

	private LinkedList<Object> data = new LinkedList<Object>();

	// enqueue method
	/**
	 * enqueues data into a queue using the wrapper's member methods
	 */
	public void enqueue(Object item) {
		data.addLast(item);
	}

	// dequeue method
	/**
	 * dequeues data from a queue using the wrapper's member methods
	 */
	public Object dequeue() {
		return data.removeFirst();
	}

	// peek method
	/**
	 * @returns the first object from within the queue using the wrappers member
	 *          methods
	 */
	public Object peek() {
		return data.getFirst();
	}

	// size method
	/**
	 * @returns the size of the queue
	 */
	public int _size() {
		return data.size();
	}

	// isEmpty method
	/**
	 * checks if the queue is empty
	 * 
	 * @returns true if the queue is empty, otherwise false
	 */
	public boolean _isEmpty() {
		return data.isEmpty();
	}

	// print method
	/**
	 * prints the queue
	 */
	public void print() {
		System.out.print("Queue: [");
		Iterator<Object> Iterator = data.iterator();
		while (Iterator.hasNext()) {
			System.out.print(Iterator.next() + ", ");
		}
		System.out.println("]");
	}

} /* END WRAPPER CLASS */
