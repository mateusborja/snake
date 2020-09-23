package snake;

import java.awt.Dimension;
import java.awt.Point;

public class Application {
	
	public static void main(String[] args) {
		new GameWindow();
		Game g = new Game();
		g.start();
	}
	
}