/**
 * source code for a binary search tree implementation
 * 
 * 		@author: Dylan Hall
 * 		@date: 8/25/2017
 * 		@lang: Java
 */

package bstree;

/* Binary Search Tree Node Class */
public class BSTNode {

	BSTNode left, right;

	/* Default constructor */
	public BSTNode() {
		left = null;
		right = null;
		_data = 0;
	}

	/* Parameteized Constructor */
	public BSTNode(int data) {
		left = null;
		right = null;
		_data = data;
	}

	/* Public Getters */
	int getData() {
		return this._data;
	}

	/* Public Setter */
	void setData(int data) {
		this._data = data;
	}

	private int _data;
} /* END CLASS */
