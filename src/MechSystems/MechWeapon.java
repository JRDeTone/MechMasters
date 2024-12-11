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
 * Provides fields and methods for the MechWeapon superclass.
 * 
 */
public class MechWeapon extends MechEquipment {
	private int damageType = 0;
	private int damageAmount = 0;
	
	/**
	 * 
	 */
	public MechWeapon() {
		
	}
	
	/**
	 * @param inputDamageType
	 * @param inputDamageAmount
	 * @param inputWeaponName
	 */
	public MechWeapon(int inputDamageType, int inputDamageAmount, String inputWeaponName) {
		super(inputWeaponName);
		this.damageType = inputDamageType;
		this.damageAmount = inputDamageAmount;
	}
	
	/**
	 * @return
	 */
	public int getDamageType() {
		return damageType;
	}

	/**
	 * @param inputDamageType
	 */
	public void setDamageType(int inputDamageType) {
		this.damageType = inputDamageType;
	}

	/**
	 * @return
	 */
	public int getDamageAmount() {
		return damageAmount;
	}

	/**
	 * @param inputDamageAmount
	 */
	public void setDamageAmount(int inputDamageAmount) {
		this.damageAmount = inputDamageAmount;
	}
}
