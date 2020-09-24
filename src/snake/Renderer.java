package snake;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Renderer {
	private List<Drawable> drawables;
	private Graphics gImage;
	
	public Renderer(Graghics gImage) {
		drawables = new ArrayList<>();
		this.gImage = gImage;
	}
	
	public synchronized void render(Graphics g) {
		for (Drawable d : drawables) {
			gImage.setColor(d.getColor());
			d.draw(gImage);
		}
	}
	
	public void add(Drawable d) {
		drawables.add(d);
	}
	
	public void remove(Drawable d) {
		drawables.remove(d);
	}
}