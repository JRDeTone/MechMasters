package UserInterfaceSystems;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
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
 * Provides fields and methods for Character Creation Panel GUI element.
 * 
 */
public class CharacterCreationPanel {
	
	static public JPanel characterCreationPanel() {
	
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
}
