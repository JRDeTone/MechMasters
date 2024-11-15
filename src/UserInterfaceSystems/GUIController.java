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
 * Provides fields and methods for the GUIController.
 * 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DataModules.PlayerData;
import SupportSystems.SaveLoad;

public class GUIController {
	
	private LauncherWindow launcherWindow;
	private PlayerData playerData;
	
	public GUIController(LauncherWindow inputLauncherWindow, PlayerData inputPlayerData) {
		launcherWindow = inputLauncherWindow;
		playerData = inputPlayerData;
		launcherWindow.addLaunchButtonListener(new LaunchListener());	
		launcherWindow.addCreateCharacterButtonListener(new CreateCharacterListener());
		launcherWindow.addCreateMechButtonListener(new CreateMechListener());
		launcherWindow.addSaveGameButtonListener(new SaveGameListener());
		launcherWindow.addLoadGameButtonListener(new LoadGameListener());
	}
	
	class LaunchListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			launcherWindow.transitionToCharacterCreation();
		}	
	}
	
	class CreateCharacterListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			playerData.setPlayerName(launcherWindow.getCharacterNameField());
			launcherWindow.transitionToMechCreation();
		}
	}
	
	class CreateMechListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			playerData.setPlayerMech(launcherWindow.getMechTypeField());
			playerData.setPlayerMechName(launcherWindow.getMechNameField());
			playerData.setPlayerMechColor(launcherWindow.getMechColorField());
			launcherWindow.transitionToMechHangar();
		}
	}
	
	class SaveGameListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			SaveLoad.saveGameState(playerData);
		}
	}
	
	class LoadGameListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(SaveLoad.loadGameState(playerData) != true)
				System.out.println("Loading failed, save file missing or empty.");
		}
	}
}