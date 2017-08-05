/**
 * package-info.java :: HeroQuest
 *
 * 		@author: Dylan Hall
 * 		@date: May 28, 2017
 * 		@lang: Java
 * 
 * This is the Game Class for my HeroQuest style game.
 * I'm learning how to create and maintain game-like functions
 * and methods:
 * 
 * 	Tutorial Videos: https://www.youtube.com/watch?v=0T1U0kbu1Sk
 * 	Tutorial author:  RealTutsGML
 */

package com.heroquest.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

// Game Class; handles the entire game
public class Game extends Canvas implements Runnable {

	// serial Version
	private static final long serialVersionUID = 1647439956382767516L;

	// define width and height
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

	// create a thread for the game to run on
	private Thread thread;

	// create a boolean for running checks
	boolean running = false;

	// Creating Game Object Handler
	private Handler handler;
	
	// Creating Game Object HUD
	private HUD hud;

	// Creating Game object constructor
	public Game() { 

		handler = new Handler();
		this.addKeyListener(new KeyInput(handler));

		new Window(WIDTH, HEIGHT, "HeroQuest", this);
		
		hud = new HUD();

		handler.addObject(new Player((WIDTH/2 - 32),( HEIGHT/2 - 32), ID.Player, handler));
		handler.addObject(new BasicEnemy((WIDTH/2 - 32),( HEIGHT/2 - 32), ID.BasicEnemy, handler));
	} /* end */

	// start; thread start method
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	} /* end */

	// stop; thread stop method
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	} /* end */

	// run; run loop method
	public void run() {

		// assign instant keyboard focus
		this.requestFocus();
		
		// Variables for game loop
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;

		while (running) {

			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				delta--;
			} /* end while */

			if (running) {
				render();
			}

			frames++;

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		} /* end while */

		stop();
	} /* end */

	// render; uses buffer strategy to create game window
	private void render() {

		// Set the buffer strategy
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		// Set the graphic rendering object
		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.lightGray);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		handler.render(g);
		hud.render(g);

		g.dispose();
		bs.show();

	} /* end */

	// Create Tick method
	private void tick() {
		handler.tick();
		hud.tick();
	} /* end */
	
	
	//clamp; make sure player object wont move passed map edges
	public static int clamp(int var, int min, int max) {
		if(var >= max) {
			return var = max;
		} else if(var <= min) {
			return var = min;
		} else {
			return var;
		}
	} /* end */

	public static void main(String args[]) {

		new Game();
	} /* END MAIN */

} /* END CLASS */