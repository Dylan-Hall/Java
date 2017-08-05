/**
 * package-info.java :: HeroQuest
 *
 * 		@author: Dylan Hall
 * 		@date: May 28, 2017
 * 		@lang: Java
 * 
 * This is the Window Class for my HeroQuest style game.
 * I'm learning how to create and maintain game-like functions
 * and methods:
 * 
 * 	Tutorial Videos: https://www.youtube.com/watch?v=0T1U0kbu1Sk
 * 	Tutorial author:  RealTutsGML
 */

package com.heroquest.main;

// Standard Imports
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends Canvas {

	// Serial Version
	private static final long serialVersionUID = -987954798807923326L;

	public Window(int width, int height, String title, Game game) {
		JFrame frame = new JFrame(title);
		
		// Setting up the games Frame default sizez
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		// Setting up the games default dynamics
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(game);
		game.start();

	} /* end */

} /* END CLASS */
