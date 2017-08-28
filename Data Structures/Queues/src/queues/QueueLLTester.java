/**
 * QueueLLTester.java :: Queues
 *
 *		@author: Dylan Hall
 *		@date: Aug 26, 2017
 *		@lang: Java
 *
 *	source code for the queue tester implemented with a linked list
 *	#contains the main method, or the program entry point
 */
package queues;

// QueueLLTester Class
public class QueueLLTester {

	public static void main(String[] args) {
		QueueLL queue = new QueueLL();

		for (int i = 0; i < 5; i++) {
			queue.enqueue(i + 1);
		}
		queue.print();
	} /* end main */

} /* END CLASS */
