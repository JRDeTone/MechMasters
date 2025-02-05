package MechSystems;
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
 * Provides fields and methods for the MechWeapon class that has MechEquipment as abstract.
 * 
 */
public class MechWeapon extends MechEquipment {
	private int damageType = 0;
	private int damageAmount = 0;
	
	/**
	 * Constructor.
	 */
	public MechWeapon() {
		
	}
	
	/**
	 * Constructor that creates {@code mechWeapon} object with supplied arguments.
	 * @param inputDamageType Sets {@code damageType} field value with supplied int.
	 * @param inputDamageAmount Sets {@code damageAmount} field value with supplied int.
	 * @param inputWeaponName Sets {@code weaponName} field value with supplied String.
	 */
	public MechWeapon(int inputDamageType, int inputDamageAmount, String inputWeaponName) {
		super(inputWeaponName);
		this.damageType = inputDamageType;
		this.damageAmount = inputDamageAmount;
	}
	
	/**
	 * Returns {@code damageType} field value.
	 * @return Returns {@code damageType} field value as an int.
	 */
	public int getDamageType() {
		return damageType;
	}

	/**
	 * Sets {@code damageType} field value.
	 * @param inputDamageType Sets {@code damageType} field value with supplied int.
	 */
	public void setDamageType(int inputDamageType) {
		this.damageType = inputDamageType;
	}

	/**
	 * Returns {@code damageType} field value.
	 * @return
	 */
	public int getDamageAmount() {
		return damageAmount;
	}

	/**
	 * Sets {@code damageType} field value.
	 * @param inputDamageAmount inputDamageType Sets {@code damageType} field value with supplied int.
	 */
	public void setDamageAmount(int inputDamageAmount) {
		this.damageAmount = inputDamageAmount;
	}
}
