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
 * Provides fields and methods for {@code MachineGun} subclass of {@code MechWeapon}.
 * 
 */
public class MachineGun extends MechWeapon implements AmmoSystem{
	
	private static final int MACHINE_GUN_DAMAGE_TYPE = 3;
	private static int MACHINE_GUN_DAMAGE_AMOUNT = 1;
	private int ammoAmount = 24;
	private int ammoType = 1;
	private static final String WEAPON_NAME = "Machine Gun";
	/**
	 * Constructor for {@code MachineGun}.
	 * @param int damageType Holds damage type.
	 * @param int damageAmount Holds damage amount.
	 * @param int ammoAmount Holds ammo amount.
	 * @param int ammoType Holds ammo type.
	 * @param String WEAPON_NAME Holds the weapon name.
	 */
	public MachineGun() {
		super(MACHINE_GUN_DAMAGE_TYPE, MACHINE_GUN_DAMAGE_AMOUNT, WEAPON_NAME);
	}

	/**
	 * @return Returns the ammo amount as an int.
	 */
	@Override
	public int getAmmoAmount() {
		return this.ammoAmount;
	}
	/**
	 * Sets the ammo amount from a passed int.
	 */
	@Override
	public void setAmmoAmount(int inputAmmoAmount) {
		this.ammoAmount = inputAmmoAmount;
		
	}
	/**
	 * @return Returns the ammo type as an int.
	 */
	@Override
	public int getAmmoType() {
		return this.ammoType;
	}
	/**
	 * Sets the ammo type from a passed int.
	 */
	@Override
	public void setAmmoType(int inputAmmoType) {
		this.ammoType = inputAmmoType;	
	}
}
