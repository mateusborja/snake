package snake;


import java.awt.Color;
import java.awt.Graphics; 

import javax.swing.JFrame;

public class GameWindow extends JFrame { 
	
	private Rect background;
	private Rect rect;
	private Rect rect1;
	private Rect rect2;
	private Rect rect3;
	private Rect rect4;
	private Rect rect5;
	private Rect rect6;
	private Rect rect7;
	private Rect rect8;
	private Rect rect9;
	private Rect rect10;
//	
		
	public GameWindow() {
		background = new Rect(Color.BLACK, 0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		rect = new Rect(Color.WHITE, 30, 50, 968, 120);
		rect1 = new Rect(Color.WHITE, 100, 50, 50, 50);
		rect2 = new Rect(Color.WHITE, 200,200, 50, 50);
		rect3 = new Rect(Color.WHITE, 250,250, 50, 50);
		rect4 = new Rect(Color.WHITE, 300,300, 50, 50);
		rect5 = new Rect(Color.WHITE, 350,350, 50, 50);
		rect6 = new Rect(Color.WHITE, 400,400, 50, 50);
		rect7 = new Rect(Color.WHITE, 450,450, 50, 50);
		rect8 = new Rect(Color.WHITE, 500,500, 50, 50);
		rect9 = new Rect(Color.WHITE, 550,550, 50, 50);
		rect10 = new Rect(Color.WHITE, 600,600, 50, 50);

			
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setResizable(false);		
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
			
		
			
	}

	@Override
	public void paint(Graphics g) {
		background.paint(g);
		rect.paint(g);
		rect10.paint(g);
	

		
	}
}

