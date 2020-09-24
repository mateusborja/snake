package snake;


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

    private boolean isGameOver() {
        return snake.collidesWithItself();
    }
}