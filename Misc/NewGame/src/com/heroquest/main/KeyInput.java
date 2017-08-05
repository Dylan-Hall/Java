package com.heroquest.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private Handler handler;

	public KeyInput(Handler handler) {
		this.handler = handler;
	} /* end */

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Player) {
				// key events for player

				if (key == KeyEvent.VK_W) { // up
					tempObject.setVelY(-2);
				} else if (key == KeyEvent.VK_S) { // down
					tempObject.setVelY(2);
				} else if (key == KeyEvent.VK_A) { // left
					tempObject.setVelX(-2);
				} else if (key == KeyEvent.VK_D) { // right
					tempObject.setVelX(2);
				}
			}
		}
		
		if(key == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
		
	} /* end */

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Player) {
				// key events for player

				if (key == KeyEvent.VK_W) { // up
					tempObject.setVelY(0);
				} else if (key == KeyEvent.VK_S) { // down
					tempObject.setVelY(0);
				} else if (key == KeyEvent.VK_A) { // left
					tempObject.setVelX(0);
				} else if (key == KeyEvent.VK_D) { // right
					tempObject.setVelX(0);
				}
			}
		}
	} /* end */
	
} /* END CLASS */
