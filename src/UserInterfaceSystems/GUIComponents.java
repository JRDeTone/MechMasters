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
 * Version/date: 0.3 27 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the GUIComponents class.
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JPanel;

public class GUIComponents {
	
	public static HashMap<String, JPanel> uiPanels() {
		HashMap<String, JPanel> uiPanels = new HashMap<String, JPanel>();
		JPanel characterCreationPanel = PanelGenerator.characterCreationPanel();
		JPanel mechCreationPanel = PanelGenerator.mechCreationPanel();
		uiPanels.put("Character Creation", characterCreationPanel);
		uiPanels.put("Mech Creation", mechCreationPanel);
		
		return uiPanels;
	}
}
