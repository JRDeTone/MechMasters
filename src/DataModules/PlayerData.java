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
import MechSystems.MediumMech;
import CharacterSystems.PlayerCharacter;
import MechSystems.HeavyMech;
import MechSystems.LightMech;

public class PlayerData {
	
	private final PlayerCharacter player = new PlayerCharacter("");
	private Mech playerMech;
	/**
	 * Constructor for the PlayerData object.  This is used with the GUIController to reference.
	 * @param PlayerCharacter player This field is final, holds the PlayerCharacter object required for all other classes to reference.
	 * @param Mech playerMech Holds the playerMech object required for all other classes to reference.
	 */
	public PlayerData() {
	
	}
	/**
	 * @return Returns the player's name.
	 */
	public String getPlayerName() {
		return this.player.getCharacterName();
	}
	/**
	 * Sets the player's name from a passed in String argument.
	 */
	public void setPlayerName(String inputName) {
		this.player.setCharacterName(inputName);
	}
	/**
	 * @return Returns the player's Mech.
	 */
	public Mech getPlayerMech() {
		return this.playerMech;
	}
	/**
	 * Sets the players Mech by using a passed in String argument.
	 */
	public void setPlayerMech(String mechType, String mechName, String mechColor) {
		if (mechType == "Light Mech") {
			this.playerMech = new LightMech(mechName, mechColor);
		}
		else if (mechType == "Medium Mech") {
			this.playerMech = new MediumMech(mechName, mechColor);
		}
		else {
			this.playerMech = new HeavyMech(mechName, mechColor);
		}
	}
	/**
	 * @return Returns the player's Mech's name.
	 */
	public String getPlayerMechName() {
		return this.playerMech.getMechName();
	}
	/**
	 * Sets the player's Mech name.
	 */
	public void setPlayerMechName(String inputName) {
		this.playerMech.setMechName(inputName);
	}
	/**
	 * @return Returns the color of the player's Mech as a String.
	 */
	public String getPlayerMechColor() {
		return this.playerMech.getMechColor();
	}
	/**
	 * Sets the player's Mech color with a passed in String argument.
	 */
	public void setPlayerMechColor(String inputColor) {
		this.playerMech.setMechColor(inputColor);
	}
	/**
	 * @return Returns the player's Mech type as a String.
	 */
	public String getPlayerMechType() {
		return this.playerMech.getMechType();
	}
	/**
	 * @return Returns the player's Mech armor amount as an int.
	 */
	public int playerGetMechArmorAmount() {
		return this.playerMech.getMechArmorAmount();
	}
	/**
	 * @return Returns the player's Mech armor amount as a String.
	 */
	public String playerGetMechArmorAmountString() {
		return Integer.toString(this.playerMech.getMechArmorAmount());
	}
	/**
	 * Sets the player's Mech armor amount with an int argument.
	 */
	public void playerSetMechArmorAmount(int inputArmorAmount) {
		this.playerMech.setMechArmorAmount(inputArmorAmount);
	}
	/**
	 * Sets the player's Mech armor amount with a String argument.
	 */
	public void setMechArmorAmount(String inputArmorAmount) {
		this.playerMech.setMechArmorAmount(inputArmorAmount);
	}
	/**
	 * @return Returns the player's Mech armor class as an int.
	 */
	public int getMechArmorClass() {
		return this.playerMech.getMechArmorClass();
	}
}