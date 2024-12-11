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
 * Provides fields and methods for MechEquipment abstract class.
 * 
 */
public abstract class MechEquipment {

//	private int equipmentCost;
//	private int equipmentWeight;
//	private int equipmentPowerRequirement;
//	private int equipmentHeatAmount;
	private String equipmentName = "Default";
	
	/**
	 * Constructor.
	 */
	public MechEquipment(){
		
	}
	
	/**
	 * Constructor with String argument.
	 * @param inputEquipmentName String for {@code equipmentName} field value.
	 */
	public MechEquipment(String inputEquipmentName) {
		this.equipmentName = inputEquipmentName;
	}
	
	/**
	 * Returns {@code equipmentName} field value.
	 * @return Returned {@code equipmentName} field value as a String.
	 */
	public String getEquipmentName() {
		return this.equipmentName;
	}
	
	/**
	 * Sets {@code equipmentName} field value.
	 * @param inputEquipmentName String for {@code equipmentName} field value.
	 */
	public void setEquipmentName(String inputEquipmentName) {
		this.equipmentName = inputEquipmentName;
	}
	
}
