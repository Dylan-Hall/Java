/**
 * StackTester.java :: Stacks
 *
 *		@author: Dylan Hall
 *		@date: Aug 25, 2017
 *		@lang: Java
 *
 *	source code for the stack tester class containing the main function, or program entry point.
 *	#eventually this will be indicated with an "array," in its name. Therefore, I will be able to 
 * also implement a stack with a linked list as well.
 */
package stacks;

public class StackTester {

	// Main Method; program entry point
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		System.out.println("Note: the system will not display a overflow/underflow error more than once of the same type in a row.\n\n");

		System.out.println("Stack len: " + (stack._getLength() + 1));
		System.out.println("Stack cap: " + stack._getCapacity());
		System.out.println("Stack is empty: " + stack._isEmpty());
		System.out.println("Causing stack underflow... (popping data when the stack is empty)");
		System.out.println("\nPopping from the Stack twice.");
		stack.pop();
		stack.pop();
		
		System.out.println("\nPushing a value of 5 to the Stack, peaking, then popping twice more.");
		stack.push(5);
		System.out.println("Testing peak: " + stack.peak());
		stack.pop();
		stack.pop();

		System.out.println("Causing stack overflow... (adding 6 values, when capacity is 5)");

		for (int i = 0; i < 6; i++) {
			stack.push(i + 1);
		}
		stack.print();

		System.out.println("\n\nPopping the stack twice; Popped data: " + stack.pop() + ", " + stack.pop());
		System.out.println("Testing peak: " + stack.peak());
		System.out.println("Stack len: " + (stack._getLength() + 1));
		System.out.println("Stack cap: " + stack._getCapacity());
		System.out.println("Stack is empty: " + stack._isEmpty());
		stack.print();
		System.out.println("Stack len: " + (stack._getLength() + 1));
		

	} /* end main */

} /* END CLASS */
