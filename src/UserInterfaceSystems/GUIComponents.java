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
	
	public static HashMap<String, JPanel> uiPanelsHashMap() {
		HashMap<String, JPanel> uiPanelsHashMap = new HashMap<String, JPanel>();
		JPanel characterCreationPanel = PanelGenerator.characterCreationPanel();
		JPanel mechCreationPanel = PanelGenerator.mechCreationPanel();
		JPanel mechHangar = PanelGenerator.hangarPanel();
		uiPanelsHashMap.put("Character Creation", characterCreationPanel);
		uiPanelsHashMap.put("Mech Creation", mechCreationPanel);
		uiPanelsHashMap.put("Mech Hangar", mechHangar);
		
		return uiPanelsHashMap;
	}
	
	public static ArrayList<JPanel> uiPanelsArrayList(){
		ArrayList<JPanel> uiPanelsArrayList = new ArrayList<JPanel>();
		JPanel characterCreationPanel = PanelGenerator.characterCreationPanel();
		JPanel mechCreationPanel = PanelGenerator.mechCreationPanel();
		uiPanelsArrayList.add(characterCreationPanel);
		uiPanelsArrayList.add(mechCreationPanel);
		
		return uiPanelsArrayList;
	}
	
	public static JPanel[] uiPanelsArray(){
		JPanel[] uiPanelsArray = new JPanel[5];
		JPanel characterCreationPanel = PanelGenerator.characterCreationPanel();
		JPanel mechCreationPanel = PanelGenerator.mechCreationPanel();
		uiPanelsArray[0] = characterCreationPanel;
		uiPanelsArray[1] = mechCreationPanel;
		
		return uiPanelsArray;
	}
}
