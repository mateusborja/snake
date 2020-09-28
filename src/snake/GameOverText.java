package snake;

import static snake.Constants.GAME_OVER_COLOR;
import static snake.Constants.GAME_OVER_LOCATION;
import static snake.Constants.GAME_OVER_TEXT;


public class GameOverText extends Text{

	public GameOverText(int score) {
		super(GAME_OVER_COLOR, String.format(GAME_OVER_TEXT, score), GAME_OVER_LOCATION);
	}

}
