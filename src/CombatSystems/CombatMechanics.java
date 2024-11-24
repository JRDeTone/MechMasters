package CombatSystems;
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
 * Version/date: 0.3.01 31 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the CombatMechanics class.
 * 
 */

import CharacterSystems.EntityComponentGenerator;
import CharacterSystems.NonPlayerCharacter;
import MechSystems.Mech;

public class CombatMechanics {
	private final int ARMORCLASSFAILDAMAGE = 1;
	private Mech playerMech;
	private Mech enemyMech;
	private NonPlayerCharacter npc;
	private int playerDamageAmount, enemyDamageAmount, playerArmorCurrentAmount,
	enemyArmorCurrentAmount, 
	playerArmorClass, enemyArmorClass;
	
	public CombatMechanics() {

	}
	
	public void setPlayerMech(Mech inputPlayerMech) {
		this.playerMech = inputPlayerMech;
	}
	
	public void setPlayerCombatData() {
		this.playerDamageAmount = this.playerMech.getMechWeapon().getDamageAmount();
		this.playerArmorCurrentAmount = this.playerMech.getMechArmorAmount();
		this.playerArmorClass = this.playerMech.getMechArmorClass();
	}
	
	public void setEnemyMech() {
		this.enemyMech = EntityComponentGenerator.iNeedAMech();
	}
	
	public void setEnemy() {
		this.npc = EntityComponentGenerator.iNeedACharacter();
	}
	
	public void setEnemyCombatData() {
		this.enemyDamageAmount = this.enemyMech.getMechWeapon().getDamageAmount();
		this.enemyArmorCurrentAmount = this.enemyMech.getMechArmorAmount();
		this.enemyArmorClass = this.enemyMech.getMechArmorClass();
	}
	
	public boolean playerAttackAction() {

		if (this.playerDamageAmount > this.enemyArmorClass) {
			this.enemyArmorCurrentAmount = this.enemyArmorCurrentAmount - this.playerDamageAmount;
		}
		else {
			this.enemyArmorCurrentAmount = this.enemyArmorCurrentAmount - ARMORCLASSFAILDAMAGE;
		}
		
		if (this.enemyArmorCurrentAmount > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean enemyAttackAction() {

		if (this.enemyDamageAmount > this.playerArmorClass) {
			this.playerArmorCurrentAmount = this.playerArmorCurrentAmount - this.enemyDamageAmount;
		}
		else {
			this.playerArmorCurrentAmount = this.playerArmorCurrentAmount - ARMORCLASSFAILDAMAGE;
		}
		
		if (this.playerArmorCurrentAmount > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getEnemyName() {
		return npc.getCharacterName();
	}
	
	public String getEnemyMechName() {
		return this.enemyMech.getMechName();
	}
	
	public String getEnemyMechColor() {
		return this.enemyMech.getMechColor();
	}
	
	public String getEnemyMechType() {
		return this.enemyMech.getMechType();
	}
	
	public String getPlayerArmorCurrent() {
		return Integer.toString(this.playerArmorCurrentAmount);
	}
	
	public String getEnemyArmorCurrent() {
		return Integer.toString(this.enemyArmorCurrentAmount);
	}
	
}