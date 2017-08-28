/**
 * Queue.java :: Generic-LL-Queue
 *
 *		@author: Dylan Hall
 *		@date: Aug 28, 2017
 *		@lang: Java
 *
 *	source code for implementing queue methods implemented from an interface
 */
package collections.cs.gllqueue;

/**
 * Queue Implementation :: implements an interface for a linked queue of generic
 * typing
 * 
 * #see GQueueLL.java for interface
 */
public class Queue implements GQueueLL {

	private class Node {
		private Object _item;
		public Node next;
		
		/* Parametized Constructor */
		public Node(Object item) {
			this._item = item;
			this.next = null;
		}

		/* Public Getters */
		public Object _getData() {
			return this._item;
		}

	} /* end class */

	// Queue head and tail references
	private Node head = null;
	private Node tail = null;
	public int length;

	/* Default Constructor */
	public Queue() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	} /* end */

	// queue enqueue method
	public void enqueue(Object obj) {
		Node node = new Node(obj);
		this.length++;

		// check if empty
		if (this._isEmpty()) {
			this.head = node;
			this.tail = node;
			return;
		}

		// progress the queue
		tail.next = node;
		tail = node;
	} /* end */

	// queue dequeue method
	public Object dequeue() {
		// check if empty
		if (this._isEmpty()) {
			System.out.println("Queue is empty.\n");
			return null;
		}

		// create a save variable for the data
		Object saved = head._getData();
		if (tail == head) {
			tail = null;
		}

		// remove the object
		head = head.next;
		this.length--;
		return saved;
	} /* end */

	// queue isEmpty method
	public boolean _isEmpty() {
		return this.head == null;
	} /* end */

	// queue peek method
	public Object peek() {
		return this.head._getData();
	} /* end */

	// queue size method
	public int _size() {
		return this.length;
	} /* end */

	// queue print method
	public void print() {
		Node curr = this.head;
		System.out.print("Queue: [");
		for (int i = 0; i < this.length - 1; i++) {
			System.out.print(curr._getData() + ", ");
			curr = curr.next;
		}
		System.out.println(curr._getData() + "]");
	} /* end */

} /* END CLASS */
