package package1;

import CombatSystems.CombatMechanics;
import DataModules.PlayerData;
import UserInterfaceSystems.GUIController;
import UserInterfaceSystems.LauncherWindow;

public class Main {

	public static void main(String[] args) {
		
		final PlayerData playerData = new PlayerData();
		final CombatMechanics combatMechanics = new CombatMechanics();
		final LauncherWindow openWindow = new LauncherWindow();
		final GUIController controller = new GUIController(openWindow, playerData, combatMechanics);
		System.out.println("Entering setup");

	}

}
