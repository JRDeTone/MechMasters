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
 * Version/date: 0.1 31 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the MachineGun class.
 * 
 */
public class MachineGun extends MechWeapon implements AmmoSystem{
	
	private int damageType = 3;
	private int damageAmount = 1;
	private int ammoAmount = 24;
	private int ammoType = 1;
	
	public MachineGun() {
		
	}

	@Override
	public int getAmmoAmount() {
		return this.ammoAmount;
	}

	@Override
	public void setAmmoAmount(int inputAmmoAmount) {
		this.ammoAmount = inputAmmoAmount;
		
	}

	@Override
	public int getAmmoType() {
		return this.ammoType;
	}

	@Override
	public void setAmmoType(int inputAmmoType) {
		this.ammoType = inputAmmoType;	
	}
}
