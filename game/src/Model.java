import java.util.ArrayList;



public class Model {
		
		int playerX, playerY;
		int playerXV, playerYV;
		int level = 1;
		
		
		
		Player player;
		ArrayList <Enemy> enemies;
		ArrayList <Obstacle> obstacles;
		
		public Model() {
			player = new Player(250,250);
			enemies = new ArrayList <Enemy> ();
			obstacles = new ArrayList <Obstacle> ();
			
			enemies = new ArrayList <Enemy> ();
			enemies.add(new Enemy(200,300));
			enemies.add(new Enemy(400,100));
			enemies.add(new Enemy(450,400));
			
			obstacles.add(new Obstacle(0, 0, 100, 100));
			obstacles.add(new Obstacle(0, 200, 50, 300));
		}
		
		public Player getPlayer() {
			return player;
		}
		public Enemy getEnemy(int index) {
			return enemies.get(index);
		}
		public Obstacle getObstacle(int index) {
			return obstacles.get(index);
		}
		public int getEnemyCount() {
			return enemies.size();
		}
		public int getObstacleCount(){
			return obstacles.size();
		}
		public int getEnemyX(int index) {
			return enemies.get(index).x;
		}
		
		public int getEnemyY(int index) {
			return enemies.get(index).y;
		}	
	public void setPosition(int x, int y) {
		playerX = x;
		playerY = y;
	}
	
	public void KeyPressed(String key) {
		if (key.equals("left"))	{
			playerXV = -5;
		}
		if (key.equals("down")) {
			playerYV = 5;
		}
		if (key.equals("up")) {
			playerYV = -5;
		}
		if (key.equals("right")){
			playerXV = 5;
		}
	}
	public void KeyReleased(String key) {
		if (key.equals("left"))	{
			playerXV = 0;
		}
		if (key.equals("down")) {
			playerYV = 0;
		}
		if (key.equals("up")) {
			playerYV = 0;
		}
		if (key.equals("right")){
			playerXV = 0;
		}
	}
	public void movePlayer() {
		playerX = playerX +playerXV;
		if (playerX > 490) {
			playerX = 490;
		}
		if (playerX < 10) {
			playerX = 10;
		}	
		playerY = playerY + playerYV;
		if (playerY > 490) {
			playerX = 490;
		}
		if (playerY < 10) {
			playerX = 10;
		}
	}

	public void moveEnemies() {
		for (int i = 0 ; i < enemies.size(); i++){
			
		}	
	}

	
	}


