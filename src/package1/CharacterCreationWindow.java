package package1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CharacterCreationWindow implements ActionListener{
	
	JLabel helloPilot = new JLabel();
	JButton createCharacterButton = new JButton();
	JTextField characterNameField = new JTextField(14);
	JFrame frame = new JFrame();;
	
	public CharacterCreationWindow() {
		
		helloPilot.setHorizontalAlignment(JLabel.CENTER);
		helloPilot.setText("Hello, Pilot. Please enter your name to begin.");
		
		characterNameField.setHorizontalAlignment(JTextField.CENTER);
		
		createCharacterButton.setText("Create Character");
		createCharacterButton.setHorizontalAlignment(JButton.CENTER);
		createCharacterButton.setFocusable(false);
	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setTitle("MECH MASTERS");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.add(helloPilot);
		frame.add(characterNameField);
		frame.add(createCharacterButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}

}
