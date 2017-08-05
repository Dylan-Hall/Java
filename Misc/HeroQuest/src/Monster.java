/**
 * Monster.java :: HeroQuest.java
 * 
 * This is the Monster class for my HeroQuest style game
 * 
 * @author: Dylan Hall
 * @date: 5/27/2017
 * @language: Java
 */

// Monster Class
public class Monster {

	// Monster stats
	boolean hasMagic;
	String desc;
	int damage;
	int health;
	
	// Monster object constructor
	public Monster(boolean hasMagic, String desc, int damage, int health) {
		this.hasMagic = hasMagic;
		this.desc = desc;
		this.damage = damage;
		this.health = health;
	} /* end */
	
} /* END CLASS */

