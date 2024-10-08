package package1;

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
 * Version/date: 0.1 8 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for Mech superclass.
 * 
 */

public class Mech extends Vehicle {
	
	private String mechName, mechColor;
	private int mechArmorAmount, mechArmorClass;
	private MechWeapon weapon;
	
	public Mech() {
		
	}
	
	public Mech(String inputName, String inputColor) {
		this.mechName = inputName;
		this.mechColor = inputColor;
	}
	
	public Mech( String inputName, String inputColor, int inputArmorAmount, int inputArmorClass) {
		this.mechName = inputName;
		this.mechColor = inputColor;
		this.mechArmorAmount = inputArmorAmount;
		this.mechArmorClass = inputArmorClass;
	}
	
	public Mech( String inputName, String inputColor, int inputArmorAmount, int inputArmorClass, MechWeapon inputWeapon) {
		this.mechName = inputName;
		this.mechColor = inputColor;
		this.mechArmorAmount = inputArmorAmount;
		this.mechArmorClass = inputArmorClass;
		this.weapon = inputWeapon;
	}

	public String getMechName() {
		return mechName;
	}

	public void setMechName(String mechName) {
		this.mechName = mechName;
	}

	public String getMechColor() {
		return mechColor;
	}

	public void setMechColor(String mechColor) {
		this.mechColor = mechColor;
	}
	
	public int getMechArmorAmount() {
		return this.mechArmorAmount;
	}
	
	public void setMechArmorAmount(int inputArmorAmount) {
		this.mechArmorAmount = inputArmorAmount;
	}
	
	public int getMechArmorClass() {
		return this.mechArmorClass;
	}
	
	public void setMechArmorClasst(int inputArmorClass) {
		this.mechArmorClass = inputArmorClass;
	}
	
	public String getMechWeapon() {
		if (this.weapon instanceof Sword) {
			return "Sword";
		}
		else {
			return "None";
		}
	}
	
	public void setMechWeapon(MechWeapon inputWeapon) {
		this.weapon = inputWeapon;
	}
}