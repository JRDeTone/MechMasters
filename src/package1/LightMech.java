package package1;

public class LightMech extends Mech {
	private int lightArmorAmount = 10;
	private int lightArmorClass = 0;
	private final Sword sword = new Sword();
	
	public LightMech( String inputName, String inputColor) {
		super(inputName, inputColor);
		this.setMechArmorAmount(lightArmorAmount);
		this.setMechArmorClasst(lightArmorClass);
		this.setMechWeapon(sword);
	}
}