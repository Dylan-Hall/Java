/**
 * HUD.java :: HeroQuest
 *
 * 		@author: Dylan Hall
 * 		@date: May 28, 2017
 * 		@lang: Java
 */
package com.heroquest.main;

import java.awt.Color;
import java.awt.Graphics;

//TODO :: Program description
public class HUD {

	public static int HEALTH = 100;
	
	public void tick() {		
		HEALTH = Game.clamp(HEALTH, 0, 100);
	} /* end */
	
	//render; render HUD display
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(15, 15, 200, 32);
		g.setColor(Color.green);
		g.fillRect(15, 15, HEALTH * 2, 32);
		g.setColor(Color.white);
		g.drawRect(15, 15, 200, 32);
	} /* end */

} /* END */
