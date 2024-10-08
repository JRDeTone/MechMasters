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
 * Provides fields and methods for the LightMech subclass of the Mech superclass.
 * 
 */

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