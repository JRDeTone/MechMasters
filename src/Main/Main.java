package Main;
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
 * Main execution method. Setups up the needed module, view, and controller objects to run the program.
 * 
 */
import CombatSystems.CombatMechanics;
import DataModules.PlayerData;
import UserInterfaceSystems.GUIController;
import UserInterfaceSystems.LauncherWindow;

public class Main {

	public static void main(String[] args) {
		final PlayerData playerData = new PlayerData();
		final CombatMechanics combatMechanics = new CombatMechanics();
		final LauncherWindow openWindow = new LauncherWindow();
		@SuppressWarnings("unused")
		final GUIController controller = new GUIController(openWindow, playerData, combatMechanics);
	}
}