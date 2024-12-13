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
 * Version/date: 0.3 27 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the {@code GUIComponents}.
 * This class provides the underlying data structure for the {@code JPanel} objects created by the methods
 * in {@code PanelGenerator}. The only reason a {@code HashMap} is used is due to project
 * requirements. Otherwise, a simple array would have been a better choice.
 */

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JPanel;

public class GUIComponents {
	
	/**
	 * Creates the needed panel elements for the UI model and loads them into a {@code HashMap.}.
	 * @return Returns a {@code HashMap} object.
	 */
	public static HashMap<String, JPanel> uiPanelsHashMap() {
		HashMap<String, JPanel> uiPanelsHashMap = new HashMap<String, JPanel>();
		JPanel characterCreationPanel = PanelGenerator.characterCreationPanel();
		JPanel mechCreationPanel = PanelGenerator.mechCreationPanel();
		JPanel mechHangar = PanelGenerator.hangarPanel();
		JPanel combatPanel = PanelGenerator.combatPanel();
		uiPanelsHashMap.put("Character Creation", characterCreationPanel);
		uiPanelsHashMap.put("Mech Creation", mechCreationPanel);
		uiPanelsHashMap.put("Mech Hangar", mechHangar);
		uiPanelsHashMap.put("Combat", combatPanel);
		
		return uiPanelsHashMap;
	}
	
//	public static ArrayList<JPanel> uiPanelsArrayList(){
//		ArrayList<JPanel> uiPanelsArrayList = new ArrayList<JPanel>();
//		JPanel characterCreationPanel = PanelGenerator.characterCreationPanel();
//		JPanel mechCreationPanel = PanelGenerator.mechCreationPanel();
//		uiPanelsArrayList.add(characterCreationPanel);
//		uiPanelsArrayList.add(mechCreationPanel);
//		
//		return uiPanelsArrayList;
//	}
//	
//	public static JPanel[] uiPanelsArray(){
//		JPanel[] uiPanelsArray = new JPanel[5];
//		JPanel characterCreationPanel = PanelGenerator.characterCreationPanel();
//		JPanel mechCreationPanel = PanelGenerator.mechCreationPanel();
//		uiPanelsArray[0] = characterCreationPanel;
//		uiPanelsArray[1] = mechCreationPanel;
//		
//		return uiPanelsArray;
//	}
}
