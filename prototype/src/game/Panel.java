package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
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
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel implements KeyListener,MouseListener {

	
	///////////////////////////////////////////////////
	
	
	String screenTracker;
	String[] Screen = {"Title_screen","selection_screen","easy_mode"};
	int screenListIndex=0;
	///////////////////////////////////////////////////////
	String screenTracker2;
	String[] Screen2 = {"Level 1", "Level 2"};
	
	
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
		////Settings////
		g.drawImage(new ImageIcon("src/pictures/Setting.png").getImage(), 0, 650, 50, 50, null);
		////////////////
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		////////////////////////////////////////////////
		if (screenTracker.contentEquals("title_screen"))
			Title(g);
		
		if (screenTracker.contentEquals("selection_screen"))
			SecondScreen(g);
			
		////////////////////////////////////////////////
		if (screenTracker.contentEquals("easy_mode"))
			LevelSection(g);
		////////////////////////////////////////////////
		
		
		
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
		g.drawImage(new ImageIcon("src/pictures/Setting.png").getImage(), 0, 650, 50, 50, null);
		//////////////////////////////////////////////
		
	}
		
	public void LevelSection(Graphics g) {
		
		//Level section//
		g.setColor(Color.blue);
		g.setFont(new Font("TimesRoman",Font.BOLD,30));
		g.drawString("Level Selection", 300, 50);
		
		g.setFont(new Font("TimesRoman", Font.PLAIN,30));
		g.drawString("Level 1", 350, 150);
		//Cube//
		g.drawImage(new ImageIcon("src/pictures/Cube.png").getImage(), 330, 200, 100, 100, null);
		//Cube//
		g.drawString("Level 2", 350, 350);
		g.drawImage(new ImageIcon("src/pictures/Level 2 cube.png").getImage(), 330, 400, 100, 100, null);
		//Cube2//
		
		g.drawString("Level 3", 350, 550);
		g.drawImage(new ImageIcon("src/pictures/Level 3 cube.png").getImage(), 330, 600, 100, 100, null);
		
		//Back//
		g.draw3DRect(0, 0, 110, 30, false);
		g.drawString("Back", 20, 25);
		g.drawImage(new ImageIcon("src/pictures/Setting.png").getImage(), 0, 650, 50, 50, null);
		
		
		g.drawRect(350, 160, 100, 100);
		
	}
	
	public void Level_1(Graphics g) {
		//Level 1///
		
		//level1//
	}
	
	//////////////////////////////////
	
	
	
	
	
	
	
	
	/////////////////////////////
	
	
	
	
	@Override
	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode()==KeyEvent.VK_SPACE)
		//screenTracker="Selection_screen";
		screenListIndex++;
		if(screenListIndex==Screen.length)
			screenListIndex=2;
		screenTracker=Screen[screenListIndex];
		////////////////////////
		if (k.getKeyCode()==KeyEvent.VK_1)
			screenListIndex++;
		if (screenListIndex==Screen2.length)
			screenListIndex=0;
		screenTracker2=Screen[screenListIndex];
			
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
			System.out.println(e.getLocationOnScreen());
			System.out.println(e.getButton());
		Rectangle rectangle = new Rectangle(350,150, 300, 100);
		if (rectangle.contains(e.getPoint()))  {
			screenTracker=Screen[screenListIndex];
			
			
		}
				
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
