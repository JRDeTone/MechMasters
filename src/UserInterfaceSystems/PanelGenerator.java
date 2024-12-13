package UserInterfaceSystems;
/**
 * Lead Author(s):
 * 
 * @author Joe DeTone
 * 
 * Other contributors:
 * 
 * References: 
 * 
 * Version/date: 0.3 28 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * A JPanel factory class that provides methods to generate specific JPanels to be passed to the UI view.
 * 
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.text.Caret;
import javax.swing.text.DefaultCaret;

public class PanelGenerator {

	/**
	 * Generates the {@code characterCreationPanel}.
	 * @return Returns the JPanel {@code characterCreationPanel}.
	 */
	public static JPanel characterCreationPanel() {
		
		JPanel characterCreationPanel = new JPanel();
		JLabel helloPilot = new JLabel("Hello, Pilot. Please register to begin.");
		JButton createCharacterButton = new JButton("Register Pilot");
		JTextField characterNameField = new JTextField(14);
		JLabel invalidNameLength = new JLabel("Name is blank or greater than 10 characters.");
		Font textRenderFont = new Font("DejaVu Sans", Font.BOLD, 14);
		
		helloPilot.setFont(textRenderFont);
		invalidNameLength.setFont(textRenderFont);
	
		characterCreationPanel.setPreferredSize(new Dimension(350, 100));
		characterCreationPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		characterCreationPanel.setBackground(Color.GRAY);
		characterCreationPanel.add(helloPilot);
		characterCreationPanel.add(characterNameField);
		characterCreationPanel.add(createCharacterButton);
		characterCreationPanel.add(invalidNameLength);
	
		helloPilot.setHorizontalAlignment(JLabel.CENTER);
		characterNameField.setHorizontalAlignment(JTextField.CENTER);
		createCharacterButton.setHorizontalAlignment(JButton.CENTER);
		
		createCharacterButton.setFocusable(false);
		invalidNameLength.setVisible(false);
	
	return characterCreationPanel;
	}
	
	/**
	 * Generates the {@code mechReationPanel}.
	 * @return Returns the JPanel {@code mechReationPanel}.
	 */
	public static JPanel mechCreationPanel() {
		String[] mechTypeSelection = {"Light Mech","Medium Mech","Heavy Mech"};
		String[] mechColorSelection = {"Blue","Red","Green","Yellow","White","Black","Purple","Pink"};
		
		JPanel mechCreationPanel = new JPanel();
		JLabel mechTypeSelectionLabel = new JLabel("Mech Frame: ");
		JLabel mechColorSelectionLabel = new JLabel("Mech Frame Color: ");
		JLabel messageToPlayer = new JLabel("Pilot, please select your frame type, its color, and name your mech.");
		JLabel invalidNameLength = new JLabel("Name is blank or greater than 14 characters.");
		
		Font textRenderFont = new Font("DejaVu Sans", Font.BOLD, 14);
		
		JButton createMechButton = new JButton("Register Mech");
		JComboBox<String> mechTypes = new JComboBox<String>(mechTypeSelection);
		JComboBox<String> mechColor = new JComboBox<String>(mechColorSelection);
		JTextField mechNameField = new JTextField(14);
	
		mechCreationPanel.setPreferredSize(new Dimension(600, 120));
		mechCreationPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		mechCreationPanel.setBackground(Color.GRAY);
		mechCreationPanel.add(messageToPlayer);
		mechCreationPanel.add(mechTypeSelectionLabel);
		mechCreationPanel.add(mechTypes);
		mechCreationPanel.add(mechColorSelectionLabel);
		mechCreationPanel.add(mechColor);
		mechCreationPanel.add(mechNameField);
		mechCreationPanel.add(createMechButton);
		mechCreationPanel.add(invalidNameLength);
		
		mechCreationPanel.setFont(textRenderFont);
		mechTypeSelectionLabel.setFont(textRenderFont);
		mechColorSelectionLabel.setFont(textRenderFont);
		messageToPlayer.setFont(textRenderFont);
		invalidNameLength.setFont(textRenderFont);
	
		mechNameField.setHorizontalAlignment(JTextField.CENTER);
		createMechButton.setVerticalAlignment(JButton.BOTTOM);
		createMechButton.setHorizontalAlignment(JButton.CENTER);
		
		createMechButton.setFocusable(false);
		invalidNameLength.setVisible(false);
	
	return mechCreationPanel;
	}
	
	/**
	 * Generates the {@code hangarPanel}.
	 * @return Returns the JPanel {@code hangarPanel}.
	 */
	public static JPanel hangarPanel(){
		Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder();
		Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
		Border CompoundBorder = BorderFactory.createCompoundBorder(raisedBevelBorder, loweredBevelBorder);
		
		JPanel hangarMainPanel = new JPanel();
		hangarMainPanel.setBackground(Color.GRAY);
		hangarMainPanel.setLayout(new BorderLayout());
		
		JPanel textRenderPanel = new JPanel();
		textRenderPanel.setBackground(Color.GRAY);
		Font textRenderFont = new Font("DejaVu Sans", Font.BOLD, 16);
		
		JTextPane textRenderMain = new JTextPane();
		textRenderMain.setEditable(false);
		textRenderMain.setCaret(hideCaret);
		textRenderMain.setBackground(Color.GRAY);
		textRenderMain.setFont(textRenderFont);
		
		textRenderMain.setText("Welcome back, Pilot.");
		
		textRenderPanel.add(textRenderMain);
		
		JPanel dataDisplayLeft = new JPanel();
		dataDisplayLeft.setBackground(Color.GRAY);
		dataDisplayLeft.setBorder(CompoundBorder);
		dataDisplayLeft.setLayout(new BoxLayout(dataDisplayLeft, BoxLayout.Y_AXIS));
		
		Font dataDisplayFont = new Font("DejaVu Sans", Font.BOLD, 16);
		JLabel leftCharacterName = new JLabel("Character Name");
		leftCharacterName.setFont(dataDisplayFont);
		JLabel leftMechStatus = new JLabel("Mech Status: READY");
		leftMechStatus.setFont(dataDisplayFont);
		JLabel leftMechName = new JLabel("Mech Name");
		leftMechName.setFont(dataDisplayFont);
		JLabel leftMechType = new JLabel("Mech Type");
		leftMechType.setFont(dataDisplayFont);
		JLabel leftMechColorTop = new JLabel("Mech Color:");
		leftMechColorTop.setFont(dataDisplayFont);
		JLabel leftMechColorBottom = new JLabel("Mech Color:");
		leftMechColorBottom.setFont(dataDisplayFont);
		JLabel leftMechHealth = new JLabel("Mech Health");
		leftMechHealth.setFont(dataDisplayFont);
		
		dataDisplayLeft.add(leftCharacterName);
		dataDisplayLeft.add(leftMechStatus);
		dataDisplayLeft.add(leftMechName);
		dataDisplayLeft.add(leftMechType);
		dataDisplayLeft.add(leftMechColorTop);
		dataDisplayLeft.add(leftMechColorBottom);
		dataDisplayLeft.add(leftMechHealth);
		
		JPanel dataDisplayRight = new JPanel();
		dataDisplayRight.setBackground(Color.GRAY);
		dataDisplayRight.setBorder(CompoundBorder);
		dataDisplayRight.setLayout(new BoxLayout(dataDisplayRight, BoxLayout.Y_AXIS));
		
		JPanel buttonControlPanel = new JPanel();
		buttonControlPanel.setBackground(Color.GRAY);
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
		
		return hangarMainPanel;
	}
	
	/**
	 * Generates the {@code combatPanel}.
	 * @return Returns the JPanel {@code combatPanel}.
	 */
	public static JPanel combatPanel(){
		Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder();
		Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
		Border CompoundBorder = BorderFactory.createCompoundBorder(raisedBevelBorder, loweredBevelBorder);
		
		JPanel combatPanel = new JPanel();
		combatPanel.setLayout(new BorderLayout());
		combatPanel.setBackground(Color.GRAY);
		
		JPanel textRenderPanel = new JPanel();
		textRenderPanel.setLayout(new BoxLayout(textRenderPanel, BoxLayout.Y_AXIS));
		Font textRenderFont = new Font("DejaVu Sans", Font.BOLD, 16);
		Font textRenderFont2 = new Font("DejaVu Sans", Font.BOLD, 20);
		Font dataDisplayFont = new Font("DejaVu Sans", Font.BOLD, 16);
		
		JLabel textRenderEnemy = new JLabel();
		textRenderEnemy.setFont(textRenderFont2);
		textRenderEnemy.setText("Enemy");
		textRenderEnemy.setHorizontalAlignment(JLabel.LEFT);
		
		JLabel textRenderPilot = new JLabel();
		textRenderPilot.setFont(textRenderFont2);
		textRenderPilot.setHorizontalAlignment(JLabel.RIGHT);
		textRenderPilot.setText("Pilot");
		textRenderPanel.setBackground(Color.GRAY);
		
		JTextPane textRenderEnemySpeech = new JTextPane();
		textRenderEnemySpeech.setEditable(false);
		textRenderEnemySpeech.setCaret(hideCaret);
		textRenderEnemySpeech.setBackground(Color.GRAY);
		textRenderEnemySpeech.setFont(textRenderFont);
		
		JTextPane textRenderPlayerSpeech = new JTextPane();
		textRenderPlayerSpeech.setEditable(false);
		textRenderPlayerSpeech.setCaret(hideCaret);
		textRenderPlayerSpeech.setBackground(Color.GRAY);
		textRenderPlayerSpeech.setFont(textRenderFont);
		
		textRenderEnemySpeech.setText(
				"The moment has arrived for fighting.\n"
				+ "   There is no escape or hiding.\n"
				+ "Darkness will be broken open.\n"
				+ "   Shattered by the crimson lightning."
				);
		textRenderPlayerSpeech.setText(
				"I hear the thunder getting closer all the time.\n"
				+ "   But my heart of steel will never hide.\n");
		
		textRenderPanel.add(textRenderEnemy);
		textRenderPanel.add(textRenderEnemySpeech);
		textRenderPanel.add(textRenderPilot);
		textRenderPanel.add(textRenderPlayerSpeech);
		
		JPanel dataDisplayLeft = new JPanel();
		dataDisplayLeft.setBackground(Color.GRAY);
		dataDisplayLeft.setBorder(CompoundBorder);
		dataDisplayLeft.setLayout(new BoxLayout(dataDisplayLeft, BoxLayout.Y_AXIS));
		
		JLabel leftCharacterName = new JLabel("Character Name");
		leftCharacterName.setFont(dataDisplayFont);
		JLabel leftMechStatus = new JLabel("Mech Status: READY");
		leftMechStatus.setFont(dataDisplayFont);
		JLabel leftMechName = new JLabel("Mech Name");
		leftMechName.setFont(dataDisplayFont);
		JLabel leftMechType = new JLabel("Mech Type");
		leftMechType.setFont(dataDisplayFont);
		JLabel leftMechColorTop = new JLabel("Mech Color:");
		leftMechColorTop.setFont(dataDisplayFont);
		JLabel leftMechColorBottom = new JLabel("Mech Color:");
		leftMechColorBottom.setFont(dataDisplayFont);
		JLabel leftMechHealth = new JLabel("Mech Health");
		leftMechHealth.setFont(dataDisplayFont);
		
		dataDisplayLeft.add(leftCharacterName);
		dataDisplayLeft.add(leftMechStatus);
		dataDisplayLeft.add(leftMechName);
		dataDisplayLeft.add(leftMechType);
		dataDisplayLeft.add(leftMechColorTop);
		dataDisplayLeft.add(leftMechColorBottom);
		dataDisplayLeft.add(leftMechHealth);
		
		JPanel dataDisplayRight = new JPanel();
		dataDisplayRight.setBackground(Color.GRAY);
		dataDisplayRight.setBorder(CompoundBorder);
		dataDisplayRight.setLayout(new BoxLayout(dataDisplayRight, BoxLayout.Y_AXIS));
		
		JLabel rightCharacterName = new JLabel("Character Name");
		rightCharacterName.setFont(dataDisplayFont);
		JLabel rightMechStatus = new JLabel("Mech Status: READY");
		rightMechStatus.setFont(dataDisplayFont);
		JLabel rightMechName = new JLabel("Mech Name");
		rightMechName.setFont(dataDisplayFont);
		JLabel rightMechType = new JLabel("Mech Type");
		rightMechType.setFont(dataDisplayFont);
		JLabel rightMechColorTop = new JLabel("Mech Color:");
		rightMechColorTop.setFont(dataDisplayFont);
		JLabel rightMechColorBottom = new JLabel("Mech Color");
		rightMechColorBottom.setFont(dataDisplayFont);
		JLabel rightMechHealth = new JLabel("Mech Health");
		rightMechHealth.setFont(dataDisplayFont);

		dataDisplayRight.add(rightCharacterName);
		dataDisplayRight.add(rightMechStatus);
		dataDisplayRight.add(rightMechName);
		dataDisplayRight.add(rightMechType);
		dataDisplayRight.add(rightMechColorTop);
		dataDisplayRight.add(rightMechColorBottom);
		dataDisplayRight.add(rightMechHealth);
		
		JPanel buttonControlPanel = new JPanel();
		buttonControlPanel.setBackground(Color.GRAY);
		JButton attackButton = new JButton("Fight!");
//		JButton defendButton = new JButton("Defend");
//		JButton specialButton = new JButton("Special Action");
//		JButton inventoryButton = new JButton("Inventory");
//		JButton surrenderButton = new JButton("Surrender");
//		JButton reload = new JButton("Reload");
		buttonControlPanel.setLayout(new GridLayout(3, 2, 10, 10));
		buttonControlPanel.setBorder(raisedBevelBorder);
		buttonControlPanel.add(attackButton);
//		buttonControlPanel.add(defendButton);
//		buttonControlPanel.add(reload);
//		buttonControlPanel.add(specialButton);
//		buttonControlPanel.add(inventoryButton);
//		buttonControlPanel.add(surrenderButton);
		
		combatPanel.add(textRenderPanel, BorderLayout.CENTER);
		combatPanel.add(dataDisplayLeft, BorderLayout.WEST);
		combatPanel.add(dataDisplayRight, BorderLayout.EAST);
		combatPanel.add(buttonControlPanel, BorderLayout.SOUTH);
		
		return combatPanel;
	}
	

    /**
     * Some bootstrap code that hides the caret.
     */
    static Caret hideCaret = new DefaultCaret() {
		private static final long serialVersionUID = 1L;

		@Override
        public void paint(Graphics graphics) {
        }

        @Override
        public boolean isVisible() {
            return false;
        }

        @Override
        public boolean isSelectionVisible() {
            return false;
        }
    };
}
