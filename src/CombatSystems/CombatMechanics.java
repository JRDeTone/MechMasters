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

import java.util.HashMap;
import MechSystems.Mech;
import MechSystems.MechEquipment;
import MechSystems.MechWeapon;

public class CombatMechanics {
	private final int ARMORCLASSFAILDAMAGE = 1;
	private Mech playerMech;
	private Mech enemyMech;
	private int playerDamageAmount, enemyDamageAmount, playerArmorAmount, enemyArmorAmount, 
	playerArmorClass, enemyArmorClass;
	
	public CombatMechanics() {
		
	}
	
	public CombatMechanics(Mech playerMech, Mech enemyMech) {
		this.playerMech = playerMech;
		this.enemyMech = enemyMech;
		this.playerDamageAmount = this.playerMech.getMechWeapon().getDamageAmount();
		this.enemyDamageAmount = this.enemyMech.getMechWeapon().getDamageAmount();
		this.playerArmorAmount = this.playerMech.getMechArmorAmount();
		this.enemyArmorAmount = this.enemyMech.getMechArmorAmount();
		this.playerArmorClass = this.playerMech.getMechArmorClass();
		this.enemyArmorClass = this.enemyMech.getMechArmorClass();
	}
	
	public boolean playerAttackAction() {

		if (this.playerDamageAmount > this.enemyArmorClass) {
			this.enemyMech.setMechArmorAmount(this.enemyArmorAmount - this.playerDamageAmount);
		}
		else {
			this.enemyMech.setMechArmorAmount(this.enemyArmorAmount - ARMORCLASSFAILDAMAGE);
		}
		
		if (this.enemyMech.getMechArmorAmount() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean enemyAttackAction() {

		if (this.enemyDamageAmount > this.playerArmorClass) {
			this.playerMech.setMechArmorAmount(this.playerArmorAmount - this.enemyDamageAmount);
		}
		else {
			this.playerMech.setMechArmorAmount(this.playerArmorAmount - ARMORCLASSFAILDAMAGE);
		}
		
		if (this.playerMech.getMechArmorAmount() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
