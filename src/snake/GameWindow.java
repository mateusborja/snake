package snake;

import java.awt.Color;
import java.awt.Graphics; 

import javax.swing.JFrame;

public class GameWindow extends JFrame { 
	
	private Rect background;
	private Rect rect;
	private Rect rect1;
	private Rect rect2;
	

	public GameWindow() {
		background = new Rect(Color.BLACK, 0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		rect = new Rect(Color.WHITE, 50, 150, 150, 20);
		rect1 = new Rect(Color.WHITE, 100, 150, 600, 20);
			
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
		rect1.paint(g);
	}
}

