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
 * Version/date: 0.3 27 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the {@code LightMech} subclass of {@code Mech}.
 * 
 */

public class LightMech extends Mech {
	private static final int LIGHT_ARMOR_AMOUNT = 10;
	private static final int LIGHT_ARMOR_CLASS = 1;
	private static final String MECH_TYPE = "Light Mech";
	private static final Sword SWORD = new Sword();
	/**
	 * Constructor for {@code LightMech}.
	 * @param inputName String value for {@code mechName} field.
	 * @param inputColor String value for {@code mechColor} field.
	 */
	public LightMech(String inputName, String inputColor) {
		super(inputName, inputColor, MECH_TYPE, LIGHT_ARMOR_AMOUNT, LIGHT_ARMOR_CLASS, SWORD);
	}
}