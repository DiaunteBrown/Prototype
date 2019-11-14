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
		setBackground(new Color(64, 64, 64));
		setDoubleBuffered(true);
		setFocusable(true);
		
		repaint();
		
	}
	
	public void run() {
		repaint();
	}
	
	public void drawSplashPage(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.drawImage(new ImageIcon("src/pictures/character.png").getImage(), 300, 300, 200, 200, null);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 36)); 
		g.drawString("Fidgy-Rubiks", 910, 100);
		
		
		
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		drawSplashPage(g);

	}

	@Override
	public void keyPressed(KeyEvent k) {
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
}
