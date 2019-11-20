package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel implements KeyListener,MouseListener {

	
	///////////////////////////////////////////////////
	
	
	String screenTracker;
	String[] Screen = {"Title_screen","selection_screen"};
	int screenListIndex=0;
	
	
	
	///////////////////////////////////////////////////
	
	public Panel() {
		addKeyListener(this);
		addMouseListener(this);
		setBackground(new Color(247, 146, 69));
		setDoubleBuffered(true);
		setFocusable(true);
		screenTracker = "title_screen";
		
		repaint();
		
	}
	
	public void run() {
		repaint();
	}
	
	public void Title(Graphics g) {
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
			Title(g);
		else
			//SecondScreen(g);
			ThirdScreen(g);
		
		
		
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
		//g.drawString(str, x, y);//
		g.drawString("Intermediate", 300, 250);
		
		g.drawString("Profesional", 300, 350);
		//////////////////////////////////////////////
		//Shopping Cart and Menu Bar//
		g.drawImage(new ImageIcon("src/pictures/Shopping Cart 2.png").getImage(), 650, 10, 100, 100, null);
		g.drawImage(new ImageIcon("src/pictures/Menu Bar.png").getImage(), -50, 0, 150, 100, null);
		//////////////////////////////////////////////
		
	}
		
	public void ThirdScreen(Graphics g) {
		
		//Level section//
		g.setColor(Color.blue);
		g.setFont(new Font("TimesRoman",Font.BOLD,30));
		g.drawString("Level Selection", 300, 50);
		
		g.setFont(new Font("TimesRoman", Font.PLAIN,30));
		g.drawString("Level 1", 350, 150);
		//Cube//
		//g.draw3DRect(x, y, width, height, raised);
		//g.drawLine(x1, y1, x2, y2);
		
		g.drawLine(350, 175, 500, 141);
		
		g.drawLine(500, 175, 150, 0);
		g.draw3DRect(350, 175, 150, 150, true);
		
		g.drawString("Level 2", 350, 350);
		g.drawString("Level 3", 350, 550);
		
		
		
		
		
		
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
			System.out.println(e.getLocationOnScreen());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
