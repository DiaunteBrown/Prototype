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

	
	///////////////////////////////////////////////////
	
	
	String screenTracker;
	String[] Screen = {"Title_screen","selection_screen"};
	int screenListIndex=0;
	
	
	
	///////////////////////////////////////////////////
	
	public Panel() {
		addKeyListener(this);
		setBackground(new Color(247, 146, 69));
		setDoubleBuffered(true);
		setFocusable(true);
		screenTracker = "title_screen";
		
		repaint();
		
	}
	
	public void run() {
		repaint();
	}
	
	public void drawSplashPage(Graphics g) {
		//Title Screen//
		g.setColor(Color.blue);
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
		
		if (screenTracker.contentEquals("title_screen"))
			drawSplashPage(g);
		else
			SecondScreen(g);
			//ThirdScreen(g);
		    
		
		
	}
	
	
	public void SecondScreen(Graphics g) {
		//Rubiks Cube Menu//
		
		//Solve Mode//
		g.setColor(Color.blue);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50)); 
		g.drawString("Game Mode", 230, 50 );
		
		g.setFont(new Font("TimesRoman", Font.PLAIN, 30)); 
		//////////////////////////////////////////////
		g.drawString("Beginner", 300, 150);
		
		g.drawString("Intermediate", 300, 250);
		
		g.drawString("Profesional", 300, 350);
		//////////////////////////////////////////////
		//Shopping Cart and Menu Bar//
		g.drawImage(new ImageIcon("src/pictures/Shopping Cart 2.png").getImage(), 650, 10, 100, 100, null);
		g.drawImage(new ImageIcon("src/pictures/Menu Bar.png").getImage(), -50, 0, 150, 100, null);
		//////////////////////////////////////////////
		g.drawRect(300, 350, 100, 100);
		
		
		
		
	}
		
	public void ThirdScreen(Graphics g) {
		
		//Easy Mode//
		g.setColor(Color.blue);
		g.setFont(new Font("TimesRoman", Font.PLAIN,30));
		
		
		
		
		
		
		
		
	}
	

	
	
	@Override
	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode()==KeyEvent.VK_SPACE)
		//screenTracker="Selection_screen";
		screenListIndex++;
		if(screenListIndex==Screen.length)
			screenListIndex=0;
		screenTracker=Screen[screenListIndex];
			
			
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
}
