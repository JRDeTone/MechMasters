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
 * Version/date: 0.1 31 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for {@code HeavyMech} subclass of {@code Mech}.
 * 
 */
public class HeavyMech extends Mech{
	private static final int HEAVY_ARMOR_AMOUNT = 20;
	private static final int HEAVY_ARMOR_CLASS = 1;
	private static final String MECH_TYPE = "Heavy Mech";
	private static final MachineGun MACHINE_GUN = new MachineGun();
	/**
	 * Constructor for {@code HeavyMech}, subclass of {@code Mech}.
	 * @param int heavyArmorAmount Holds amount of armor.
	 * @param int heavyArmorClass Holds class of armor.
	 * @param final MachineGun Holds {@code MechWeapon} object.
	 */
	public HeavyMech(String inputName, String inputColor) {
		super(inputName, inputColor, MECH_TYPE, HEAVY_ARMOR_AMOUNT, HEAVY_ARMOR_CLASS, MACHINE_GUN);
	}


}
