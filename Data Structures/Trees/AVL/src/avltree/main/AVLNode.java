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

/* AVLNode Class */
class AVLNode {

	// Define left and right children of a node
	AVLNode left, right;
	int data;
	int height;

	/* AVLNode Default Constructor */
	public AVLNode() {
		left = right = null;
		data = height = 0;
	} /* end */

	/* AVLNode Constructor */
	/**
	 * Note: this is actually an overloaded constructor for this class. i.e. it
	 * is used when there is actually a value to be passed to this constructor.
	 * Else, it will use the default constructor.
	 * 
	 * @param val:
	 *            the value for the nodes data
	 */
	public AVLNode(int val) {
		left = right = null;
		data = val;
		height = 0;
	} /* end */

} /* END CLASS */
