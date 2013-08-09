import java.awt.Color;
import java.awt.Graphics;


public class Player {
	int x;
	int y;
	int xv;
	int yv;
	
		public Player(int startx, int starty) {
			x = startx;
			y = starty;
		}
		
		public void setVelocity(int xvelocity, int yvelocity ) {
			xv = xvelocity;
			yv = yvelocity;		
		}
		
		public void move(){
			x = x + xv;
			y = y + yv;
		}
		public void paint(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(y - 10,y - 10,20,20);
		}
		public void KeyPressed(String key) {
			if (key.equals("left"))	{
				xv = -5;
			}
			if (key.equals("down")) {
				yv = 5;
			}
			if (key.equals("up")) {
				yv= -5;
			}
			if (key.equals("right")){
				xv = 5;
			}
		}
		public void KeyReleased(String key) {
			if (key.equals("left"))	{
				xv = 0;
			}
			if (key.equals("down")) {
				yv = 0;
			}
			if (key.equals("up")) {
				yv = 0;
			}
			if (key.equals("right")){
				xv = 0;
			}
		}
}
