package snake;

import java.awt.Dimension;
import java.awt.Point;

public class Food extends Shape {
	
	private Direction direction;

	public Food() {
		
		super(Constants.FOOD_COLOR);
		direction = Direction.NONE;
		
		Point location = new Point(Constants.FOOD_START_X, Constants.FOOD_START_Y);
		Dimension dimension = new Dimension(Constants.FOOD_SIZE, Constants.FOOD_SIZE);
		Rect rect = new Rect(location, dimension);
		addRect(rect);
		
	}
	
}