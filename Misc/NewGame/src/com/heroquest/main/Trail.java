/**
 * Trail.java :: HeroQuest
 *
 * 		@author: Dylan Hall
 * 		@date: May 28, 2017
 * 		@lang: Java
 */
package com.heroquest.main;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

//TODO :: Program description
public class Trail extends GameObject {

	private float alpha = 1;
	private Handler handler;
	private Color color;
	private int width, height;
	private float trailParticleLife;
	
	public Trail(int x, int y, ID id, Color color, int width, int height, float life, Handler handler) {
		super(x, y, id);
		this.color = color;
		this.width = width;
		this.height = height;
		this.handler = handler;
		this.trailParticleLife = life;
	} /* end */

	public void tick() {
		if(alpha > trailParticleLife) {
			alpha -= (trailParticleLife - 0.001f);
		} else {
			handler.removeObject(this);
		}
	} /* end */

	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setComposite(makeTransparent(alpha));
		
		g.setColor(color);
		g.fillRect(dx, dy, width, height);
		
		g2d.setComposite(makeTransparent(1));
	} /* end */
	
	private AlphaComposite makeTransparent(float alpha) {
		int type = AlphaComposite.SRC_OVER;
		return AlphaComposite.getInstance(type, alpha);
	} /* end */

	public Rectangle getBounds() {
		return null;
	} /* end */


}
