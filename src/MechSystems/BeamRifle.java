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
 * Provides fields and methods for {@code BeamRifle} subclass of {@code MechWeapon}.
 * 
 */
public class BeamRifle extends MechWeapon implements AmmoSystem{
	
	private final static int BEAM_DAMAGE_TYPE = 1;
	private final static int BEAM_DAMAGE_AMOUNT = 2;
	private int ammoAmount = 12;
	private int ammoType = 0;
	private final static String WEAPON_NAME = "Beam Rifle";
	/**
	 * Constructor for {@code BeamRifle}.
	 */
	public BeamRifle() {
		super(BEAM_DAMAGE_TYPE, BEAM_DAMAGE_AMOUNT, WEAPON_NAME);
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
	 * @param inputAmmoAmount int for ammo amount.
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
	 * @param inputAmmoType int for ammo type.
	 */
	@Override
	public void setAmmoType(int inputAmmoType) {
		this.ammoType = inputAmmoType;	
	}

}
