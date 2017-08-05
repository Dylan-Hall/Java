/**
 * List.java :: java.list in JLibs
 *
 * 		@author: Dylan Hall
 * 		@date: Jul 5, 2017
 * 		@lang: Java
 *
 * This is a class that will implement a linked list with the node implementation 
 * from the package: java.node
 */
package comp.libs.list;

import comp.libs.node.*;

public class List {

	private Node head, tail;
	private int size = 0;

	// addBack; adds a node to the end of the list
	public void addBack(NodeInfo<?> info) {
		size++;
		if (isEmpty()) {
			head = new Node(info, null, null);
			tail = head;
		} else {
			Node node = new Node(info, null, tail);
			this.tail.setNext(node);
			this.tail = node;
		}
	} /* END */

	public NodeInfo<?> removeBack() {
		NodeInfo<?> result = null;
		if (!isEmpty()) {
			size--;
			result = getTail().getInfoNode();
			if (tail.hasPrev()) {
				tail.getPrev().setNext(null);
				tail = getTail().getPrev();
			} else {
				head = null;
				tail = null;
			}
		}
		return result;
	} /* END */

	// addFront; adds a node to the front of the list
	public void addFront(NodeInfo<?> info) {
		size++;
		if (isEmpty()) {
			head = new Node(info, null, null);
			tail = head;
		} else {
			Node newNode = new Node(info, head, null);
			this.head.setPrev(newNode);
			this.head = newNode;
		}
	} /* END */

	// removeFront; removes a node from the front of the list
	public NodeInfo<?> removeFront() {
		NodeInfo<?> result = null;
		if (!isEmpty()) {
			size--;
			result = getHead().getInfoNode();
			if (head.hasNext()) {
				head.getNext().setPrev(null);
				head = head.getNext();
			} else {
				head = null;
				tail = null;
			}
		}
		return result;
	} /* END */
	
	//TODO clone method
	//TODO combine method

	/* Public Checkers */
	// -------------------------------------------------
	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	public boolean isHead(Node chk) {
		return chk == head;
	}

	public boolean isTail(Node chk) {
		return chk == tail;
	}

	/* Public Getters */
	// ------------------------------------------------
	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	/* Public Setters */
	// ------------------------------------------------
	public void setHead(Node head) {
		this.head = head;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

} /* END CLASS */
