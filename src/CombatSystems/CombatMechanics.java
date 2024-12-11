package CombatSystems;
/**
 * Lead Author(s):
 * 
 * @author Joe DeTone
 * 
 * Other contributors:
 * 
 * References:
 * 
 * Version/date: 0.4 07 DEC 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the {@code CombatMechanics} class.
 * This class acts as a model component for {@code GUIController} and is always instantiated upon program execution.
 */

import CharacterSystems.EntityComponentGenerator;
import CharacterSystems.NonPlayerCharacter;
import MechSystems.Mech;

public class CombatMechanics {
	private final int ARMOR_CLASS_FAIL_DAMAGE = 1;
	private Mech playerMech;
	private Mech enemyMech;
	private NonPlayerCharacter npc;
	private int playerDamageAmount, enemyDamageAmount, playerArmorCurrentAmount,
	enemyArmorCurrentAmount, 
	playerArmorClass, enemyArmorClass;
	
	/**
	 * Constructor for {@code CombatMechanics}. This should be passed to the {@code GUIController} constructor.
	 */
	public CombatMechanics() {

	}
	
	/**
	 * {@code combatSetup()} accepts {@code Mech} object and must be called prior to entering a combat encounter. 
	 * This method generates an opponent populates the variables for the class logic to use.
	 * 
	 * Return methods allow {@code GUIController} to access the data stored in the class fields.
	 */
	/**
	 * {@code combatSetup} Populates class fields with values to be used by internal logic.
	 * @param inputPlayerMech Accepts {@code Mech} object argument. Always used with {@code playerMech} from {@code PlayerData}.
	 */
	public void combatSetup(Mech inputPlayerMech) {
		this.playerMech = inputPlayerMech;
		this.npc = EntityComponentGenerator.iNeedACharacter();
		this.enemyMech = EntityComponentGenerator.iNeedAMech();
		
		this.playerDamageAmount = this.playerMech.getMechWeapon().getDamageAmount();
		this.playerArmorCurrentAmount = this.playerMech.getMechArmorAmount();
		this.playerArmorClass = this.playerMech.getMechArmorClass();
		
		this.enemyDamageAmount = this.enemyMech.getMechWeapon().getDamageAmount();
		this.enemyArmorCurrentAmount = this.enemyMech.getMechArmorAmount();
		this.enemyArmorClass = this.enemyMech.getMechArmorClass();
	}
	
	/**
	 * This method is used to determine the outcome of player attack action,
	 * updates values based on the result of the logic, and checks if the encounter can continue.
	 * The {@code npc} field is set to null to attempt reliable garbage collection.
	 * @return {@code True}, the combat encounter can continue. {@code False}, the combat encounter has ended.
	 */
	public boolean playerAttackAction() {

		if (this.playerDamageAmount == this.enemyArmorClass) {
			this.enemyArmorCurrentAmount = this.enemyArmorCurrentAmount - this.playerDamageAmount;
		}
		else {
			this.enemyArmorCurrentAmount = this.enemyArmorCurrentAmount - ARMOR_CLASS_FAIL_DAMAGE;
		}
		
		if (this.enemyArmorCurrentAmount > 0) {
			return true;
		}
		else {
			this.npc = null;
			return false;
		}
	}
	
	/**
	 * This method is used to determined the outcome of enemy attack action,
	 * updates values based on the result of the logic, and checks if the encounter can continue.
	 * The {@code npc} field is set null to attempt reliable garbage collection.
	 * @return {@code True}, the combat encounter can continue. {@code False}, the combat encounter has ended.
	 */
	public boolean enemyAttackAction() {

		if (this.enemyDamageAmount == this.playerArmorClass) {
			this.playerArmorCurrentAmount = this.playerArmorCurrentAmount - this.enemyDamageAmount;
		}
		else {
			this.playerArmorCurrentAmount = this.playerArmorCurrentAmount - ARMOR_CLASS_FAIL_DAMAGE;
		}
		
		if (this.playerArmorCurrentAmount > 0) {
			return true;
		}
		else {
			this.npc = null;
			return false;
		}
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns {@code characterName} field value as a String from {@code npc}.
	 */
	public String getEnemyName() {
		return npc.getCharacterName();
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns {@code mechName} field value as a String from {@code enemyMech}.
	 */
	public String getEnemyMechName() {
		return this.enemyMech.getMechName();
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns {@code mechColor} field value as a String from {@code enemyMech}.
	 */
	public String getEnemyMechColor() {
		return this.enemyMech.getMechColor();
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns {@code mechType} field value as a String from {@code enemyMech}.
	 */
	public String getEnemyMechType() {
		return this.enemyMech.getMechType();
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns {@code playerArmorCurrentAmount} field value as a String.
	 */
	public String getPlayerArmorCurrent() {
		return Integer.toString(this.playerArmorCurrentAmount);
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns {@code enemyArmorCurrentAmount} field value as a String.
	 */
	public String getEnemyArmorCurrent() {
		return Integer.toString(this.enemyArmorCurrentAmount);
	}
	
}