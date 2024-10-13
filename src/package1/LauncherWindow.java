package package1;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LauncherWindow implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = CharacterCreationPanel.characterCreationPanel();
	JButton launchButton = new JButton();

	public LauncherWindow() {
	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setTitle("MECH MASTERS");
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.add(launchButton);
        frame.setLocationRelativeTo(null);
        
        launchButton.setBounds(200, 300, 90, 25);
		launchButton.setText("LAUNCH!");
		launchButton.setFocusable(false);
		launchButton.addActionListener(this);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == launchButton) {
//			frame.dispose();
//			CharacterCreationWindow creationWindow = new CharacterCreationWindow();
			frame.add(panel);
			frame.remove(launchButton);
			frame.setLayout(new GridBagLayout());
			frame.revalidate();
			frame.repaint();
		}
	}
}