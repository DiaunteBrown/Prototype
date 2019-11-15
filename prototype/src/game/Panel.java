package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel implements KeyListener {

	
	public Panel() {
		addKeyListener(this);
		setBackground(new Color(0, 0, 0));
		setDoubleBuffered(true);
		setFocusable(true);
		
		repaint();
		
	}
	
	public void run() {
		repaint();
	}
	
	public void drawSplashPage(Graphics g) {
		//Title Screen//
		g.setColor(Color.red);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 90)); 
		//Title//
		g.drawString("Fidgy-Rubiks", 150, 250);
		//Loading Bar Place holder//
		g.fillRect(330, 365, 60, 20);
		g.drawRect(330, 365, 150, 20);
		//Loading//
		g.setFont(new Font("TimesRoman", Font.PLAIN, 30)); 
		g.drawString("Loading...",350,350);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//drawSplashPage(g);
		SecondScreen(g);
	}
	public void SecondScreen(Graphics g) {
		//Rubiks Cube Menu//
		
		g.setColor(Color.red);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50)); 
		g.drawString("Game Mode", 230, 50 );
		
		g.setFont(new Font("TimesRoman", Font.PLAIN, 30)); 

		g.drawString("Beginner", 300, 150);
		
		g.drawString("Intermediate", 300, 250);
		
		g.drawString("Profesional", 300, 350);
		
		g.drawImage(new ImageIcon("src/pictures/Shopping Cart 2.png").getImage(), 650, 10, 200, 100, null);
		g.drawImage(new ImageIcon("src/pictures/Menu Bar.png").getImage(), -50, 0, 150, 100, null);
		
		
	}
	

	@Override
	public void keyPressed(KeyEvent k) {
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
}
