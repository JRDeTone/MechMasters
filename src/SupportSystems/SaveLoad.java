package SupportSystems;
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
 * Version/date: 0.1 16 NOV 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the SaveLoad class.
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import DataModules.PlayerData;

public class SaveLoad {
	
	public static boolean saveGameState(PlayerData playerData) {
		ArrayList<String> playerDataFields = new ArrayList<String>();
		playerDataFields.add(playerData.getPlayerName());
		playerDataFields.add(playerData.getPlayerMechType());
		playerDataFields.add(playerData.getPlayerMechName());
		playerDataFields.add(playerData.getPlayerMechColor());
		
		try(BufferedWriter bufferedSaveFile = new BufferedWriter(new FileWriter("src/SaveData.txt"))) {

			for(String playerFieldsToSave : playerDataFields) {
				bufferedSaveFile.write(playerFieldsToSave + "\n");
			}
		}
		catch(IOException ex) {
			return false;
		}
		return true;
	}
	
	public static boolean loadGameState(PlayerData playerData) {
		ArrayList<String> playerDataFields = new ArrayList<String>();

		try (BufferedReader bufferedLoadFile = new BufferedReader(new FileReader("src/SaveData.txt"))){
			bufferedLoadFile.mark(1);
			String playerDataHopper;

			if((playerDataHopper = bufferedLoadFile.readLine()) == null) {
				bufferedLoadFile.close();
				return false;
			}
			else {
				bufferedLoadFile.reset();
			}
			
			while((playerDataHopper = bufferedLoadFile.readLine()) != null) {
				playerDataFields.add(playerDataHopper);
			}
		}
		catch(IOException ex) {
			return false;
		}
		
		playerData.setPlayerName(playerDataFields.get(0));		
		if (playerDataFields.get(1) == "Light Mech") {
			playerData.setPlayerMech("Light Mech");
		}
		else if (playerDataFields.get(1) == "Medium Mech") {
			playerData.setPlayerMech("Medium Mech");
		}
		else {
			playerData.setPlayerMech("Heavy Mech");
		}
		playerData.setPlayerMechName(playerDataFields.get(2));
		playerData.setPlayerMechColor(playerDataFields.get(3));
		
		return true;
	}
}
