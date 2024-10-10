package package1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LauncherWindow implements ActionListener {
	
	JButton button = new JButton();
	JFrame frame = new JFrame();
	
	public LauncherWindow() {
		
		button.setBounds(200, 300, 90, 25);
		button.setText("LAUNCH!");
		button.setFocusable(false);
		button.addActionListener(this);
	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setTitle("MECH MASTERS");
		frame.setLayout(null);
		frame.add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == button) {
			frame.dispose();
			CharacterCreationWindow creationWindow = new CharacterCreationWindow();
		}
	}
}