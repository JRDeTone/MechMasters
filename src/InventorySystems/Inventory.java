package InventorySystems;

import java.util.HashMap;

import MechSystems.MechEquipment;
public abstract class Inventory {
	
	Inventory(){
		HashMap<String, MechEquipment> uiPanelsHashMap = new HashMap<String, MechEquipment>();
	}

}
