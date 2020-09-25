package snake;

import java.awt.Color;

public class GameOverText extends Text{
	
	public GameOvetText(int score) {
		super(GAME_OVER_COLOR, String.format(GAME_OVER_TEXT, score), GAME_OVER_LOCATION);
	}
	

}
