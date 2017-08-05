/**
 * Node.java :: java.node in JLibs
 *
 * 		@author: Dylan Hall
 * 		@date: Jul 5, 2017
 * 		@lang: Java
 *
 * This is a class that contains the methods for creating and manipulating nodes.
 */
package comp.libs.node;

public class Node {

	private Node next, prev;
	private NodeInfo<?> info;

	/* Node Constructor */
	public Node(NodeInfo<?> info, Node next, Node prev) {
		this.setInfoNode(info);
		this.setNext(next);
		this.setPrev(prev);
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

	/* Public Checkers*/
	//-------------------------------------------------
	public boolean hasNext() {
		return this.getNext() == null;
	}

	public boolean hasPrev() {
		return this.getPrev() == null;
	}
	
	/* Public Getters */
	// ------------------------------------------------
	public NodeInfo<?> getInfoNode() {
		return info;
	}
	
	public Node getNext() {
		return next;
	}

	public Node getPrev() {
		return prev;
	}

	/* Public Setters */
	// ------------------------------------------------
	public void setInfoNode(NodeInfo<?> info) {
		this.info = info;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

} /* END CLASS */
