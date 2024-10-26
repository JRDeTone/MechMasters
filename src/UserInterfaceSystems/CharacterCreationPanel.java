package UserInterfaceSystems;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
//
//	private static final long serialVersionUID = 6389034770660527825L;
//	private JPanel characterCreationPanel = new JPanel();
//	private JLabel helloPilot = new JLabel();
//	private JButton createCharacterButton = new JButton();
//	private JTextField characterNameField = new JTextField(14);
//	
//	public CharacterCreationPanel() {
//
//	this.characterCreationPanel.setPreferredSize(new Dimension(260, 100));
//	this.characterCreationPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
//	this.characterCreationPanel.add(helloPilot);
//	this.characterCreationPanel.add(characterNameField);
//	this.characterCreationPanel.add(createCharacterButton);
//
//	this.helloPilot.setHorizontalAlignment(JLabel.CENTER);
//	this.helloPilot.setText("Hello, Pilot. Please register to begin.");
//
//	this.characterNameField.setHorizontalAlignment(JTextField.CENTER);
//
//	this.createCharacterButton.setText("Register Pilot");
//	this.createCharacterButton.setHorizontalAlignment(JButton.CENTER);
//	this.createCharacterButton.setFocusable(false);
//	
//	}
	
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
//	
//	public String getCharacterNameField() {
//		return characterNameField.getText();
//	}
//	
//	public void setCharacterNameField(String characterName) {
//		characterNameField.setText(characterName);		
//	}
//	
//	public void addCreateCharacterListener(ActionListener listenForCharacterButton) {
//		createCharacterButton.addActionListener(listenForCharacterButton);
//	}
}
