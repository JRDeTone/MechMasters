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
 * Version/date: 0.3.5 16 NOV 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the LauncherWindow class.
 * 
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		final int CHARACTER_PANEL_BUTTON_ELEMENT = 2;
		JButton createCharacterButton;
		createCharacterButton = (JButton) characterCreationPanel.getComponent(CHARACTER_PANEL_BUTTON_ELEMENT);
		createCharacterButton.addActionListener(createCharacterListener);
	}
	
	public void addCreateMechButtonListener(ActionListener creatMechListener) {
		final int MECH_PANEL_BUTTON_ELEMENT = 6;
		JButton createMechButton = (JButton) mechCreationPanel.getComponent(MECH_PANEL_BUTTON_ELEMENT);
		createMechButton.addActionListener(creatMechListener);
	}
	
	public void addSaveGameButtonListener(ActionListener saveGameListener) {
		final int BUTTON_CONTROL_PANEL_ELEMENT = 3;
		final int SAVE_GAME_BUTTON_ELEMENT = 2;
		JPanel buttonControlPanel = (JPanel) mechHangarPanel.getComponent(BUTTON_CONTROL_PANEL_ELEMENT);
		JButton saveGameButton = (JButton) buttonControlPanel.getComponent(SAVE_GAME_BUTTON_ELEMENT);
		saveGameButton.addActionListener(saveGameListener);
	}
	
	public void addLoadGameButtonListener(ActionListener loadGameListener) {
		final int BUTTON_CONTROL_PANEL_ELEMENT = 3;
		final int LOAD_GAME_BUTTON_ELEMENT = 3;
		JPanel buttonControlPanel = (JPanel) mechHangarPanel.getComponent(BUTTON_CONTROL_PANEL_ELEMENT);
		JButton loadGameButton = (JButton) buttonControlPanel.getComponent(LOAD_GAME_BUTTON_ELEMENT);
		loadGameButton.addActionListener(loadGameListener);
	}
	
	public String getCharacterNameField() {
		final int CHARACTER_NAME_ELEMENT = 1;
		JTextField characterName;
		characterName = (JTextField) characterCreationPanel.getComponent(CHARACTER_NAME_ELEMENT);
		return characterName.getText();
	}
	
	public String getMechTypeField() {
		final int MECH_TYPE_ELEMENT = 2;
		JComboBox<?> comboBox = (JComboBox<?>) mechCreationPanel.getComponent(MECH_TYPE_ELEMENT);
		return (String) comboBox.getSelectedItem();
	}
	
	public String getMechColorField() {
		final int MECH_COLOR_ELEMENT = 4;
		JComboBox<?> comboBox = (JComboBox<?>) mechCreationPanel.getComponent(MECH_COLOR_ELEMENT);
		return (String) comboBox.getSelectedItem();
	}
	
	public String getMechNameField() {
		final int MECH_NAME_ELEMENT = 5;
		JTextField mechName;
		mechName = (JTextField) mechCreationPanel.getComponent(MECH_NAME_ELEMENT);
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
	
	public void transitionToMechHangar(String playerName, String mechName, String mechColor, String mechType, String mechHealth) {
		this.frame.remove(this.panel);
		this.frame.setLayout(new BorderLayout());
		JPanel tempPanel = (JPanel) mechHangarPanel.getComponent(1);
		JLabel tempLabel = (JLabel) tempPanel.getComponent(0);
		tempLabel.setText(playerName);
		tempLabel = (JLabel) tempPanel.getComponent(2);
		tempLabel.setText(mechName);
		tempLabel = (JLabel) tempPanel.getComponent(3);
		tempLabel.setText(mechColor);
		tempLabel = (JLabel) tempPanel.getComponent(4);
		tempLabel.setText(mechType);
		tempLabel = (JLabel) tempPanel.getComponent(5);
		tempLabel.setText(mechHealth);
		this.frame.add(this.panel = mechHangarPanel, BorderLayout.CENTER);
		this.frame.revalidate();
		this.frame.repaint();
	}
	
	public void loadStateUIRefresh() {
		//Might do something with this later, but just calling transitionToMechHangar again works fine for now.
	}
}