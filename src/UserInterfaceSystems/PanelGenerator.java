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
 * Version/date: 0.3 28 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the PanelGenerator class.
 * 
 */
import java.awt.BorderLayout;
import java.awt.Color;
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
 * Version/date: 0.2 16 NOV 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for PanelGenerator.
 * 
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

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
	
	public static JPanel hangarPanel(){
		Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder();
		Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
		Border CompoundBorder = BorderFactory.createCompoundBorder(raisedBevelBorder, loweredBevelBorder);
		
		JPanel hangarMainPanel = new JPanel();
		hangarMainPanel.setLayout(new BorderLayout());
		
		JPanel textRenderPanel = new JPanel();
		JLabel textRender = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		JPanel dataDisplayLeft = new JPanel();
		dataDisplayLeft.setBorder(CompoundBorder);
		dataDisplayLeft.setLayout(new BoxLayout(dataDisplayLeft, BoxLayout.Y_AXIS));
		JLabel leftCharacterName = new JLabel("Character Name");
		JLabel leftMechStatus = new JLabel("Mech Status");
		JLabel leftMechName = new JLabel("Mech Name");
		JLabel leftMechType = new JLabel("Mech Type");
		JLabel leftMechColor = new JLabel("Mech Color");
		JLabel leftMechHealth = new JLabel("Mech Health");
		dataDisplayLeft.add(leftCharacterName);
		dataDisplayLeft.add(leftMechStatus);
		dataDisplayLeft.add(leftMechName);
		dataDisplayLeft.add(leftMechType);
		dataDisplayLeft.add(leftMechColor);
		dataDisplayLeft.add(leftMechHealth);
		
		JPanel dataDisplayRight = new JPanel();
		dataDisplayRight.setBorder(CompoundBorder);
		dataDisplayRight.setLayout(new BoxLayout(dataDisplayRight, BoxLayout.Y_AXIS));
		
		JPanel buttonControlPanel = new JPanel();
		JButton button1 = new JButton("Battle");
		JButton button2 = new JButton("Store");
//		JButton button3 = new JButton("Button");
//		JButton button4 = new JButton("Button");
		JButton button5 = new JButton("Save");
		JButton button6 = new JButton("Load");
		buttonControlPanel.setLayout(new GridLayout(3, 2, 10, 10));
		buttonControlPanel.setBorder(CompoundBorder);
		buttonControlPanel.add(button1);
		buttonControlPanel.add(button2);
//		buttonControlPanel.add(button3);
//		buttonControlPanel.add(button4);
		buttonControlPanel.add(button5);
		buttonControlPanel.add(button6);
		
		hangarMainPanel.add(textRenderPanel, BorderLayout.CENTER);
		hangarMainPanel.add(dataDisplayLeft, BorderLayout.WEST);
		hangarMainPanel.add(dataDisplayRight, BorderLayout.EAST);
		hangarMainPanel.add(buttonControlPanel, BorderLayout.SOUTH);
		textRenderPanel.add(textRender);
		
		return hangarMainPanel;
	}
	
	public static JPanel combatPanel(){
		Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder();
		Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
		Border CompoundBorder = BorderFactory.createCompoundBorder(raisedBevelBorder, loweredBevelBorder);
		
		JPanel combatPanel = new JPanel();
		combatPanel.setLayout(new BorderLayout());
		
		JPanel textRenderPanel = new JPanel();
		JLabel textRender = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		JPanel dataDisplayLeft = new JPanel();
		dataDisplayLeft.setBorder(CompoundBorder);
		dataDisplayLeft.setLayout(new BoxLayout(dataDisplayLeft, BoxLayout.Y_AXIS));
		JLabel leftCharacterName = new JLabel("Character Name");
		JLabel leftMechStatus = new JLabel("Mech Status");
		JLabel leftMechName = new JLabel("Mech Name");
		JLabel leftMechType = new JLabel("Mech Type");
		JLabel leftMechColor = new JLabel("Mech Color");
		JLabel leftMechHealth = new JLabel("Mech Health");
		dataDisplayLeft.add(leftCharacterName);
		dataDisplayLeft.add(leftMechStatus);
		dataDisplayLeft.add(leftMechName);
		dataDisplayLeft.add(leftMechType);
		dataDisplayLeft.add(leftMechColor);
		dataDisplayLeft.add(leftMechHealth);
		
		JPanel dataDisplayRight = new JPanel();
		dataDisplayRight.setBorder(CompoundBorder);
		dataDisplayRight.setLayout(new BoxLayout(dataDisplayRight, BoxLayout.Y_AXIS));
		JLabel rightCharacterName = new JLabel("Character Name");
		JLabel rightMechStatus = new JLabel("Mech Status");
		JLabel rightMechName = new JLabel("Mech Name");
		JLabel rightMechType = new JLabel("Mech Type");
		JLabel rightMechColor = new JLabel("Mech Color");
		JLabel rightMechHealth = new JLabel("Mech Health");
		dataDisplayRight.add(rightCharacterName);
		dataDisplayRight.add(rightMechStatus);
		dataDisplayRight.add(rightMechName);
		dataDisplayRight.add(rightMechType);
		dataDisplayRight.add(rightMechColor);
		dataDisplayRight.add(rightMechHealth);
		
		JPanel buttonControlPanel = new JPanel();
		JButton attackButton = new JButton("Attack");
		JButton defendButton = new JButton("Defend");
		JButton specialButton = new JButton("Special Action");
		JButton inventoryButton = new JButton("Inventory");
		JButton surrenderButton = new JButton("Surrender");
		JButton reload = new JButton("Reload");
		buttonControlPanel.setLayout(new GridLayout(3, 2, 10, 10));
		buttonControlPanel.setBorder(raisedBevelBorder);
		buttonControlPanel.add(attackButton);
		buttonControlPanel.add(defendButton);
		buttonControlPanel.add(reload);
		buttonControlPanel.add(specialButton);
		buttonControlPanel.add(inventoryButton);
		buttonControlPanel.add(surrenderButton);
		
		combatPanel.add(textRenderPanel, BorderLayout.CENTER);
		combatPanel.add(dataDisplayLeft, BorderLayout.WEST);
		combatPanel.add(dataDisplayRight, BorderLayout.EAST);
		combatPanel.add(buttonControlPanel, BorderLayout.SOUTH);
		textRenderPanel.add(textRender);
		
		return combatPanel;
	}
}
