/**
 * QueueLL.java :: Queues
 *
 *		@author: Dylan Hall
 *		@date: Aug 26, 2017
 *		@lang: Java
 *
 *	source code for a queue data structure implemented with a linked list
 */
package queues;

// QueueLL Class
public class QueueLL {

	class Node {

		public Node next;
		private int data;

		/* Default Constructor */
		public Node(int data) {
			this.next = null;
			this.data = data;
		} /* end */

		/* Public Getters */
		public Node _getNext() {
			return this.next;
		}

		public int _getData() {
			return this.data;
		}

	} /* end node class */

	private Node head, tail;
	public int length;

	/* Parametized Constructor */
	public QueueLL() {
		this.length = 0;
		this.setHead(null);
		this.setTail(null);
	} /* end */

	// queue newNode method
	/**
	 * creates a new node for the queue
	 * 
	 * @param data:
	 *            the data in the new node
	 * @returns the new node
	 */
	public Node newNode(int data) {
		return new Node(data);
	} /* end */

	// queue enqueue method
	/**
	 * inserts data into the queue
	 */
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (this._isEmpty()) {
			head = newNode;
			tail = newNode;
			this.length++;
			return;
		}

		this.length++;
		tail.next = newNode;
		tail = newNode;
	} /* end */

	// queue print method
	/**
	 * displays the queue contents
	 */
	public void print() {
		Node curr = this._getHead();
		System.out.print("Queue: [");
		for (int i = 0; i < this.length; i++) {
			if (curr._getNext() != null) {
				System.out.print(curr._getData() + ", ");
			} else {
				System.out.println(curr._getData() + "]");
			}
			curr = curr._getNext();
		} /* end for */
	} /* end */

	// queue peak method
	/**
	 * #returns the data of the first node in the queue
	 */
	public int peak() {
		return this._getHead().data;
	} /* end */

	// queue isEmpty method
	/**
	 * checks if the queue is empty
	 * 
	 * @return true if the queue is empty, false if otherwise
	 */
	public boolean _isEmpty() {
		return this._getHead() == null;
	} /* end */

	/* Public Getters */
	public Node _getHead() {
		return this.head;
	}

	public Node _getTail() {
		return this.tail;
	}

	/* Public Setters */
	public void setHead(Node head) {
		this.head = head;
	}

	public void setTail(Node rear) {
		this.tail = rear;
	}

} /* END CLASS */
