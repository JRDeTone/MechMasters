package MechSystems;
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
 * Provides fields and methods for the MechWeapon superclass.
 * 
 */
public class MechWeapon extends MechEquipment {
	private int damageType = 0;
	private int damageAmount = 0;
	
	public MechWeapon() {
		
	}
	
	public MechWeapon(int inputDamageType, int inputDamageAmount) {
		this.damageType = inputDamageType;
		this.damageAmount = inputDamageAmount;
	}
	
	public int getDamageType() {
		return damageType;
	}

	public void setDamageType(int inputDamageType) {
		this.damageType = inputDamageType;
	}

	public int getDamageAmount() {
		return damageAmount;
	}

	public void setDamageAmount(int inputDamageAmount) {
		this.damageAmount = inputDamageAmount;
	}

}
