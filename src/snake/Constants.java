package snake;

import java.awt.Color;
import java.awt.Point;

public class Constants {
	
	public static final int WINDOW_WIDTH = 500;
	public static final int WINDOW_HEIGHT = 500;
	public static final String WINDOW_TITLE = "Snake Game!";
	
	public static final Color SNAKE_COLOR = Color.WHITE;
	public static final Color BACKGROUND_COLOR = Color.BLACK;
	
	public static final int SNAKE_START_X = 170;
	public static final int SNAKE_START_Y = 120;
	public static final int SNAKE_PIECE_SIZE = 10;
	
	public static final int SNAKE_INITIAL_SIZE = 20;
	public static final int SNAKE_SIZE_1 = 30;
	
	public static final int FOOD_SIZE = 10;
	
	public static final String GAME_OVER_TEXT = "GAME OVER! %d PONTO(S)";
	public static final Color GAME_OVER_COLOR = Color.RED;
	public static final Point GAME_OVER_LOCATION = new Point(WINDOW_WIDTH / 2 - 100, WINDOW_HEIGHT / 2);

	public static final String SCORE_TITLE = "%d PONTO(S)";
			
	public static final int SLEEP_TIME = 30;
	
}
