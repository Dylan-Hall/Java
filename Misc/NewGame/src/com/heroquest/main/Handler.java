/**
 * package-info.java :: HeroQuest
 *
 * 		@author: Dylan Hall
 * 		@date: May 28, 2017
 * 		@lang: Java
 * 
 * This is the Handler Class for my HeroQuest style game.
 * I'm learning how to create and maintain game-like functions
 * and methods:
 * 
 * 	Tutorial Videos: https://www.youtube.com/watch?v=0T1U0kbu1Sk
 * 	Tutorial author:  RealTutsGML
 */
package com.heroquest.main;

import java.awt.Graphics;
import java.util.LinkedList;

// Game Handler class
public class Handler {

	// Define a linked list for game objects
	LinkedList<GameObject> object = new LinkedList<GameObject>();

	//tick; game fps in the run loop
	public void tick() {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);

			tempObject.tick();
		}
	} /* end */

	//render; renders game graphics in the run loop
	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);

			tempObject.render(g);
		}
	} /* end */
	
	//addObject; adds an object to the list
	public void addObject(GameObject object) {
		this.object.add(object);
	} /* end */
	
	//removeObject; removes an object from the list
	public void removeObject(GameObject object) {
		this.object.remove(object);
	} /* end */
	
} /* END CLASS */
