
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Controller implements KeyListener, ActionListener {
	Model model;
	View view;

	public Controller(View v) {
		model = new Model();
		view = v;
	}
	
	public Player getPlayer() {
		return model.getPlayer();
	}
	
	public int getPlayerX() {
		return model.playerX;
	}
	
	public Obstacle getObsatcle(int index){
		return model.getObstacle(index);
	}
	
	public Enemy getEnemy(int index){
		return model.getEnemy(index);
	}
	
	public int getEnemyCount() {
		return model.getEnemyCount();
	}
	public int getObstacleCount(){
		return model.getObstacleCount();
	}
	public int getPlayerX1() {
		return model.playerX;
	}
	public int getPlayerY() {
		return model.playerY;
	}


	public int getEnemyX(int index){
		return model.getEnemyX(index);
	}

	public int getEnemyY(int index){
		return model.getEnemyY(index);
	}

	public void move() {
		model.movePlayer();
		model.moveEnemies();
	}
@Override
public void actionPerformed(ActionEvent e) {

}		
@Override
public void keyPressed(KeyEvent e) {
	if (e.getKeyCode()==KeyEvent.VK_UP){
		model.KeyPressed("up");
	}
	if (e.getKeyCode()==KeyEvent.VK_DOWN){
		model.KeyPressed("down");
	}
	if (e.getKeyCode()==KeyEvent.VK_LEFT){
		model.KeyPressed("left");
	}
	if (e.getKeyCode()==KeyEvent.VK_RIGHT){
		model.KeyPressed("right");
	}
	view.repaint();	


}


@Override
public void keyReleased(KeyEvent e) {
	if (e.getKeyCode()==KeyEvent.VK_UP){
		model.KeyReleased("up");
	}
	if (e.getKeyCode()==KeyEvent.VK_DOWN){
		model.KeyReleased("down");
	}
	if (e.getKeyCode()==KeyEvent.VK_LEFT){
		model.KeyReleased("left");
	}
	if (e.getKeyCode()==KeyEvent.VK_RIGHT){
		model.KeyReleased("right");
	}
	view.repaint();


}

@Override
public void keyTyped(KeyEvent e) {


}

}
