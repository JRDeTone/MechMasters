package UserInterfaceSystems;
import java.awt.BorderLayout;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LauncherWindow {
	
	private final JFrame frame = new JFrame();;
	private final HashMap<String, JPanel> launcherPanels = GUIComponents.uiPanelsHashMap();
	private final JPanel characterCreationPanel = (JPanel) launcherPanels.get("Character Creation");
	private final JPanel mechCreationPanel = (JPanel) launcherPanels.get("Mech Creation");
	private final JPanel mechHangarPanel = (JPanel) launcherPanels.get("Mech Hangar");
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
		final int CHARACTERPANELBUTTONELEMENT = 2;
		JButton createCharacterButton;
		createCharacterButton = (JButton) characterCreationPanel.getComponent(CHARACTERPANELBUTTONELEMENT);
		createCharacterButton.addActionListener(createCharacterListener);
	}
	
	public void addCreateMechButtonListener(ActionListener creatMechListener) {
		final int MECHPANELBUTTONELEMENT = 6;
		JButton createMechButton = (JButton) mechCreationPanel.getComponent(MECHPANELBUTTONELEMENT);
		createMechButton.addActionListener(creatMechListener);
	}
	
	public String getCharacterNameField() {
		final int CHARACTERNAMEELEMENT = 1;
		JTextField characterName;
		characterName = (JTextField) characterCreationPanel.getComponent(CHARACTERNAMEELEMENT);
		return characterName.getText();
	}
	
	public String getMechTypeField() {
		final int MECHTYPEELEMENT = 2;
		JComboBox<?> comboBox = (JComboBox<?>) mechCreationPanel.getComponent(MECHTYPEELEMENT);
		return (String) comboBox.getSelectedItem();
	}
	
	public String getMechColorField() {
		final int MECHCOLORELEMENT = 4;
		JComboBox<?> comboBox = (JComboBox<?>) mechCreationPanel.getComponent(MECHCOLORELEMENT);
		return (String) comboBox.getSelectedItem();
	}
	
	public String getMechNameField() {
		final int MECHNAMEELEMENT = 5;
		JTextField mechName;
		mechName = (JTextField) mechCreationPanel.getComponent(MECHNAMEELEMENT);
		return mechName.getText();
	}
	
	public void transitionToCharacterCreation() {
		this.frame.add(this.panel = characterCreationPanel);
		this.frame.remove(launchButton);
		this.frame.setLayout(new GridBagLayout());
		this.frame.revalidate();
		this.frame.repaint();
	}
	
	public void transitionToMechCreation() {
		this.frame.remove(this.panel);
		this.frame.add(this.panel = mechCreationPanel);
		this.frame.setLayout(new GridBagLayout());
		this.frame.revalidate();
		this.frame.repaint();
	}
	
	public void transitionToMechHangar() {
		this.frame.remove(this.panel);
		this.frame.setLayout(new BorderLayout());
		this.frame.add(this.panel = mechHangarPanel, BorderLayout.CENTER);
		this.frame.revalidate();
		this.frame.repaint();
	}
}