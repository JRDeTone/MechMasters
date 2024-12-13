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
 * Version/date: 0.3.5 16 NOV 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the GUI controller class.
 * 
 * Responsible for acting as the controller for MVC model. Governs exchanges between data modules and view. Action events
 * internal classes are used to drive GUI interactions. Constructor for this class must be provided the view and data models
 * to function properly.
 * 
 * See {@code LauncherWindow} as reference for methods used with the internal {@code ActionListener} classes.
 * 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import CombatSystems.CombatMechanics;
import CombatSystems.SoundsOfBattle;
import DataModules.PlayerData;
import SupportSystems.SaveLoad;

public class GUIController {
	
	private LauncherWindow launcherWindow;
	private PlayerData playerData;
	private CombatMechanics combatMechanics;
	
	/**
	 * Constructor.
	 * @param inputLauncherWindow View object
	 * @param inputPlayerData Data module object for the player's data.
	 * @param inputCombatMechanics Combat encounter logic module.
	 */
	public GUIController(LauncherWindow inputLauncherWindow, PlayerData inputPlayerData, CombatMechanics inputCombatMechanics) {
		launcherWindow = inputLauncherWindow;
		playerData = inputPlayerData;
		combatMechanics = inputCombatMechanics;
		
		launcherWindow.addCreateLaunchButtonListener(new CreateLaunchListener());
		launcherWindow.addCreateCharacterButtonListener(new CreateCharacterListener());
		launcherWindow.addCreateMechButtonListener(new CreateMechListener());
		launcherWindow.addCreateBattleButtonListener(new CreateBattleListener());
		launcherWindow.addAttackButtonListener(new CreateAttackListener());
		launcherWindow.addCreateSaveGameButtonListener(new CreateSaveGameListener());
		launcherWindow.addCreateLoadGameButtonListener(new CreateLoadGameListener());
		
	}
	
	/**
	 * Listener for character creation UI transition event.
	 */
	class CreateLaunchListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			launcherWindow.transitionToCharacterCreation();
		}	
	}
	
	/**
	 * Listener for character creation finished event.
	 */
	class CreateCharacterListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (launcherWindow.getCharacterNameField().length() > 10 || launcherWindow.getCharacterNameField().length() == 0) {
				launcherWindow.updateCharacterCreationNameError(true);
			}
			else {
				playerData.setPlayerName(launcherWindow.getCharacterNameField());
				launcherWindow.transitionToMechCreation();
			}
		}
	}
	
	/**
	 * Listener for mech creation finished event.
	 */
	class CreateMechListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (launcherWindow.getMechNameField().length() > 14 || launcherWindow.getMechNameField().length() == 0) {
				launcherWindow.updateMechCreationNameError(true);
			}
			else {
				playerData.setPlayerMech(launcherWindow.getMechTypeField(), launcherWindow.getMechNameField(), launcherWindow.getMechColorField());
				launcherWindow.transitionToMechHangar(playerData.getPlayerName(), playerData.getPlayerMechName(), 
						playerData.getPlayerMechType(), playerData.getPlayerMechColor(), playerData.playerGetMechArmorAmountString());
			}
		}
	}
	
	/**
	 * Listener for battle transition event.
	 */
	class CreateBattleListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			combatMechanics.combatSetup(playerData.getPlayerMech());
			launcherWindow.transitionToBattle(combatMechanics.getEnemyName(), combatMechanics.getEnemyMechName(), 
					combatMechanics.getEnemyMechType(), combatMechanics.getEnemyMechColor(), combatMechanics.getEnemyArmorCurrent());
		}	
	}
	
	/**
	 * Listener for player attack action.
	 */
	class CreateAttackListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String enemySpeech, playerSpeech;
			Random lyricSeeder = new Random();
			if (combatMechanics.playerAttackAction()) {
				int lyricSeed = lyricSeeder.nextInt(10);
				enemySpeech = SoundsOfBattle.enemySong(lyricSeed);
				playerSpeech = SoundsOfBattle.playerSong(lyricSeed);
				launcherWindow.updateCombatText(enemySpeech, playerSpeech);
				launcherWindow.updateMechArmorAmountCombatDisplayEnemy(combatMechanics.getEnemyArmorCurrent());
			}
			else {
				launcherWindow.updateMechArmorAmountCombatDisplayPlayer(playerData.playerGetMechArmorAmountString());
				launcherWindow.updateOutComeMessage("You won. Well done, Pilot.");
				launcherWindow.transitionBackToHangar();
				return;
			}
			
			if (combatMechanics.enemyAttackAction()) {
				launcherWindow.updateMechArmorAmountCombatDisplayPlayer(combatMechanics.getPlayerArmorCurrent());
			}
			else {
				launcherWindow.updateMechArmorAmountCombatDisplayPlayer(playerData.playerGetMechArmorAmountString());
				launcherWindow.updateOutComeMessage("You lost. Do not give up, Pilot.");
				launcherWindow.transitionBackToHangar();
			}
		}	
	}
	
	/**
	 * Listener for save game action.
	 */
	class CreateSaveGameListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			SaveLoad.saveGameState(playerData);
		}
	}
	
	/**
	 * Listener for load game listener.
	 */
	class CreateLoadGameListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(SaveLoad.loadGameState(playerData) != true) {
				System.out.println("Loading failed, save file missing or empty.");
			}
			launcherWindow.transitionToMechHangar(playerData.getPlayerName(), playerData.getPlayerMechName(), 
					playerData.getPlayerMechType(), playerData.getPlayerMechColor(), playerData.playerGetMechArmorAmountString());
		}	
	}
}