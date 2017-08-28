/**
 * Stack.java :: Stacks
 *
 *		@author: Dylan Hall
 *		@date: Aug 25, 2017
 *		@lang: Java
 */
package stacks;

public class Stack {

	private int _length;
	private int _capacity;

	public int[] data;
	public boolean badFlow = false;

	/* Parametized Constructor */
	public Stack(int cap) {
		this.data = new int[cap];
		this._capacity = cap;
		this._length = -1;
	} /* end */

	/* Stack Methods */

	// stack push method
	/**
	 * adds data to the stack, checking for overflow
	 * 
	 * @param data:
	 *            the data being added
	 */
	public void push(int data) {

		/* Two Cases */
		// if the stack is empty
		int len = this._getLength();
		if (this._isEmpty()) {
			this.setLength(++len);
			this.data[len] = data;
			return;
		}

		if (badFlow == true && len >= -1)
			badFlow = false;

		// if the stack is already at capacity
		if (len == this._getCapacity() - 1) {
			if (badFlow == true) {
				return;
			}

			System.out.println("Stack overflow.");
			badFlow = true;
			return;
		}

		// otherwise, find the correct placement
		this.data[++len] = data;
		this.setLength(len);

	} /* end */

	// stack pop method
	/**
	 * removes data from the stack, checking for underflow
	 */
	public int pop() {
		int len = this._getLength();
		// if the stack is empty
		if (this._isEmpty()) {
			System.out.println("Stack underflow.");
			badFlow = true;
			return -1;
		}

		int saved = this.data[len];
		if (badFlow == true)
			badFlow = false;

		this.setLength(--len);
		return saved;
	} /* end */

	// stack clone method
	/**
	 * clones a stack and returns the new one
	 * 
	 * @return the new stack
	 */
	public Stack clone() {
		Stack newStack = this;
		return newStack;
	} /* end */

	// stack isEmpty method
	/**
	 * checks if the stack is empty
	 * 
	 * @return true if it is, otherwise false
	 */
	public boolean _isEmpty() {
		return this._getLength() == -1;
	} /* end */

	// stack isFull method
	/**
	 * checks if the stack is full
	 * 
	 * @return true if it is, otherwise false
	 */
	public boolean _isFull() {
		return this._getLength() == this._getCapacity() - 1;
	} /* end */

	// stack print method
	/**
	 * displays the stack's data
	 */
	public void print() {
		System.out.print("Stack: [");
		for (int i = 0; i < this._getLength() + 1; i++) {
			if (i < this._getLength()) {
				System.out.print(this.data[i] + ", ");
			}
		}
		System.out.print(this.data[this._getLength()]);

		System.out.println("]");
	} /* end */

	// stack peak method
	/**
	 * checks the first value in the stack
	 * 
	 * @return the first value in the stack
	 */
	public int peak() {
		if (this._isEmpty()) {
			System.out.println("Stack is empty.\n");
			return -1;
		}

		return this.data[0];
	} /* end */

	/* Public Getters */
	public int _getLength() {
		return this._length;
	} /* end */

	public int _getCapacity() {
		return this._capacity;
	} /* end */

	/* Public Setters */
	public void setLength(int len) {
		this._length = len;
	} /* end */

	public void setCapacity(int cap) {
		this._capacity = cap;
	} /* end */
} /* END CLASS */
