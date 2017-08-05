/**
 * asd.java :: HeroQuest
 *
 * 		@author: Dylan Hall
 * 		@date: May 28, 2017
 * 		@lang: Java
 */

// Standard Imports
import java.util.Random;

// Dungeon Layout Class
public class Floors {

	// Random number object
	Random rnd = new Random();

	// Floor stats
	char layout[][];
	int numFloors;
	int height;
	int width;

	// Floor object constructor
	public Floors() {
		this.numFloors = rnd.nextInt(3) + 1;
		this.height = rnd.nextInt(25) + 15;
		this.width = rnd.nextInt(25) + 15;
		this.layout = new char[height][width];
	} /* end */

	// Creates the outlining walls of for the floors
	public Floors createFloorWalls() {

		// Make the box's lines.
		String c = "#";
		String h = new String(new char[height]).replace("\0", c);
		String v = c + new String(new char[height - 2]).replace("\0", " ") + c;

		System.out.println(h);
		for (int i = height - 2; i >= 1; --i) {
			System.out.println(v);
		}

		System.out.println(h);
		return this;
	} /* end */

	public void printLayout() {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(this.layout[i][j] + " ");
			}
			System.out.print("\n");
		}
	} /* end */

} /* END CLASS */
