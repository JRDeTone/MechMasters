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
 * Version/date: 0.3.5 16 NOV 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for {@code Mech} superclass.
 * 
 */
public class Mech {
	
	private String mechName, mechColor, mechType = "No value set.";
	private int mechArmorAmount, mechArmorClass;
	private static final int MECH_WEAPON_SLOT = 0;
	private final int LOADOUT_SIZE = 1;
	private MechEquipment[] mechLoadout = new MechEquipment[LOADOUT_SIZE];
	
	/**
	 * Constructor for {@code Mech}. When any {@code Mech} constructor is instantiated, the method {@code generateDefaultLoadout()} is called.
	 * This method is called to ensure that all default parameters are setup to void possible null pointer errors.
	 */
	public Mech() {
		generateDefaultLoadout();
	}
	
	/**
	 * @param inputName String value for {@code mechName} field.
	 * @param inputColor String value for {@code mechColor} field.
	 */
	public Mech(String inputName, String inputColor) {
		generateDefaultLoadout();
		this.mechName = inputName;
		this.mechColor = inputColor;
	}
	
	/**
	 * @param inputName String value for {@code mechName} field.
	 * @param inputColor String value for {@code mechColor} field.
	 * @param inputArmorAmount int value for {@code inputArmorAmount} field.
	 * @param inputArmorClass int value for {@code inputArmorClass} field.
	 */
	public Mech(String inputName, String inputColor, int inputArmorAmount, int inputArmorClass) {
		generateDefaultLoadout();
		this.mechName = inputName;
		this.mechColor = inputColor;
		this.mechArmorAmount = inputArmorAmount;
		this.mechArmorClass = inputArmorClass;
	}
	
	/**
	 * @param inputName String value for {@code mechName} field.
	 * @param inputColor String value for {@code mechColor} field.
	 * @param inputArmorAmount int value for {@code inputArmorAmount} field.
	 * @param inputArmorClass int value for {@code inputArmorClass} field.
	 * @param inputWeapon {@code MechWeapon} object for {@code mechLoadout} array.
	 */
	public Mech(String inputName, String inputColor, String inputType, int inputArmorAmount, int inputArmorClass, MechWeapon inputWeapon) {
		this.mechName = inputName;
		this.mechColor = inputColor;
		this.mechType = inputType;
		this.mechArmorAmount = inputArmorAmount;
		this.mechArmorClass = inputArmorClass;
		this.mechLoadout[MECH_WEAPON_SLOT] = inputWeapon;
	}
	/**
	 * Generates a default loadout to help prevent null pointer errors in the event a {@code Mech} object is created without one.
	 */
	private final void generateDefaultLoadout() {
		MechWeapon defaultWeapon = new MechWeapon();
		this.mechLoadout[MECH_WEAPON_SLOT] = defaultWeapon;
	}
	
	/**
	 * Returns {@code mechType} field value.
	 * @return Returns {@code mechType} field value as a String.
	 */
	public String getMechType() {
		return this.mechType;
	}
	
	/**
	 * Sets the {@code mechType} field value.
	 * @param mechType String value for {@code mechType} field.
	 */
	public void setMechType(String mechType) {
		this.mechType = mechType;
	}

	/**
	 * Returns {@code mechName} field value.
	 * @return Returns {@code mechName} field value as a String.
	 */
	public String getMechName() {
		return this.mechName;
	}

	/**
	 * Sets the {@code mechName} field value.
	 * @param mechName String value for {@code mechName} field.
	 */
	public void setMechName(String mechName) {
		this.mechName = mechName;
	}

	/**
	 * Returns {@code mechColor} field value.
	 * @return Returns {@code mechColor} field value as a String.
	 */
	public String getMechColor() {
		return this.mechColor;
	}

	/**
	 * Sets {@code mechColor} field value.
	 * @param mechColor String value for {@code mechName} field.
	 */
	public void setMechColor(String mechColor) {
		this.mechColor = mechColor;
	}
	
	/**
	 * Returns {@code mechArmorAmount} field value.
	 * @return Returns {@code mechArmorAmount} field value as a int.
	 */
	public int getMechArmorAmount() {
		return this.mechArmorAmount;
	}
	
	/**
	 * Returns {@code mechArmorAmount} field value.
	 * @return Returns {@code mechArmorAmount} field value as a String.
	 */
	public String getMechArmorAmountString() {
		return Integer.toString(this.mechArmorAmount);
	}
	
	/**
	 * Sets {@code mechArmorAmount} field value.
	 * @param inputArmorAmount int value for {@code mechArmorAmount} field.
	 */
	public void setMechArmorAmount(int inputArmorAmount) {
		this.mechArmorAmount = inputArmorAmount;
	}
	
	/**
	 * Sets {@code mechArmorAmount} field value.
	 * @param inputArmorAmount String value for {@code mechArmorAmount} field.
	 */
	public void setMechArmorAmount(String inputArmorAmount) {
		this.mechArmorAmount = Integer.parseInt(inputArmorAmount);
	}
	
	/**
	 * Returns {@code mechArmorClass} field value.
	 * @return Returns {@code mechArmorClass} field value as an int.
	 */
	public int getMechArmorClass() {
		return this.mechArmorClass;
	}
	
	/**
	 * Sets {@code mechArmorClass} field value.
	 * @param inputArmorClass int value for {@code mechArmorClass} field.
	 */
	public void setMechArmorClass(int inputArmorClass) {
		this.mechArmorClass = inputArmorClass;
	}
	
	/**
	 * Returns {@code mechLoadout} field.
	 * @return Returns {@code mechLoadout} array.
	 */
	public MechEquipment[] getMechLoadout() {
		return this.mechLoadout;
	}
	
	/**
	 * Returns {@code mechWeapon} name.
	 * @return Returns the {@code equipmentName} field value from {@code mechWeapon} object stored in the {@code mechLoadout} array
	 * as a String.
	 */
	public String getMechWeaponName() {
	return this.mechLoadout[MECH_WEAPON_SLOT].getEquipmentName();
	}
	/**
	 * Returns {@code mechWeapon}.
	 * @return Returns {@code mechWeapon} object stored in {@code mechLoadout} array.
	 */
	public MechWeapon getMechWeapon() {
		return (MechWeapon) this.mechLoadout[MECH_WEAPON_SLOT];
	}
	/**
	 * Sets {@code mechWeapon} object stored in {@code mechLoadout} array.
	 * @param inputWeapon {@code mechWeapon} object to be loaded in to {@code mechLoadout} array.
	 */
	public void setMechWeapon(MechWeapon inputWeapon) {
		this.mechLoadout[MECH_WEAPON_SLOT] = inputWeapon;
	}
}