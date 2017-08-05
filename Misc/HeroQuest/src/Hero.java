/**
 * Hero.java :: HeroQuest.java
 * 
 * This is the Hero class for my HeroQuest style game
 * 
 * @author: Dylan Hall
 * @date: 5/27/2017
 * @language: Java
 */

// Hero class
class Hero {

	// Singleton Hero instance
	private static Hero hero = new Hero();
	Hero() {};

	// Hero stats
	String name;
	int health;
	int damage;

	// Public setters for Hero instance
	public static void setName(String name) {
		hero.name = name;
	} /* end */

	public static void setHealth(int health) {
		hero.health = health;
	} /* end */

	public static void setDamage(int damage) {
		hero.damage = damage;
	} /* end */
	
	// Public encapsulating setter
	public void setHero(String name, int health, int damage) {

		setName(name);
		setDamage(damage);
		setHealth(health);
	} /* end */

	// Hero instance getter method
	public static Hero getInstance() {
		return hero;
	} /* end */

} /* END CLASS */
