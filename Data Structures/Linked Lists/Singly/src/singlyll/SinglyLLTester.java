/**
 * SinglyLLTester.java :: SinglyLL
 * 
 * 		@author: Dylan Hall
 *		@date: Aug 27, 2017
 *		@lang: Java
 *
 *	source code for the singly linked list tester,
 *	contains the main method; entry point of the program
 */
package singlyll;

/* Singly Linked List Tester Class */
class SinglyLLTester {

	// Main Method
	public static void main(String[] args) {
		SinglyLL ll = new SinglyLL();
		System.out.println("Linked List is empty: " + ll.isEmpty());
		System.out.println("Linked List length: " + ll.length);
		System.out.println("Removing a value form empty list: " + ll.removeLast());

		System.out.println("\nAdding values to the list... (1 -> 10), then printing.");
		for (int i = 0; i < 10; i++) {
			ll.insert(i + 1);
		}
		ll.print();

		System.out.println("\nRemoving two nodes from the end list: " + ll.removeLast() + ", " + ll.removeLast());
		ll.print();
		System.out.println("\nRemoving the first node from the list: " + ll.removeFirst());
		ll.print();
		System.out.println("\nRemoving a specific node from the list (index 1): " + ll.removeIndexOf(1));
		ll.print();
		System.out.println("\nRemoving a specific node from the list (index 5): " + ll.removeIndexOf(5));
		ll.print();
		System.out.print("\nRemoving a specific node with out of bound index: ");
		ll.removeIndexOf(100);
		ll.print();

		ll.clear();
		System.out.println("\n\nClearing the list, then attempting to remove and print nodes.");
		System.out.println("Linked List is empty: " + ll.isEmpty());
		System.out.println("Linked List length: " + ll.length);
		System.out.println("Removing a value form empty list: " + ll.removeLast());
		ll.print();

	} /* end main */

} /* END CLASS */
