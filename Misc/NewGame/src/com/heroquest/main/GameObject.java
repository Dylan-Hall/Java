/**
 * package-info.java :: HeroQuest
 *
 * 		@author: Dylan Hall
 * 		@date: May 28, 2017
 * 		@lang: Java
 * 
 * This is the GameObject Class for my HeroQuest style game.
 * I'm learning how to create and maintain game-like functions
 * and methods:
 * 
 * 	Tutorial Videos: https://www.youtube.com/watch?v=0T1U0kbu1Sk
 * 	Tutorial author:  RealTutsGML
 */ 
package com.heroquest.main;

import java.awt.Graphics;
import java.awt.Rectangle;

// Abstract class handling Game Objects
public abstract class GameObject {

	// Game Object variables
	protected int velX, velY;
	protected int dx, dy;
	protected ID id;
	
	// GameObject constructor
	public GameObject(int x, int y, ID id) {
		this.dx = x;
		this.dy = y;
		this.id = id;
	} /* end */
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	
	// Public Setters
	//---------------------------------
	public void setDx(int x) {
		this.dx = x;
	} /* end */
	
	public void setDy(int y) {
		this.dy = y;
	} /* end */
	
	public void setId(ID id) {
		this.id = id;
	} /* end */
	
	public void setVelX(int velX) {
		this.velX = velX;
	} /* end */
	
	public void setVelY(int velY) {
		this.velY = velY;
	} /* end */
	
	// Public Getters 
	//---------------------------------
	public int getDx() {
		return dx;
	} /* end */
	
	public int getDy() {
		return dy;
	} /* end */
	
	public ID getId() {
		return id;
	} /* end */
	
	public int getVelX() {
		return velX;
	} /* end */
	
	public int getVelY() {
		return velY;
	} /* end */
	//---------------------------------

} /* END CLASS */
