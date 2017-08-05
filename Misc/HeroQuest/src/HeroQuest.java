/**
 * Monster.java :: HeroQuest.java
 * 
 * This is the Monster class for my HeroQuest style game
 * 
 * @author: Dylan Hall
 * @date: 5/27/2017
 * @language: Java
 */

// HeroQuest Class
public class HeroQuest {

	// Main Method for HeroQuest
	public static void main(String[] args) {

		// Creating and setting Hero instance
		Hero hero = Hero.getInstance();
		hero.setHero("Dylan", 2, 10);

		System.out.println(hero.name + " " + hero.damage + " " + hero.health);

		// Creating Ogre Monster instance
		Monster ogre = MonsterFactory(true, "Ogre", 4, 10);

		// Creating several Goblin Archer Monster instances
		Monster[] goblinArchers = new Monster[3];
		for (int i = 0; i < goblinArchers.length; i++) {
			goblinArchers[i] = MonsterFactory(false, "Goblin Archer", 1, 5);
		}
	
		Floors newFloor = new Floors();
		
		newFloor.createFloorWalls();
		newFloor.printLayout();
	} /* END MAIN */

	private static Monster MonsterFactory(boolean hasMagic, String desc, int damage, int health) {
		return new Monster(hasMagic, desc, damage, health);
	} /* end */

} /* END CLASS */
