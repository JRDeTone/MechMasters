package DataModules;
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
 * Provides fields and methods for the PlayerData class.
 * 
 */
import MechSystems.Mech;
import PlayerCharacterSystems.PlayerCharacter;

public class PlayerData {
	
	private final PlayerCharacter player = new PlayerCharacter();
	private final Mech playerMech = new Mech();
	
	public PlayerData() {
	
	}
	
	public String getPlayerName() {
		return this.player.getCharacterName();
	}
	
	public void setPlayerName(String inputName) {
		this.player.setCharacterName(inputName);
	}

}
