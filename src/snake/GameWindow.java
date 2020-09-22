package snake;


import java.awt.Color;
import java.awt.Graphics; 

import javax.swing.JFrame;

public class GameWindow extends JFrame { 
	
	private Rect background;
	private Rect rect;

//	
		
	public GameWindow() {
		background = new Rect(Color.BLACK, 0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		rect = new Rect(Color.WHITE, 30, 50, 968, 120);


			
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
	

		
	}
}

