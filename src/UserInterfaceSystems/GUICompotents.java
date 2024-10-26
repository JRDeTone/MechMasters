package UserInterfaceSystems;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GUICompotents {

	public ArrayList generateButtons() {
		ArrayList<JButton> buttonElements = new ArrayList();
		
		return buttonElements;
	}
	
	public HashMap uiPanels() {
		HashMap<String, JPanel> panels = new HashMap();
		JPanel characterCreationPanel = CharacterCreationPanel.characterCreationPanel();
		panels.put("Character Creation", characterCreationPanel);
	}
}
