/**
 * SinglyLL.java :: SinglyLL
 * 
 * 		@author: Dylan Hall
 *		@date: Aug 27, 2017
 *		@lang: Java
 *
 *	source code for a singly linked list implementation
 */
package singlyll;

/* Singly Linked List Class */
class SinglyLL {

	/* Node Class */
	protected class Node {
		private int data;
		private Node next;

		/* Parametized Constructor */
		Node(int data) {
			this.data = data;
			this.next = null;
		}

		/* Public Getters */
		public int _getData() {
			return this.data;
		}

		public Node _getNext() {
			return this.next;
		}

		/* Public Setters */
		public void setData(int data) {
			this.data = data;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	} /* end class */

	private Node head;
	public int length;

	/* Default Constructor */
	public SinglyLL() {
		this.head = null;
		this.length = 0;
	} /* end */

	// linked list insert method
	/**
	 * adds data to the linked list
	 */
	public void insert(int data) {
		Node newNode = new Node(data);
		if (this.isEmpty()) {
			this.head = newNode;
			this.length++;
			return;
		}

		Node curr = this.head;
		while (curr._getNext() != null) {
			curr = curr._getNext();
		}
		curr.setNext(newNode);
		this.length++;
	} /* end */

	// linked list removeFirst method
	/**
	 * removes data from the front of the list
	 * 
	 * @returns the removed data
	 */
	public int removeFirst() {
		if (this.isEmpty()) {
			System.out.println("Linked List is empty.\n");
			return -1;
		}
		int saved = this.head._getData();
		this.head = this.head._getNext();
		this.length--;
		return saved;
	} /* end */

	// linked list removeLast method
	/**
	 * removes data from the linked list
	 * 
	 * @returns the removed data
	 */
	public int removeLast() {
		if (this.isEmpty()) {
			System.out.println("Linked List is empty.\n");
			return -1;
		}

		Node curr = this._getHead();
		Node prev = curr;
		while (curr._getNext() != null) {
			prev = curr;
			curr = curr._getNext();
		}
		int saved = curr._getData();
		prev.setNext(null);
		this.length--;
		return saved;
	} /* end */

	// linked list removeIndexOf method
	/**
	 * removes a specified node from a linked list
	 * 
	 * @returns the removed data
	 */
	public int removeIndexOf(int srch) {

		/* Four base cases */

		// if the list is empty
		if (this.isEmpty()) {
			System.out.println("Linked List is empty.\n");
			return -1;
		}

		// if requested node is the head
		if (srch == 0) {
			return this.removeFirst();
		}

		// if requested node is the tail
		if (srch == this.length - 1) {
			return this.removeLast();
		}
		
		// if search key is out of bound
		if (srch >= this.length) {
			System.out.println("\nIndex out of bound error.");
			return -1;
		}

		Node curr = this._getHead();
		Node prev = curr;
		int saved = 0;
		for (int i = 0; i < this.length - 1; i++) {
			if (srch == i) {
				saved = curr._getData();
				break;
			}
			prev = curr;
			curr = curr._getNext();
		}
		prev.setNext(curr._getNext());
		curr = null;
		this.length--;
		return saved;
	} /* end */

	// linked list clear method
	/**
	 * clears the linked list of nodes
	 */
	public void clear() {
		while (head != null) {
			this.head = this.head._getNext();
			this.length--;
		}
	} /* end */

	// linked list isEmpty method
	/**
	 * checks if the linked list is empty
	 * 
	 * @returns true if empty, otherwise returns false
	 */
	public boolean isEmpty() {
		return this.head == null;
	} /* end */

	// linked list print method
	/**
	 * displays the linked list
	 */
	public void print() {
		if (this.isEmpty()) {
			System.out.println("Linked List is empty.\n");
			return;
		}

		Node curr = this.head;
		System.out.print("Linked List: [");
		while (curr._getNext() != null) {
			System.out.print(curr._getData() + ", ");
			curr = curr._getNext();
		}
		System.out.println(curr._getData() + "]");
	} /* end */

	/* Public Getters */
	public Node _getHead() {
		return this.head;
	}
} /* END CLASS */
