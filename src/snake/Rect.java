package snake;

import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;


public class Rect extends Drawable {
	private Rectangle rectangle;
	
	public Rect() {
		this.rectangle = new Rectangle(0,0);
	}


	public Rect(Point location, Dimension dimension) {
		this.rectangle = new Rectangle (location, dimension);
		
	}
	
	public Rect(int x, int y, int width, int height) {
		this.rectangle = new Rectangle (x, y, width, height);
	}

	public Point getLocation() {
		return rectangle.getLocation();
				
	}
	
	public void setLocation(Point location) {
		rectangle.setLocation(location);
	}
	
	public Dimension getDimension() {
		return rectangle.getSize();
	}
	
	public void setDimension(Dimension dimension) {
		rectangle.setSize(dimension);
	}
	
	
	public boolean intersects (Rect other) {
		return rectangle.intersects(other.rectangle);
	}
	
	public void elongate() {
		
	}

	public void draw(Graphics g) {
		g.fillRect(
				(int) rectangle.getLocation().getX(),
				(int) rectangle.getLocation().getY(),
				(int) rectangle.getSize().getWidth(),
				(int) rectangle.getSize().getHeight());
	}
		
}
