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
 * Version/date: 0.1 8 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for PanelGenerator.
 * 
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelGenerator {

	public static JPanel characterCreationPanel() {
		
		JPanel characterCreationPanel = new JPanel();
		JLabel helloPilot = new JLabel();
		JButton createCharacterButton = new JButton();
		JTextField characterNameField = new JTextField(14);
	
		characterCreationPanel.setPreferredSize(new Dimension(260, 100));
		characterCreationPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		characterCreationPanel.add(helloPilot);
		characterCreationPanel.add(characterNameField);
		characterCreationPanel.add(createCharacterButton);
	
		helloPilot.setHorizontalAlignment(JLabel.CENTER);
		helloPilot.setText("Hello, Pilot. Please register to begin.");
	
		characterNameField.setHorizontalAlignment(JTextField.CENTER);
	
		createCharacterButton.setText("Register Pilot");
		createCharacterButton.setHorizontalAlignment(JButton.CENTER);
		createCharacterButton.setFocusable(false);
	
	return characterCreationPanel;
	}
	
	public static JPanel mechCreationPanel() {
		String[] mechTypeSelection = {"Light Mech","Medium Mech","Heavy Mech"};
		String[] mechColorSelection = {"Blue","Red","Green","Yellow","White","Black","Purple","Pink"};
		JPanel mechCreationPanel = new JPanel();
		JLabel mechTypeSelectionLabel = new JLabel();
		mechTypeSelectionLabel.setText("Mech Frame: ");
		JLabel mechColorSelectionLabel = new JLabel();
		mechColorSelectionLabel.setText("Mech Frame Color: ");
		JLabel messageToPlayer = new JLabel();
		messageToPlayer.setText("Pilot, please select your frame type, its color, and name your mech.");
		JButton createMechButton = new JButton();
		JComboBox<String> mechTypes = new JComboBox<String>(mechTypeSelection);
		JComboBox<String> mechColor = new JComboBox<String>(mechColorSelection);
		JTextField mechNameField = new JTextField(14);
	
		mechCreationPanel.setPreferredSize(new Dimension(400, 100));
		mechCreationPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		mechCreationPanel.add(messageToPlayer);
		mechCreationPanel.add(mechTypeSelectionLabel);
		mechCreationPanel.add(mechTypes);
		mechCreationPanel.add(mechColorSelectionLabel);
		mechCreationPanel.add(mechColor);
		mechCreationPanel.add(mechNameField);
		mechCreationPanel.add(createMechButton);
	
		mechNameField.setHorizontalAlignment(JTextField.CENTER);
	
		createMechButton.setText("Register Mech");
		createMechButton.setVerticalAlignment(JButton.BOTTOM);
		createMechButton.setHorizontalAlignment(JButton.CENTER);
		createMechButton.setFocusable(false);
	
	return mechCreationPanel;
	}
}
