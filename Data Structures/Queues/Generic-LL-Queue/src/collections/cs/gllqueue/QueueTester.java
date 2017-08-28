/**
 * QueueTester.java :: Generic-LL-Queue
 *
 *		@author: Dylan Hall
 *		@date: Aug 28, 2017
 *		@lang: Java
 */
package collections.cs.gllqueue;

// Queue Tester Class
public class QueueTester {

	// Main Method; program entry point
	public static void main(String[] args) {
		Queue queue = new Queue();
		QueueWrapper que = new QueueWrapper();

		System.out.println("Linked Queue from Interface:");
		System.out.println("Queue is empty: " + queue._isEmpty());
		System.out.println("Queue length: " + queue._size());

		System.out.print("Enqueuing: [");
		for (int i = 0; i < 10; i++) {
			if (i < 9)
				System.out.print((i + 1) + ", ");
			else
				System.out.println((i + 1) + "]");

			queue.enqueue(i + 1);
		}
		System.out.println("Testing print method: ");
		queue.print();

		System.out.println("\n\nLinked Queue from Wrapper:");
		System.out.println("Queue is empty: " + que._isEmpty());
		System.out.println("Queue length: " + que._size());

		System.out.print("Enqueuing: [");
		for (int i = 0; i < 10; i++) {
			if (i < 9)
				System.out.print((i + 1) + ", ");
			else
				System.out.println((i + 1) + "]");

			que.enqueue(i + 1);
		}
		System.out.println("Testing print method: ");
		que.print();
	} /* end main */

} /* END CLASS */
