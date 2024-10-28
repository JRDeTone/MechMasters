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
import MechSystems.LightMech;
import PlayerCharacterSystems.PlayerCharacter;

public class PlayerData {
	
	private final PlayerCharacter player = new PlayerCharacter();
	private Mech playerMech;
	
	public PlayerData() {
	
	}
	
	public String getPlayerName() {
		return this.player.getCharacterName();
	}
	
	public void setPlayerName(String inputName) {
		this.player.setCharacterName(inputName);
	}
	
	public Mech getPlayerMech() {
		return this.playerMech;
	}
	
	public void setPlayerMech(String mechType) {
		if (mechType == "Light Mech") {
			this.playerMech = new LightMech();
		}
//		if (mechType == "Medium Mech") {
//			this.playerMech = new MediumMech();
//		}
//		else {
//			this.playerMech = new HeavyMech();
//		}
	}
	
	public String getPlayerMechName() {
		return this.playerMech.getMechName();
	}
	
	public void setPlayerMechName(String inputName) {
		this.playerMech.setMechName(inputName);
	}
	
	public String getPlayerMechColor() {
		return this.playerMech.getMechColor();
	}
	
	public void setPlayerMechColor(String inputColor) {
		this.playerMech.setMechColor(inputColor);
	}
}