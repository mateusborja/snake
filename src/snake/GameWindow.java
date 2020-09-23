package snake;

import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.JFrame;
import javax.swing.Renderer;

public class GameWindow extends JFrame { 
	private Renderer renderer;
	
	public GameWindow() {
		renderer = new Renderer();
		
		Background background = new Background();
		renderer.add(background);
			
		Snake snake = new Snake();
		renderer.add(snake);

		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setResizable(false);		
		setVisible(true);
	}

	public Renderer getRenderer() {
		return renderer;
		
	}


	
	@Override
	public void draw(Graphics g) {
		renderer.render(g);
	}
}

