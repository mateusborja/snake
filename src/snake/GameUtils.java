package snake;

import java.util.List;

public class GameUtils {
	
	public static void sleep(int millis) {
		
			try {
				Thread.sleep(millis);
				
			} catch (InterruptedException e) { 
		}
	}
	
	public static void moveRects(List<Rect> rects) {
		for (int i = rects.size() - 1; i >= 1; i--) {
			rects.set(i, rects.get(i -1));
		}
	}
	
	public static int random(int min, int max) {
		return(int) (Math.random() * (max - min + 1)) + min;

	}
}
