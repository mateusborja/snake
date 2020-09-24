package snake;

import java.awt.Rectangle;

public class Game implements Runnable {
    private GameWindow gameWindow;
    private Renderer renderer;
    private Snake snake;
    private Food food;

    
    public void start() {
        snake = new Snake();
        food = new Food();
        gameWindow = new GameWindow(snake);
        renderer = gameWindow.getRenderer();

        addElementsToScreen();
        new Thread(this).start();
        
    }

    private void addElementsToScreen() {
        renderer.add(new Background());
        renderer.add(snake);
        renderer.add(food);
    }

    @Override
    public void run() {
        do {
            gameWindow.repaint();
            snake.move();
            GameUtils.sleep(30);

          
        } while (!isGameOver());
        
        gameWindow.dispose();
    }
    
    private boolean isSnakeHitBounds() {
    	Rect head = snake.getFirstRect();
    	Rectangle drawingArea = gameWindow.getDrawingArea();
    	
    	int headX = (int) head.getLocation().getX();
    	int headY = (int) head.getLocation().getY();

    	int areaX1 = (int) drawingArea.getMinX();
    	int areaY1 = (int) drawingArea.getMinY() - Constants.SNAKE_PIECE_SIZE;
    	
    	int areaX2 = (int) drawingArea.getMaxX();
    	int areaY2 = (int) drawingArea.getMaxY();
    	
    	if (headX <= areaX1 || headX)

    	
    	
    	
    	
    }

    private boolean isGameOver() {
        return snake.collidesWithItself();
    }
}