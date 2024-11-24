package package1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import DataModules.GameText;
import DataModules.PlayerData;
import UserInterfaceSystems.GUIController;
import UserInterfaceSystems.LauncherWindow;

/**
 * Test bed.
 */
public class Testbed {
	
public static void main(String[] args) {
		
	Random nameSeeder = new Random();
	String mechName = switch (nameSeeder.nextInt(10)) {
		case 0 -> "Big Zam";
		case 1 -> "Guntank";
		case 2 -> "Khul Johei";
		case 3 -> "ANX-PLR Custom";
		case 4 -> "GLK19";
		case 5 -> "A 2006 Nissan Murano";
		case 6 -> "Last Train Home";
		case 7 -> "C-GUSTAF";
		case 8 -> "AW-BNS Unit_RM";
		case 9 -> "Giga Oobly";
		default -> "De'folt Exseeyon";
	};
	
	System.out.print(mechName);

	}

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
		finally{
			System.out.println("Save state was called.");
		}
		return true;
	}
	
	public static void fieldValidator(String stringFieldToValidate) throws MyException{
		MyException ex = new MyException();
		if (stringFieldToValidate.length()>14) {
			throw ex;
		}
		else {
			System.out.println(stringFieldToValidate);
		}
	}
	
	public static void demoingWriteIO() {
		try {
			FileWriter fileToWrite = new FileWriter("src/GameText.txt");
			PrintWriter writer = new PrintWriter(fileToWrite);
		}
		catch (IOException ex){
			System.out.println("404 File not found :c ");
		}
	}
}