package package1;

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