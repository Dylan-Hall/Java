import java.util.Random;

public class Binary {

	public static void main(String[] args) {

		ArrayHandler array = new ArrayHandler();
		array.setArray();
		array.descending();
		
		array.printArray();
	}
}

class ArrayHandler {

	Random rnd = new Random();
	private int[] array = new int[10];
	private short size = 10;

	// returns array size
	short getSize() {
		return size;
	}

	// returns the array
	void printArray() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	// initialize the array with *size* number of elements
	void setArray() {
		for (int i = 0; i < size; i++) {
			array[i] = rnd.nextInt(20) + 1;
		}
	}

	// sorts the array
	void ascending() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	void descending() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
