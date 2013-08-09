import java.awt.Color;
import java.awt.Graphics;


public class Obstacle {
	int x,y;
	int width, height;
	
	public Obstacle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x - 10, x - 10, 20, 20);
	}
		
	}

