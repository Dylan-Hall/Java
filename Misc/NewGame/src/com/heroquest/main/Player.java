/**
 * Player.java :: HeroQuest
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
public class Player extends GameObject {

	Handler handler;

	// Player constructor
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);

		this.handler = handler;

	} /* end */

	public Rectangle getBounds() {

		return new Rectangle(dx, dy, 32, 32);
	} /* end */d

	public void tick() {
		dx += velX;
		dy += velY;

		dx = Game.clamp(dx, 0, Game.WIDTH - 38);
		dy = Game.clamp(dy, 0, Game.HEIGHT - 60);

		collision(handler);

	} /* end */

	//collision; handles the collision of enemy and player objects
	private void collision(Handler handler) {
		
		for (int i = 0; i < handler.object.size(); i++) {

			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.BasicEnemy) {
				
				if (getBounds().intersects(tempObject.getBounds())) {
					HUD.HEALTH -= 2;
				}
				
				if(HUD.HEALTH <= 0) {
					handler.object.remove();
				}
			}
		} /* end for */
	} /* end */

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(dx, dy, 32, 32);
	} /* end */

} /* END CLASS */
