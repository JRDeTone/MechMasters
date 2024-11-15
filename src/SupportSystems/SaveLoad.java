package SupportSystems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import DataModules.PlayerData;

public class SaveLoad {
	
	public static void saveGameState(PlayerData playerData) {
		ArrayList<String> playerDataFields = new ArrayList<String>();
		playerDataFields.add(playerData.getPlayerName());
		playerDataFields.add(playerData.getPlayerMechType());
		playerDataFields.add(playerData.getPlayerMechName());
		playerDataFields.add(playerData.getPlayerMechColor());
		
		try {
			FileWriter saveFile = new FileWriter("src/SaveData.txt");
			BufferedWriter bufferedSaveFile = new BufferedWriter(saveFile);
			for(String playerFieldsToSave : playerDataFields) {
				bufferedSaveFile.write(playerFieldsToSave + "\n");
			}
			bufferedSaveFile.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static boolean loadGameState(PlayerData playerData) {
		ArrayList<String> playerDataFields = new ArrayList<String>();

		try {
			FileReader loadFile = new FileReader("src/SaveData.txt");
			BufferedReader bufferedLoadFile = new BufferedReader(loadFile);
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
			bufferedLoadFile.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
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
