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

import java.util.Scanner;

/* AVLTreeTest Class */
/**
 * This is the tester class for an AVL Tree
 */
public class AVLTreeTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* Creating object of AVLTree */
		AVLTree avlTree = new AVLTree();

		System.out.println("AVLTree Tree Test\n");
		char chk;
		/* Perform tree operations */
		do {
			System.out.println("\nAVLTree Operations\n");
			System.out.println("1. insert ");
			System.out.println("2. search");
			System.out.println("3. count nodes");
			System.out.println("4. check empty");
			System.out.println("5. clear tree");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				avlTree.insert(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter integer element to search");
				System.out.println("Search result : " + avlTree.search(sc.nextInt()));
				break;
			case 3:
				System.out.println("Nodes = " + avlTree.countNodes());
				break;
			case 4:
				System.out.println("Empty status = " + avlTree.isEmpty());
				break;
			case 5:
				System.out.println("\nTree Cleared");
				avlTree.makeEmpty();
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* Display tree */
			System.out.print("\nPost order: ");
			avlTree.postorder();
			System.out.print("\nPre order: ");
			avlTree.preorder();
			System.out.print("\nIn order: ");
			avlTree.inorder();

			System.out.println("\nDo you want to continue (Type y or n) \n");
			chk = sc.next().charAt(0);
		} while (chk == 'Y' || chk == 'y');
		sc.close();
	} /* end main */
} /* END CLASS */