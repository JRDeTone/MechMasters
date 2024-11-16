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
 * Provides fields and methods for the MediumMech class.
 * 
 */

public class MediumMech extends Mech {
	private int mediumArmorAmount = 15;
	private int mediumArmorClass = 1;
	private final BeamRifle beamRifle = new BeamRifle();
	
	public MediumMech() {
		this.setMechType("Medium Mech");
		this.setMechArmorAmount(mediumArmorAmount);
		this.setMechArmorClass(mediumArmorClass);
		this.setMechWeapon(beamRifle);
	}
	
	public MediumMech( String inputName, String inputColor) {
		super(inputName, inputColor);
		this.setMechType("Medium Mech");
		this.setMechArmorAmount(mediumArmorAmount);
		this.setMechArmorClass(mediumArmorClass);
		this.setMechWeapon(beamRifle);
	}

}
