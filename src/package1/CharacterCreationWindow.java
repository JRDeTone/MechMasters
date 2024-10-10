package package1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CharacterCreationWindow {
	
	JButton button = new JButton();
	JFrame frame = new JFrame();
	
	public CharacterCreationWindow() {
		
		button.setBounds(200, 300, 90, 25);
		button.setText("LAUNCH!");
		button.setFocusable(false);
	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setTitle("MECH MASTERS");
		frame.setLayout(null);
		frame.add(button);
	}

}
