package snake;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


	@SuppressWarnings("serial")
	public class GameWindow extends JFrame implements KeyListener { 
	private Renderer renderer;
	private Snake snake;
	private Image buffer;
	private Graphics gImage;
	private Rectangle drawingArea;
	private long lastkeyboardEventTime;
	
	
	public GameWindow(Snake snake) {
		this.snake = snake;
//		setUndecorated(true);
		
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setResizable(false);
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addKeyListener(this);
		setVisible(true);
		
		buffer = createImage(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		gImage = buffer.getGraphics();
		renderer = new Renderer(gImage);
		
		defineDrawingArea();
	}
	

	public Renderer getRenderer() {
		return renderer;
	}
	

	@Override
	public void paint(Graphics gScreen) {
		if (gImage == null || renderer == null) {
			return;
			
		}
		
		renderer.render();
		gScreen.drawImage(buffer, 0, 0, null);
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	
}
	
	@Override
	public void keyReleased(KeyEvent e) {
			
	}
	
	private void defineDrawingArea() {
		int upperY = (int) (Constants.WINDOW_HEIGHT - getContentPane().getSize().getHeight());
		drawingArea = new Rectangle(0, upperY, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT - upperY);
	}
	
	public Rectangle getDrawingArea() {
		return drawingArea;
	}
	
	
		
	@Override
	public void keyPressed(KeyEvent e) {
		long now = System.currentTimeMillis();
		
		if (now - lastkeyboardEventTime < 40) {
			return;
			
		}
		
		
		
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			snake.up();
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				snake.down();
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				snake.left();
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				snake.right();
			}  else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
	            System.exit(0);
	        }
		
		lastkeyboardEventTime = now;
	}

	
}

