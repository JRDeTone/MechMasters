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
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
	private final JPanel combatPanel = (JPanel) launcherPanels.get("Combat");
	private JPanel panel;
	private JPanel titlePanel = new JPanel();
	private JButton launchButton = new JButton();
	private JLabel titleLabel = new JLabel();
	
	public LauncherWindow() {
		this.frame.setTitle("MECH MASTERS");
		this.frame.setVisible(true);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setSize(750, 500);
		this.frame.setLocationRelativeTo(null);
		this.frame.getContentPane().setBackground(Color.GRAY);
		this.frame.setLayout(new GridBagLayout());
		this.frame.add(panel = titlePanel);
		
		this.titlePanel.setBackground(Color.GRAY);
		this.titlePanel.setPreferredSize(new Dimension(500, 200));
		this.titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.titlePanel.add(titleLabel);
		this.titlePanel.add(launchButton);
		
		this.titleLabel.setHorizontalAlignment(JLabel.CENTER);
		this.titleLabel.setText("MECH MASTERS");
		Font titleLabelFont = new Font("DejaVu Sans", Font.BOLD, 60);
		this.titleLabel.setFont(titleLabelFont);
		
		this.launchButton.setText("LAUNCH!");
		this.launchButton.setHorizontalAlignment(JButton.CENTER);
		this.launchButton.setFocusable(false);
	}
	
	public void addCreateLaunchButtonListener(ActionListener launcherListener) {
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
	
	public void addCreateBattleButtonListener(ActionListener BattleListener) {
		final int BATTLE_BUTTON_ELEMENT = 0;
		final int BUTTONS_PANEL_ELEMENT = 3;
		JPanel hangarButtonsPanel = (JPanel) mechHangarPanel.getComponent(BUTTONS_PANEL_ELEMENT);
 		JButton createBattleButton = (JButton) hangarButtonsPanel.getComponent(BATTLE_BUTTON_ELEMENT);
		createBattleButton.addActionListener(BattleListener);
	}
	
	public void addCreateSaveGameButtonListener(ActionListener saveGameListener) {
		final int BUTTON_CONTROL_PANEL_ELEMENT = 3;
		final int SAVE_GAME_BUTTON_ELEMENT = 2;
		JPanel buttonControlPanel = (JPanel) mechHangarPanel.getComponent(BUTTON_CONTROL_PANEL_ELEMENT);
		JButton saveGameButton = (JButton) buttonControlPanel.getComponent(SAVE_GAME_BUTTON_ELEMENT);
		saveGameButton.addActionListener(saveGameListener);
	}
	
	public void addCreateLoadGameButtonListener(ActionListener loadGameListener) {
		final int BUTTON_CONTROL_PANEL_ELEMENT = 3;
		final int LOAD_GAME_BUTTON_ELEMENT = 3;
		JPanel buttonControlPanel = (JPanel) mechHangarPanel.getComponent(BUTTON_CONTROL_PANEL_ELEMENT);
		JButton loadGameButton = (JButton) buttonControlPanel.getComponent(LOAD_GAME_BUTTON_ELEMENT);
		loadGameButton.addActionListener(loadGameListener);
	}
	
	public void addAttackButtonListener(ActionListener attackListener) {
		final int BUTTON_CONTROL_PANEL_ELEMENT = 3;
		final int ATTACK_BUTTON_ELEMENT = 0;
		JPanel buttonControlPanel = (JPanel) combatPanel.getComponent(BUTTON_CONTROL_PANEL_ELEMENT);
		JButton loadGameButton = (JButton) buttonControlPanel.getComponent(ATTACK_BUTTON_ELEMENT);
		loadGameButton.addActionListener(attackListener);
	}
	
	public void addDefendButtonListener(ActionListener defendListener) {
		final int BUTTON_CONTROL_PANEL_ELEMENT = 3;
		final int DEFEND_BUTTON_ELEMENT = 1;
		JPanel buttonControlPanel = (JPanel) combatPanel.getComponent(BUTTON_CONTROL_PANEL_ELEMENT);
		JButton loadGameButton = (JButton) buttonControlPanel.getComponent(DEFEND_BUTTON_ELEMENT);
		loadGameButton.addActionListener(defendListener);
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
		this.frame.remove(this.panel);
		this.frame.add(this.panel = characterCreationPanel);
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
	
	public void transitionToMechHangar(String playerName, String mechName, String mechColor, 
										String mechType, String mechArmorAmount) {
		this.frame.remove(this.panel);
		this.frame.setLayout(new BorderLayout());
		JPanel tempPanel;
		JLabel tempLabel;
		
		tempPanel = (JPanel) mechHangarPanel.getComponent(1);
		tempLabel = (JLabel) tempPanel.getComponent(0);
		tempLabel.setText(playerName);
		tempLabel = (JLabel) tempPanel.getComponent(2);
		tempLabel.setText(mechName);
		tempLabel = (JLabel) tempPanel.getComponent(3);
		tempLabel.setText(mechColor);
		tempLabel = (JLabel) tempPanel.getComponent(5);
		tempLabel.setText(mechType);
		tempLabel = (JLabel) tempPanel.getComponent(6);
		tempLabel.setText(mechArmorAmount);
		
		tempPanel = (JPanel) combatPanel.getComponent(1);
		tempLabel = (JLabel) tempPanel.getComponent(0);
		tempLabel.setText(playerName);
		tempLabel = (JLabel) tempPanel.getComponent(2);
		tempLabel.setText(mechName);
		tempLabel = (JLabel) tempPanel.getComponent(3);
		tempLabel.setText(mechColor);
		tempLabel = (JLabel) tempPanel.getComponent(5);
		tempLabel.setText(mechType);
		tempLabel = (JLabel) tempPanel.getComponent(6);
		tempLabel.setText(mechArmorAmount);
		
		this.frame.add(this.panel = mechHangarPanel, BorderLayout.CENTER);
		this.frame.revalidate();
		this.frame.repaint();
	}
	
	public void transitionBackToHangar() {
		this.frame.remove(this.panel);
		this.frame.add(this.panel = mechHangarPanel, BorderLayout.CENTER);
		this.frame.revalidate();
		this.frame.repaint();
	}
	
	public void transitionToBattle(String enemyName, String mechName, String mechColor, 
									String mechType, String mechArmorAmount) {
		this.frame.remove(this.panel);
		
		JPanel tempPanel;
		JLabel tempLabel;
		
		tempPanel = (JPanel) combatPanel.getComponent(2);
		tempLabel = (JLabel) tempPanel.getComponent(0);
		tempLabel.setText(enemyName);
		tempLabel = (JLabel) tempPanel.getComponent(2);
		tempLabel.setText(mechName);
		tempLabel = (JLabel) tempPanel.getComponent(3);
		tempLabel.setText(mechColor);
		tempLabel = (JLabel) tempPanel.getComponent(5);
		tempLabel.setText(mechType);
		tempLabel = (JLabel) tempPanel.getComponent(6);
		tempLabel.setText(mechArmorAmount);
		
		this.frame.add(this.panel = combatPanel, BorderLayout.CENTER);
		this.frame.revalidate();
		this.frame.repaint();
	}
	
	public void updateMechArmorAmountCombatDisplay(String mechArmorAmount) {
		JPanel tempPanel;
		JLabel tempLabel;
		
		tempPanel = (JPanel) combatPanel.getComponent(1);
		tempLabel = (JLabel) tempPanel.getComponent(6);
		tempLabel.setText(mechArmorAmount);
		this.panel.revalidate();
		this.panel.repaint();
	}
	
	public void updateMechArmorAmountCombatDisplayEnemy(String mechArmorAmount) {
		JPanel tempPanel;
		JLabel tempLabel;
		
		tempPanel = (JPanel) combatPanel.getComponent(2);
		tempLabel = (JLabel) tempPanel.getComponent(6);
		tempLabel.setText(mechArmorAmount);
		this.panel.revalidate();
		this.panel.repaint();
	}
	
	public void updateMechArmorAmountHangarDisplay(String mechArmorAmount) {
		JPanel tempPanel;
		JLabel tempLabel;
		
		tempPanel = (JPanel) mechHangarPanel.getComponent(1);
		tempLabel = (JLabel) tempPanel.getComponent(6);
		tempLabel.setText(mechArmorAmount);
		this.panel.revalidate();
		this.panel.repaint();
	}
	
	public void loadStateUIRefresh() {
		//Might do something with this later, but just calling transitionToMechHangar again works fine for now.
	}
}