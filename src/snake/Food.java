package snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class Food extends Rect {
	private int eatenTimes;
	
	public Food(Snake snake, Rectangle drawingArea) {
		
		setColor(Color.GREEN);
		setDimension(new Dimension(Constants.FOOD_SIZE, Constants.FOOD_SIZE));
		setRandomLocation(snake, drawingArea);
		
	}
	
	public void setRandomLocation(Snake snake, Rectangle drawingArea) {
		int offset = 3;
		
		do {
			int minX = (int) drawingArea.getMinX() + offset;
			int minY = (int) drawingArea.getMinY() + offset;
			
			int maxX = (int) drawingArea.getMaxX() - Constants.FOOD_SIZE - offset;
			int maxY = (int) drawingArea.getMaxY() - Constants.FOOD_SIZE - offset;
			
			int randomX = GameUtils.random(minX, maxX);
			int randomY = GameUtils.random(minY, maxY);
			
			setLocation(new Point(randomX, randomY));
			
		} while (snake.intersects(this));
		
	}
	
	public void checkIfEaten(Snake snake, Rectangle drawingArea) {
		if (snake.intersects(this)) {
			eatenTimes++;
			setRandomLocation(snake, drawingArea);
//			snake.elongate();
		}
	}
	
	public int getEatenTimes() {
		return eatenTimes;
	}
}