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
 * Version/date: 0.3.5 16 NOV 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for Mech superclass.
 * 
 */

public class Mech {
	
	private String mechName, mechColor, mechType = "No value set.";
	private int mechArmorAmount, mechArmorClass;
	private final int MECHWEAPONSLOT = 0;
	private MechEquipment[] mechLoadout = new MechEquipment[4];
	
	public Mech() {
		generateDefaultLoadout();
	}
	
	public Mech(String inputName, String inputColor) {
		generateDefaultLoadout();
		this.mechName = inputName;
		this.mechColor = inputColor;
	}
	
	public Mech( String inputName, String inputColor, int inputArmorAmount, int inputArmorClass) {
		generateDefaultLoadout();
		this.mechName = inputName;
		this.mechColor = inputColor;
		this.mechArmorAmount = inputArmorAmount;
		this.mechArmorClass = inputArmorClass;
	}
	
	public Mech( String inputName, String inputColor, int inputArmorAmount, int inputArmorClass, MechWeapon inputWeapon) {
		generateDefaultLoadout();
		this.mechName = inputName;
		this.mechColor = inputColor;
		this.mechArmorAmount = inputArmorAmount;
		this.mechArmorClass = inputArmorClass;
		this.mechLoadout[MECHWEAPONSLOT] = inputWeapon;
	}
	
	public void generateDefaultLoadout() {
		MechWeapon defaultWeapon = new MechWeapon();
		this.mechLoadout[MECHWEAPONSLOT] = defaultWeapon;
	}
	
	public String getMechType() {
		return this.mechType;
	}
	
	public void setMechType(String mechType) {
		this.mechType = mechType;
	}

	public String getMechName() {
		return this.mechName;
	}

	public void setMechName(String mechName) {
		this.mechName = mechName;
	}

	public String getMechColor() {
		return this.mechColor;
	}

	public void setMechColor(String mechColor) {
		this.mechColor = mechColor;
	}
	
	public int getMechArmorAmount() {
		return this.mechArmorAmount;
	}
	
	public String getMechArmorAmountString() {
		return Integer.toString(this.mechArmorAmount);
	}
	
	public void setMechArmorAmount(int inputArmorAmount) {
		this.mechArmorAmount = inputArmorAmount;
	}
	
	public void setMechArmorAmount(String inputArmorAmount) {
		this.mechArmorAmount = Integer.parseInt(inputArmorAmount);
	}
	
	public int getMechArmorClass() {
		return this.mechArmorClass;
	}
	
	public void setMechArmorClass(int inputArmorClass) {
		this.mechArmorClass = inputArmorClass;
	}
	
	public MechEquipment[] getMechLoadout() {
		return this.mechLoadout;
	}
	
	public String getMechWeaponType() {
		if (this.mechLoadout[MECHWEAPONSLOT] instanceof Sword) {
			return "Sword";
		}
		else {
			return "None";
		}
	}
	public MechWeapon getMechWeapon() {
		return (MechWeapon) this.mechLoadout[MECHWEAPONSLOT];
	}
	public void setMechWeapon(MechWeapon inputWeapon) {
		this.mechLoadout[MECHWEAPONSLOT] = inputWeapon;
	}
}