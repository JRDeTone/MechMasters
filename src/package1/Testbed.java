package package1;

import MechSystems.LightMech;
import MechSystems.Mech;
import PlayerCharacterSystems.PlayerCharacter;
import UserInterfaceSystems.GUIController;
import UserInterfaceSystems.LauncherWindow;

/**
 * Test bed.
 */
public class Testbed {

	public static void main(String[] args) {
		boolean idleState = true;
		LauncherWindow openWindow = new LauncherWindow();
		GUIController controller = new GUIController(openWindow);
		
		while (idleState == true) {
			try {
				if(openWindow.getIsGameSetup() == false) {
					Thread.sleep(2000);
				}
				else {
					System.out.println("Exit Idle");
					break;
				}
			} 
			catch (InterruptedException idleError) {
				
			}
		}
		System.out.println("Entering setup");
				
	}
	
}