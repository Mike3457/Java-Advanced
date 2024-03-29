import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ericat extends JFrame implements ActionListener { 
	ChatClient client;
	JTextArea area;
	JTextField input;

	public static void main(String[] args) {
		new Ericat();
	}


	public Ericat(){
		super("Ericat chat");
		setSize(new Dimension(400, 600));
		setLayout(new BorderLayout());
		initinalizeComponents();
		setVisible(true);
		
		Timer t = new Timer();
		t.scheduleAtFixedRate(new UpdateTask(), 1000, 500);
	}
	class UpdateTask extends TimerTask {
		@Override
		public void run() {
			String in = client.getInput();
			if (in != null) {
				area.append("\n");
				area.append(in);
			}
		}
		
	}
	private void initinalizeComponents() {
		String ip = JOptionPane.showInputDialog("What's th server's IP address?");
		client = new ChatClient(ip);
		area = new JTextArea(30, 20);
		add(area,BorderLayout.NORTH);
		input = new JTextField(20);
		input.addActionListener(this);
		add(input, BorderLayout.SOUTH);
	}



	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== input) {
			client.sendOutput(input.getText());
			input.setText("");
		}
	}

}


