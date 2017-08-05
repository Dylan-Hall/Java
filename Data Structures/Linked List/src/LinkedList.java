import java.util.Random;

//Linked List class
class Link {

	// Node variables
	int data;
	public Link next;

	// List Constructor
	public Link(int val) {
		data = val;
		next = null;
	}/* end */
} /* END */

class List {

	private Link head;

	// Linked List Constructor
	public List() {

		head = null;
	} /* end */

	// Checks if list is empty
	public boolean isEmpty() {

		return head == null;
	} /* end */

	public void insert(int data) {

		// Establish a new node with the input data
		Link temp = new Link(data);

		// If head is empty, set it equal to temp
		if (isEmpty()) {

			head = temp;
			return;

			// Else if temp is less than head
		} else if (temp.data < head.data) {

			temp.next = head;
			head = temp;
			return;

			// Else if temp is greater than head
		} else if (temp.data > head.data) {

			Link current = head;

			while (current.next != null) {

				if (current.next.data > temp.data) {
					temp.next = current.next;
					current = temp;
					break;
				}

				current = current.next;
			}
		}
	} /* end */

	public void display() {

		Link current = head;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	} /* end */
} /* END */

public class LinkedList {

	public static void main(String[] args) {

		Random rand = new Random();
		List newList = new List();

		for (int i = 0; i < 5; i++) {
			int n = rand.nextInt(50) + 1;
			newList.insert(n);
		}

		newList.display();
	}
} /* END */