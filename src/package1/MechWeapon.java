package package1;

public class MechWeapon {
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
