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
 * Version/date: 0.3 27 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the sword subclass.
 * 
 */
public class Sword extends MechWeapon {
	private static final int SWORD_DAMAGE_TYPE = 0;
	private static final int SWORD_DAMAGE_AMOUNT = 3;
	private static final String WEAPON_NAME = "Sword";
	
	public Sword() {
		super(SWORD_DAMAGE_TYPE, SWORD_DAMAGE_AMOUNT, WEAPON_NAME);
	}
}