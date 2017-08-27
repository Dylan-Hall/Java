/**
 * source code for a binary search tree implementation
 * 
 * 		@author: Dylan Hall
 * 		@date: 8/25/2017
 * 		@lang: Java
 * 
 * Im considering adding more getters and setters for handling different nodes.
 * 		# such as:
 * 				getLeft, getRight, getRoot, getParent, getChild, isLeft/isRight
 * I need to add 
 * 		# :
 * 				_getHeight, _getDepth
 * 
 * This is not an AVL tree, so there is no need for balancing methods,
 * it being the simplest tree structure.
 */

package bstree;

import java.util.Random;

/* Tester Class */
public class BinarySearchTreeTester {

	// Main Method; entry point of the program
	public static void main(String[] args) {
		Random rnd = new Random();
		BSTree tree = new BSTree();

		System.out.println("Testing the isEmpty() method with length: " + tree._getLength());
		boolean empty = tree.isEmpty();
		System.out.println("The tree is empty: " + empty);

		System.out.println("Filling the binary search tree with a random number values (1 -> n).\n");
		for (int i = 0, j = 1; i < rnd.nextInt(15) + 5; i++, j++) {
			tree.insert(j);
		}

		System.out.println("Printing the initial tree with length: " + tree._getLength());
		tree.print(tree.root);

		System.out.println("\n\nRemoving two values (2 & 4) from the tree");
		tree.remove(2);
		tree.remove(4);

		System.out.println("Printing the new tree with length: " + tree._getLength());
		tree.print(tree.root);

		System.out.println("\n\nRemoving a non-existant value.");
		tree.remove(-1);

		boolean srch = tree.search(1);
		System.out.println("\nSearching for a value, 1.\nThe value 1 is in the tree: " + srch);

	} /* end main */
} /* END CLASS */
