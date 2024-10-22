package UserInterfaceSystems;
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
/**
 * Lead Author(s):
 * 
 * @author Joe DeTone
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 * References: 
 *         <<add more references here>>
 * 
 * Version/date: 0.1 8 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the Launcher GUI window.
 * 
 */
public class LauncherWindow implements ActionListener {
	
	private JFrame frame = new JFrame();
	private JPanel panel = CharacterCreationPanel.characterCreationPanel();
	private JButton launchButton = new JButton();

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