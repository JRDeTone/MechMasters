package UserInterfaceSystems;
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
 * Version/date: 0.3 8 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the LauncherWindow class.
 * 
 */
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LauncherWindow {
	
	private final JFrame frame = new JFrame();;
	private final HashMap<String, JPanel> launcherPanels = GUIComponents.uiPanels();
	private JPanel characterCreationPanel = (JPanel) launcherPanels.get("Character Creation");
	private JPanel panel;
	private JButton launchButton = new JButton();

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
	
	public void addLaunchButtonListener(ActionListener launcherListener) {
		this.launchButton.addActionListener(launcherListener);
	}
	
	public void addCreateCharacterButtonListener(ActionListener createCharacterListener) {
		final int BUTTONELEMENT = 2;
		JButton createCharacterButton;
		createCharacterButton = (JButton) characterCreationPanel.getComponent(BUTTONELEMENT);
		createCharacterButton.addActionListener(createCharacterListener);
	}
	
	public JPanel getPanel() {
		return this.panel;
	}
	
	public void setPanelCharacterCreation() {
		this.frame.add(this.panel = characterCreationPanel);
	}
	
	public String getCharacterNameField() {
		final int TEXTFIELDELEMENT = 1;
		JTextField name;
		name = (JTextField) characterCreationPanel.getComponent(TEXTFIELDELEMENT);
		return name.getText();
	}
	
	public void setFrameTransition() {
		this.frame.remove(launchButton);
		this.frame.setLayout(new GridBagLayout());
		this.frame.revalidate();
		this.frame.repaint();
	}
}