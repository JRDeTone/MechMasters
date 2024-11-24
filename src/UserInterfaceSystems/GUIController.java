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
 * Version/date: 0.3.5 16 NOV 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the GUIController.
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
	
	class CreateLaunchListener implements ActionListener{
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
			
			launcherWindow.transitionToMechHangar(playerData.getPlayerName(), playerData.getPlayerMechName(), 
					playerData.getPlayerMechType(), playerData.getPlayerMechColor(), playerData.playerGetMechArmorAmountString());
		}
	}
	
	class CreateBattleListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			combatMechanics.setPlayerMech(playerData.getPlayerMech());
			combatMechanics.setPlayerCombatData();
			combatMechanics.setEnemyMech();
			combatMechanics.setEnemyCombatData();
			combatMechanics.setEnemy();
			launcherWindow.transitionToBattle(combatMechanics.getEnemyName(), combatMechanics.getEnemyMechName(), 
					combatMechanics.getEnemyMechType(), combatMechanics.getEnemyMechColor(), combatMechanics.getEnemyArmorCurrent());
		}	
	}
	
	class CreateAttackListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String enemySpeech, playerSpeech;
			System.out.println("I got here.");
			if (combatMechanics.playerAttackAction()) {
				System.out.println("Attack!");
				Random lyricSeeder = new Random();
				int lyricSeed = lyricSeeder.nextInt(10);
				enemySpeech = SoundsOfBattle.enemySong(lyricSeed);
				playerSpeech = SoundsOfBattle.playerSong(lyricSeed);
				launcherWindow.updateCombatTextUpdate(enemySpeech, playerSpeech);
				//launcherWindow.updateMechArmorAmountCombatDisplay(combatMechanics.getPlayerArmorCurrent());
			}
			else {
				System.out.println("Enemy Died.");
				launcherWindow.updateMechArmorAmountCombatDisplay(playerData.playerGetMechArmorAmountString());
				launcherWindow.transitionBackToHangar();
			}
			
			if (combatMechanics.enemyAttackAction()) {
				System.out.println("Attack22222222!");
				launcherWindow.updateMechArmorAmountCombatDisplay(combatMechanics.getPlayerArmorCurrent());
			}
			else {
				System.out.println("Player has died.");
				launcherWindow.updateMechArmorAmountCombatDisplay(playerData.playerGetMechArmorAmountString());
				launcherWindow.transitionBackToHangar();
			}
		}	
	}
	
	class CreateSaveGameListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			SaveLoad.saveGameState(playerData);
		}
	}
	
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