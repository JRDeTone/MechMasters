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
 * Provides fields and methods for the CombatMechanics class.
 * This class handles the internal logic for a combat encounter.
 * 
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
	* @param int ARMOR_CLASS_FAIL_DAMAGE Fall back damage state to resolve deadlocks.
	* @param Mech playerMech Instantiates a {@code} Mech} for the player.
	* @param Mech enemyMech Instantiates a {@code Mech} for the enemy.
	* @param NonPlayerCharacter Instantiates a {@code NonPlayerCharacter}.
	* @param int playerDamageAmount Local instance variable for internal logic use.
	* @param int enemyDamageAmount Local instance variable for internal logic use.
	* @param int playerArmorCurrentAmount Local instance variable for internal logic use.
	* @param int enemyArmorCurrentAmount Local instance variable for internal logic use.
	* @param int playerArmorClass Local instance variable for internal logic use.
	* @param int enemyArmorClass Local instance variable for internal logic use.
	*/
	public CombatMechanics() {

	}
	
	/**
	 * {@code combatSetup()} takes player's {@code Mech} object and 
	 * must be called prior to entering a combat encounter. 
	 * This method generates an opponent for the player and defines the local 
	 * variables for the class logic to use.
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
		
//		if(this.playerArmorClass == 0 && this.enemyArmorClass == 2) {
//			this.playerDamageAmount =
//		}
	}
	
	/**
	 * This method is used to determined the outcome of player attack action and
	 * updates values based on the result of the logic and checks if the encounter can continue.
	 * The {@code npc} field is set to null for garbage collection.
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
	 * This method is used to determined the outcome of enemy attack action and
	 * updates values based on the result of the logic and checks if the encounter can continue.
	 * The {@code npc} field is set to null for garbage collection.
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
	 * @return Returns the {@code characterName} value from the {@code npc} variable.
	 */
	public String getEnemyName() {
		return npc.getCharacterName();
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns the {@code mechName} value from the {@code enemyMech} variable.
	 */
	public String getEnemyMechName() {
		return this.enemyMech.getMechName();
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns the {@code mechColor} value from the {@code enemyMech} variable.
	 */
	public String getEnemyMechColor() {
		return this.enemyMech.getMechColor();
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns the {@code mechType} value from the {@code enemyMech} variable.
	 */
	public String getEnemyMechType() {
		return this.enemyMech.getMechType();
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns the {@code playerArmorCurrentAmount} variable as a {@code String} value.
	 */
	public String getPlayerArmorCurrent() {
		return Integer.toString(this.playerArmorCurrentAmount);
	}
	
	/**
	 * {@code GUIController} access method.
	 * @return Returns the {@code enemyArmorCurrentAmount} variable as a {@code String} value.
	 */
	public String getEnemyArmorCurrent() {
		return Integer.toString(this.enemyArmorCurrentAmount);
	}
	
}