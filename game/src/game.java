import javax.swing.JFrame;


public class game extends JFrame {
	
	public static void main(String[] args) {
		new game();
	}
	
	public game() {
		super("The world's hardest game");
		View view = new View();
		add(view);
		addKeyListener(view.control);
		setSize(view.getSize());
		setVisible(true);
		setResizable(false);
	}
}
