/**
 * source code for a binary search tree implementation
 * 
 * 		@author: Dylan Hall
 * 		@date: 8/25/2017
 * 		@lang: Java
 */

package bstree;

/* Binary Search Tree Class */
public class BSTree {
	public BSTNode root;
	public int _length;

	/* Default Constructor */
	public BSTree() {
		root = null;
		_length = 0;
	}

	// BST insert method
	/**
	 * inserts data into the binary search tree
	 * 
	 * @param data:
	 *            the data being added to the tree
	 */
	public void insert(int data) {
		BSTNode newNode = new BSTNode(data);
		if (this.isEmpty()) {
			root = newNode;
			this._length++;
			return;
		}

		BSTNode current = root;
		BSTNode parent = null;
		while (true) {
			parent = current;
			if (data < current.getData()) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					this._length++;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					this._length++;
					return;
				}
			}
		}
	} /* end insert method */

	// BST remove method
	/**
	 * removes data from the binary search tree
	 * 
	 * @param data:
	 *            the data requested for removal #returns the data if removed
	 */
	public boolean remove(int data) {

		// if tree is empty
		if (this.isEmpty()) {
			System.out.println("The tree is empty.\n");
			return false;
		}

		BSTNode parent = root;
		BSTNode current = root;
		boolean lhs = false;

		/* Traverse through the tree to find if the node exists */
		while (current.getData() != data) {
			parent = current;
			if (current.getData() > data) {
				lhs = true;
				current = current.left;
			} else {
				lhs = false;
				current = current.right;
			}
			if (current == null) {
				System.out.println("Value is non-existant.\n");
				return false;
			}
		}

		/* the node exists with no children */
		if (current.left == null && current.right == null) {
			if (current == root) {
				root = null;
			}
			if (lhs == true) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		} /* end if */

		/* the node exists with one child */
		else if (current.right == null) {
			if (current == root) {
				root = current.left;
			} else if (lhs) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}
		} else if (current.left == null) {
			if (current == root) {
				root = current.right;
			} else if (lhs) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		} /* end else-if block */

		/* the node exists with two children */
		else if (current.left != null && current.right != null) {

			// now we have found the minimum element in the right sub tree
			BSTNode child = getChild(current);
			if (current == root) {
				root = child;
			} else if (lhs) {
				parent.left = child;
			} else {
				parent.right = child;
			}
			child.left = current.left;
		} /* END ELSE-IF */

		this._length--;
		return true;
	} /* end remove method */

	// BST getChild method
	/**
	 * searches a node and determines if it has a successor
	 * 
	 * @param srch:
	 *            the node to determine its children
	 * @return the child
	 */
	public BSTNode getChild(BSTNode srch) {

		// if tree is empty
		if (this.isEmpty()) {
			System.out.println("The tree is empty.\n");
			return null;
		}

		BSTNode successor = null;
		BSTNode parent = null;
		BSTNode current = srch.right;

		while (current != null) {
			parent = successor;
			successor = current;
			current = current.left;
		}

		if (successor != srch.right) {
			parent.left = successor.right;
			successor.right = srch.right;
		}

		return successor;
	} /* end getChild method */

	// BST isEmpty method
	/**
	 * determines if the binary search tree is empty
	 * 
	 * #returns true if the tree is empty, false is otherwise
	 */
	public boolean isEmpty() {
		return this.root == null;
	} /* end isEmpty method */

	// BST search method
	/**
	 * searches for a node in the binary search tree
	 * 
	 * @param srch:
	 *            the search key #returns true if the key is found, false otherwise
	 */
	public boolean search(int srch) {

		boolean found = false;

		// if tree is empty
		if (this.isEmpty()) {
			System.out.println("The tree is empty.\n");
			return found;
		}

		BSTNode current = root;

		while (current != null) {
			if (srch < current.getData()) {
				current = current.left;
			} else if (srch > current.getData()) {
				current = current.right;
			} else {
				found = true;
				return found;
			}

			found = search(srch);
		} /* end while */

		return found;
	} /* end search method */

	// BST print method
	/**
	 * prints the data in the binary search tree
	 * 
	 * @traversal: inorder
	 * 
	 * @param root:
	 *            the root of the BST
	 */
	public void print(BSTNode root) {
		if (root != null) {
			print(root.left);
			System.out.print(" " + root.getData());
			print(root.right);
		}
	} /* end print method */

	// BST getLength method
	/**
	 * returns the number of nodes in the tree
	 */
	public int _getLength() {
		return this._length;
	} /* end _getLength method */

} /* END CLASS */
