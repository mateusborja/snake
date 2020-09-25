package snake;

import java.awt.Graphics;
import java.awt.Point;

public class Text extends Drawable {
	
	private String text;
	private Point location;

	
	public void draw(Graphics g) {
		g.drawString(text, (int) location.getX(), (int) location.getY() y);
	}
}
