package DataModules;
/**
 * Lead Author(s):
 * 
 * @author Joe DeTone
 * 
 * Other contributors:
 * 
 * References: 
 * 
 * Version/date: 0.3 27 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Data module class for the player.
 * Created on program start and supplied to {@code GUIConstroller} and allows controller to access all player data.
 * Local set and get methods are for {@code GUIController} to manipulate and receive player data.
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
	 * Default constructor.
	 */
	public PlayerData() {
	
	}
	/**
	 * {@code GUIController} access method.
	 * @return Returns player name as String.
	 */
	public String getPlayerName() {
		return this.player.getCharacterName();
	}
	/**
	 * {@code GUIController} access method.
	 * Sets {@code characterName} field.
	 * @param inputName String value for player name.
	 */
	public void setPlayerName(String inputName) {
		this.player.setCharacterName(inputName);
	}
	/**
	 * {@code GUIController} access method.
	 * @return Returns the player's assigned {@code Mech} object.
	 */
	public Mech getPlayerMech() {
		return this.playerMech;
	}

	/**
	 * {@code GUIController} access method.
	 * Sets {@code playerMech} field based on passed in values.
	 * @param mechType String value to determine which {@code Mech} subclass constructor to call.
	 * @param mechName String value for {@code mechName} field.
	 * @param mechColor String value for {@code mechColor} field.
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
	 * @return Returns {@code playerMech} {@code mechName} field value as a String.
	 */
	public String getPlayerMechName() {
		return this.playerMech.getMechName();
	}
	/**
	 * Sets {@code playerMech} {@code mechName} field value with passed String.
	 */
	public void setPlayerMechName(String inputName) {
		this.playerMech.setMechName(inputName);
	}
	/**
	 * @return Returns {@code playerMech} {@code mechColor} field value as a String.
	 */
	public String getPlayerMechColor() {
		return this.playerMech.getMechColor();
	}
	/**
	 * Sets {@code playerMech} {@code mechColor} field value with passed String.
	 */
	public void setPlayerMechColor(String inputColor) {
		this.playerMech.setMechColor(inputColor);
	}
	/**
	 * @return Returns {@code playerMech} {@code mechType} field value as a String.
	 */
	public String getPlayerMechType() {
		return this.playerMech.getMechType();
	}
	/**
	 * @return Returns {@code playerMech} {@code mechArmorAmount} field value as an int.
	 */
	public int playerGetMechArmorAmount() {
		return this.playerMech.getMechArmorAmount();
	}
	/**
	 * @return Returns {@code playerMech} {@code mechArmorAmount} field value as a String.
	 */
	public String playerGetMechArmorAmountString() {
		return Integer.toString(this.playerMech.getMechArmorAmount());
	}
	/**
	 * Sets {@code playerMech} {@code mechArmorAmount} field value with passed int.
	 */
	public void playerSetMechArmorAmount(int inputArmorAmount) {
		this.playerMech.setMechArmorAmount(inputArmorAmount);
	}
	/**
	 * Sets {@code playerMech} {@code mechArmorAmount} field value with passed String.
	 */
	public void setMechArmorAmount(String inputArmorAmount) {
		this.playerMech.setMechArmorAmount(inputArmorAmount);
	}
	/**
	 * @return Returns {@code playerMech} {@code mechArmorClass} field value as an int.
	 */
	public int getMechArmorClass() {
		return this.playerMech.getMechArmorClass();
	}
}