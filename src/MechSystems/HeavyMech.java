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
 * Provides fields and methods for the HeavyMech class.
 * 
 */
public class HeavyMech extends Mech{
	private int heavyArmorAmount = 15;
	private int heavyArmorClass = 1;
	private final MachineGun machineGun = new MachineGun();
	
	public HeavyMech() {
		this.setMechArmorAmount(heavyArmorAmount);
		this.setMechArmorClass(heavyArmorClass);
		this.setMechWeapon(machineGun);
	}
	
	public HeavyMech( String inputName, String inputColor) {
		super(inputName, inputColor);
		this.setMechArmorAmount(heavyArmorAmount);
		this.setMechArmorClass(heavyArmorClass);
		this.setMechWeapon(machineGun);
	}


}
