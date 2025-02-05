package SupportSystems;
/**
 * Lead Author(s):
 * 
 * @author Joe DeTone
 * 
 * Other contributors:
 * 
 * References: 
 * 
 * Version/date: 0.1 16 NOV 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the {@code SaveLoad} class.  {@code SaveLoad} is responsible for saving and loading
 * the current state of essential field values via a .txt file for the program.
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
	
	/**
	 * This method is responsible for saving the required field values.
	 * @param playerData {@code playerData} object to scrape values from.
	 * @return {@code True} if save was successful, {@code False} if save failed.
	 */
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
	
	/**
	 * This method loads the required field values.
	 * @param playerData {@code playerData} object to push values to.
	 * @return {@code True} if load was successful, {@code False} if load failed.
	 */
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
			playerData.setPlayerMech(playerDataFields.get(1), playerDataFields.get(2), playerDataFields.get(3));
		}
		else if (playerDataFields.get(1) == "Medium Mech") {
			playerData.setPlayerMech(playerDataFields.get(1), playerDataFields.get(2), playerDataFields.get(3));
		}
		else {
			playerData.setPlayerMech(playerDataFields.get(1), playerDataFields.get(2), playerDataFields.get(3));
		}
		
		return true;
	}
}
