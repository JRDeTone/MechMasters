package DataModules;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
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
 * Provides fields and methods for the GameText class.
 * 
 */

public class GameText {
	
	private FileReader inputGameText;
	private BufferedReader buffedGameText;
	private String gameTextContentHopper = "";
	private String gameTextContents = "";
	private Pattern p = Pattern.compile("::(.)::");
	private Pattern p2 = Pattern.compile("&&(.)&&");

	public GameText() {
		try {
			this.inputGameText = new FileReader("src/GameText.txt");
			this.buffedGameText = new BufferedReader(this.inputGameText);
			
			while ((gameTextContentHopper = buffedGameText.readLine()) != null) {
				gameTextContents = gameTextContents.concat(gameTextContentHopper + "\n");
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public String getGameText() {
		return gameTextContents;
	}
}
