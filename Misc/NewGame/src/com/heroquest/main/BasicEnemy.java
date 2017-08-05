/**
 * BasicEnemy.java :: HeroQuest
 *
 * 		@author: Dylan Hall
 * 		@date: May 28, 2017
 * 		@lang: Java
 */
package com.heroquest.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

//TODO :: Program description
public class BasicEnemy extends GameObject{

	private Handler handler;
	
	public BasicEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		velX = 1;
		velY = 1;
	}
	

	public Rectangle getBounds() {
		
		return new Rectangle(dx, dy, 20, 20);
	} /* end */

	public void tick() {
		dx += velX;
		dy += velY;
		
		if(dy <= 0 || dy >= Game.HEIGHT - 47) {
			velY *= -1;
		}
		
		if(dx <= 0 || dx >= Game.WIDTH - 24) {
			velX *= -1;
		}
		
		handler.addObject(new Trail(dx, dy, ID.Trail, Color.red, 20, 20, (float) 0.06f, handler));

	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(dx, dy, 20, 20);
	}

}
