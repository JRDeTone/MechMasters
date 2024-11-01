package package1;

import DataModules.GameText;
import DataModules.PlayerData;
import UserInterfaceSystems.GUIController;
import UserInterfaceSystems.LauncherWindow;

/**
 * Test bed.
 */
public class Testbed {

	public static void main(String[] args) {
		
		GameText textContent = new GameText();
		System.out.print(textContent.getGameText());
				
	}
	
}