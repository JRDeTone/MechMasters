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
 * Provides fields and methods for the MediumMech class.
 * 
 */

public class MediumMech extends Mech {
	private static final int MEDIUM_ARMOR_AMOUNT = 15;
	private static final int MEDIUM_ARMOR_CLASS = 1;
	private static final String MECH_TYPE = "Medium Mech";
	private static final BeamRifle BEAM_RIFLE = new BeamRifle();
	
	public MediumMech( String inputName, String inputColor) {
		super(inputName, inputColor, MECH_TYPE, MEDIUM_ARMOR_AMOUNT, MEDIUM_ARMOR_CLASS, BEAM_RIFLE);
	}

}
