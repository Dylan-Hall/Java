/**
 * AVLNode.java :: AVLTree
 *
 * 		@author: Dylan Hall
 * 		@date: May 28, 2017
 * 		@lang: Java
 */

/**
 * Java Program to implement an AVL Tree
 * 		@author: Mark ALlen
 */

package com.avltree.main;

/* AVLTree Class */
public class AVLTree {

	private AVLNode root;

	/* AVLTree Default Constructor */
	public AVLTree() {
		root = null;
	}

	/* Method to check if the tree is empty */
	/**
	 * @return boolean -> root = null ? True : False
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/* Method to destroy the AVL Tree */
	public void makeEmpty() {
		root = null;
	}

	/* Method to insert into the tree */
	public void insert(int data) {
		root = insert(data, root);
	}

	/* Method to return the height of the tree */
	/**
	 * @param tree:
	 *            the AVL Tree
	 * @return the tree height
	 */
	private int height(AVLNode tree) {
		return tree == null ? -1 : tree.height;
	}

	/* Method to determine tree size */
	private int max(int lhs, int rhs) {
		return lhs > rhs ? lhs : rhs;
	}

	/* Method to recursively insert data */
	private AVLNode insert(int x, AVLNode tree) {

		// Check for a null tree
		if (tree == null) {
			tree = new AVLNode(x);

			// Inserting to the left of root
		} else if (x < tree.data) {
			tree.left = insert(x, tree.left);

			// Check if a recursive rotation is needed
			if (height(tree.left) - height(tree.right) == 2) {
				if (x < tree.left.data) {
					tree = rotateWithLeftChild(tree);
				} else {
					tree = doubleWithLeftChild(tree);
				}
			} /* end if */

			// Inserting to the right of root
		} else if (x > tree.data) {
			tree.right = insert(x, tree.right);

			// Check if a recursive rotation is needed
			if (height(tree.right) - height(tree.left) == 2) {
				if (x > tree.right.data) {
					tree = rotateWithRightChild(tree);
				} else {
					tree = doubleWithRightChild(tree);
				}
			} /* end if */
		} /* END ELSE-IF BlOCK */

		tree.height = max(height(tree.left), height(tree.right)) + 1;
		return tree;
	} /* END */

	/* Method to rotate with left child */
	/**
	 * @param k2:
	 *            the pivot node(axis) to rotate from
	 * @return k1: the newly rotated node
	 */
	private AVLNode rotateWithLeftChild(AVLNode k2) {
		AVLNode k1 = k2.left;
		k2.left = k1.right;
		k1.right = k2;
		k2.height = max(height(k2.left), height(k2.right)) + 1;
		k1.height = max(height(k1.left), k2.height) + 1;
		return k1;
	} /* end */

	/* Method to rotate with right child */
	/**
	 * @param k1:
	 *            the pivot node(axis) to rotate from
	 * @return k2: the newly rotated node
	 */
	private AVLNode rotateWithRightChild(AVLNode k1) {
		AVLNode k2 = k1.right;
		k1.right = k2.left;
		k2.left = k1;
		k1.height = max(height(k1.left), height(k1.right)) + 1;
		k2.height = max(height(k2.right), k1.height) + 1;
		return k2;
	} /* end */

	/* Method to double rotate with left child */
	/**
	 * Note: rotate first left child with its right child, then node k3 with the
	 * new left child
	 */
	private AVLNode doubleWithLeftChild(AVLNode k3) {
		k3.left = rotateWithRightChild(k3.left);
		return rotateWithLeftChild(k3);
	}

	/* Method to double rotate with right child */
	/**
	 * Note: rotate first left child with its right child, then node k3 with the
	 * new left child
	 */
	private AVLNode doubleWithRightChild(AVLNode k1) {
		k1.right = rotateWithRightChild(k1.right);
		return rotateWithLeftChild(k1);
	}

	/* Method to count the number of nodes */
	/**
	 * @return the number of nodes
	 */
	public int countNodes() {
		return countNodes(root);
	}

	/**
	 * Note: This is a private overload of the above Method. This method holds
	 * the algorithms and calculations to determine the number of nodes, the
	 * above is a default call method
	 * 
	 * @param current:
	 *            the current node being counted from
	 * @return the number of nodes in the tree
	 */
	private int countNodes(AVLNode current) {
		if (current == null) {
			return 0;
		} else {
			int numNodes = 1;
			numNodes += countNodes(current.right);
			numNodes += countNodes(current.left);
			return numNodes;
		} /* END IF-ELSE BLOCK */
	} /* end */

	/* Method to search for an element in the tree */
	public boolean search(int val) {
		return search(root, val);
	}

	/**
	 * Note: This is an overload method for the above method. This method
	 * contains the algorithms and calculations required to search for a node in
	 * the tree. This allows the user to make a single call for a specific data
	 * value that they wish to search for, instead of providing a node location
	 * in memory along with it.
	 * 
	 * @param current:
	 *            the current node being searched
	 * @param val:
	 *            the value within a node being searched for
	 * @return the node if found, if not return false
	 */
	private boolean search(AVLNode current, int val) {
		boolean found = false;
		while ((current != null) && !found) {
			int currData = current.data;
			if (val < currData) {
				current = current.left;
			} else if (val > currData) {
				current = current.right;
			} else {
				found = true;
				break;
			} /* end else-if block */

			found = search(current, val);
		} /* end while */

		return found;
	} /* end */

	/* Method for inorder traversal */
	public void inorder() {
		inorder(root);
	}

	/**
	 * Note: This is a private overload of the above method
	 * 
	 * @param current:
	 *            the current node being printed
	 */
	private void inorder(AVLNode current) {
		if (current != null) {
			inorder(current.left);
			System.out.print(current.data + " ");
			inorder(current.right);
		}
	} /* end */

	/* Method for preorder traversal */
	public void preorder() {
		preorder(root);
	}

	/**
	 * Note: This is a private overload of the above method
	 * 
	 * @param current:
	 *            the current node being printed
	 */
	private void preorder(AVLNode current) {
		if (current != null) {
			System.out.print(current.data + " ");
			preorder(current.left);
			preorder(current.right);
		}
	} /* end */

	/* Method for preorder traversal */
	public void postorder() {
		postorder(root);
	}

	/**
	 * Note: This is a private overload of the above method
	 * 
	 * @param current:
	 *            the current node being printed
	 */
	private void postorder(AVLNode current) {
		if (current != null) {
			postorder(current.left);
			postorder(current.right);
			System.out.print(current.data + " ");
		}
	} /* end */

} /* END CLASS */
