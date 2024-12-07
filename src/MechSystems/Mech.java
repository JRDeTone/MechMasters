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
 * Provides fields and methods for {@code Mech}.
 * 
 */
public class Mech {
	
	private String mechName, mechColor, mechType = "No value set.";
	private int mechArmorAmount, mechArmorClass;
	private static final int MECH_WEAPON_SLOT = 0;
	private final int LOADOUT_SIZE = 1;
	private MechEquipment[] mechLoadout = new MechEquipment[LOADOUT_SIZE];
	
	/**
	 * Constructor for {@code Mech}.  When any {@code Mech} constructor is instantiated, the method {@code generateDefaultLoadout()} is called.
	 * This method is called to ensure that all default parameters are setup to void possible null pointer errors.
	 *@param String mechName
	 *@param String mechColor
	 *@param String mechType
	 *@param int mechArmorAmount
	 *@param int mechArmorClass
	 *@param int MECH_WEAPON_SLOT
	 */
	public Mech() {
		generateDefaultLoadout();
	}
	
	/**
	 * @param inputName
	 * @param inputColor
	 */
	public Mech(String inputName, String inputColor) {
		generateDefaultLoadout();
		this.mechName = inputName;
		this.mechColor = inputColor;
	}
	
	/**
	 * @param inputName
	 * @param inputColor
	 * @param inputArmorAmount
	 * @param inputArmorClass
	 */
	public Mech(String inputName, String inputColor, int inputArmorAmount, int inputArmorClass) {
		generateDefaultLoadout();
		this.mechName = inputName;
		this.mechColor = inputColor;
		this.mechArmorAmount = inputArmorAmount;
		this.mechArmorClass = inputArmorClass;
	}
	
	/**
	 * @param inputName
	 * @param inputColor
	 * @param inputArmorAmount
	 * @param inputArmorClass
	 * @param inputWeapon
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
	 * 
	 */
	private final void generateDefaultLoadout() {
		MechWeapon defaultWeapon = new MechWeapon();
		this.mechLoadout[MECH_WEAPON_SLOT] = defaultWeapon;
	}
	
	/**
	 * @return
	 */
	public String getMechType() {
		return this.mechType;
	}
	
	/**
	 * @param mechType
	 */
	public void setMechType(String mechType) {
		this.mechType = mechType;
	}

	/**
	 * @return
	 */
	public String getMechName() {
		return this.mechName;
	}

	/**
	 * @param mechName
	 */
	public void setMechName(String mechName) {
		this.mechName = mechName;
	}

	/**
	 * @return
	 */
	public String getMechColor() {
		return this.mechColor;
	}

	/**
	 * @param mechColor
	 */
	public void setMechColor(String mechColor) {
		this.mechColor = mechColor;
	}
	
	/**
	 * @return
	 */
	public int getMechArmorAmount() {
		return this.mechArmorAmount;
	}
	
	/**
	 * @return
	 */
	public String getMechArmorAmountString() {
		return Integer.toString(this.mechArmorAmount);
	}
	
	/**
	 * @param inputArmorAmount
	 */
	public void setMechArmorAmount(int inputArmorAmount) {
		this.mechArmorAmount = inputArmorAmount;
	}
	
	/**
	 * @param inputArmorAmount
	 */
	public void setMechArmorAmount(String inputArmorAmount) {
		this.mechArmorAmount = Integer.parseInt(inputArmorAmount);
	}
	
	/**
	 * @return
	 */
	public int getMechArmorClass() {
		return this.mechArmorClass;
	}
	
	/**
	 * @param inputArmorClass
	 */
	public void setMechArmorClass(int inputArmorClass) {
		this.mechArmorClass = inputArmorClass;
	}
	
	/**
	 * @return
	 */
	public MechEquipment[] getMechLoadout() {
		return this.mechLoadout;
	}
	
	/**
	 * @return
	 */
	public String getMechWeaponName() {
	return this.mechLoadout[MECH_WEAPON_SLOT].getEquipmentName();
	}
	/**
	 * @return
	 */
	public MechWeapon getMechWeapon() {
		return (MechWeapon) this.mechLoadout[MECH_WEAPON_SLOT];
	}
	/**
	 * @param inputWeapon
	 */
	public void setMechWeapon(MechWeapon inputWeapon) {
		this.mechLoadout[MECH_WEAPON_SLOT] = inputWeapon;
	}
}