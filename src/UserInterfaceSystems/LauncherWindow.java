package UserInterfaceSystems;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
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
public class LauncherWindow {
	
	private final JFrame frame = new JFrame();;
	private JPanel panel;
	private JButton launchButton = new JButton();
	private boolean isCharacterCreation = false;
	private boolean isGameSetup = false;

	public LauncherWindow() {
	
		this.frame.setVisible(true);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setSize(500, 500);
		this.frame.setTitle("MECH MASTERS");
		this.frame.setLayout(null);
		this.frame.getContentPane().setBackground(Color.GRAY);
		this.frame.add(launchButton);
		this.frame.setLocationRelativeTo(null);
        
		this.launchButton.setBounds(200, 300, 90, 25);
		this.launchButton.setText("LAUNCH!");
		this.launchButton.setFocusable(false);
	}
	
	public void addLaunchButtonListener(ActionListener listenerForLaunchButton) {
		this.launchButton.addActionListener(listenerForLaunchButton);
	}
	public void addCreateCharacterButtonListener(ActionListener listernerForCreateCharacterButtonButton) {
		JButton createCharacterButton;
		if (this.panel != null) {
			createCharacterButton = (JButton) this.panel.getComponent(2);
			createCharacterButton.addActionListener(listernerForCreateCharacterButtonButton);
		}
	}
	public JPanel getPanel() {
		return this.panel;
	}
	
	public void setJPanel(JPanel inputPanel) {
		this.frame.add(this.panel = inputPanel);
	}
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//	
//		if(e.getSource() == launchButton) {
//////			frame.dispose();
//////			CharacterCreationWindow creationWindow = new CharacterCreationWindow();
//			this.frame.add(this.panel = CharacterCreationPanel.characterCreationPanel());
//			this.frame.remove(launchButton);
//			this.frame.setLayout(new GridBagLayout());
//			this.frame.revalidate();
//			this.frame.repaint();
//			this.isCharacterCreation = true;
//		}
//	}
	
	public String getCharacterNameField() {
		JTextField characterNameField;
		if (this.panel != null) {
			characterNameField = (JTextField) this.panel.getComponent(1);
			return characterNameField.getText();
		}
		else {
			return "None";
		}
	}
	
	public void setFrameTransition() {
		this.frame.remove(launchButton);
		this.frame.setLayout(new GridBagLayout());
		this.frame.revalidate();
		this.frame.repaint();
		this.isCharacterCreation = true;
	}
	
	public boolean getIsCharacterCreation() {
		return this.isCharacterCreation;
	}
	
	public boolean getIsGameSetup() {
		return this.isGameSetup;
	}
	
	public void setIsGameSetup() {
		this.isGameSetup = true;
	}
}