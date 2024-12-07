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
 * Provides fields and methods for MechEquipment abstract class.
 * 
 */
public abstract class MechEquipment {

//	private int equipmentCost;
//	private int equipmentWeight;
//	private int equipmentPowerRequirement;
//	private int equipmentHeatAmount;
	private String equipmentName = "Default";
	
	public MechEquipment(){
		
	}
	
	public MechEquipment(String inputEquipmentName) {
		this.equipmentName = inputEquipmentName;
	}
	
	public String getEquipmentName() {
		return this.equipmentName;
	}
	
	public void setEquipmentName(String inputEquipmentName) {
		this.equipmentName = inputEquipmentName;
	}
	
}
