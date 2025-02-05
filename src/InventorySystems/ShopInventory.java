package InventorySystems;
import java.util.HashMap;
import java.util.Random;

import MechSystems.BeamRifle;
import MechSystems.MachineGun;
import MechSystems.MechEquipment;
import MechSystems.MechPartArms;
import MechSystems.MechPartChest;
import MechSystems.MechPartEngine;
import MechSystems.MechPartHead;
import MechSystems.MechPartLegs;
import MechSystems.MechPartSensors;
import MechSystems.MechPartSpecial;
import MechSystems.MechWeapon;
import MechSystems.Sword;

public class ShopInventory {
	
	private static final HashMap<String, MechEquipment[]> SHOP_INVENTORY = new HashMap<String, MechEquipment[]>();
	private static final Random SEED = new Random();
	private static final int SEED_RANGE = 4;
	private static final int INVENTORY_SIZE = 4;
	private static final MechWeapon[] WEAPON_INVENTORY = new MechWeapon[INVENTORY_SIZE];
	private static final MechPartHead[] HEAD_PART_INVENTORY = new MechPartHead[INVENTORY_SIZE];
	private static final MechPartChest[] CHEST_PART_INVENTORY = new MechPartChest[INVENTORY_SIZE];
	private static final MechPartArms[] ARMS_PART_INVENTORY = new MechPartArms[INVENTORY_SIZE];
	private static final MechPartLegs[] LEGS_PART_INVENTORY = new MechPartLegs[INVENTORY_SIZE];
	private static final MechPartSensors[] SENSORS_PART_INVENTORY = new MechPartSensors[INVENTORY_SIZE];
	private static final MechPartEngine[] ENGINE_PART_INVENTORY= new MechPartEngine[INVENTORY_SIZE];
	private static final MechPartSpecial[] SPECIAL_PART_INVENTORY = new MechPartSpecial[INVENTORY_SIZE];

	
	public ShopInventory() {
		
		SHOP_INVENTORY.put("Weapons", WEAPON_INVENTORY);
		SHOP_INVENTORY.put("Head Parts", HEAD_PART_INVENTORY);
		SHOP_INVENTORY.put("Chest Parts", CHEST_PART_INVENTORY);
		SHOP_INVENTORY.put("Legs Parts", ARMS_PART_INVENTORY);
		SHOP_INVENTORY.put("Sensor Parts", LEGS_PART_INVENTORY);
		SHOP_INVENTORY.put("Engine Parts", SENSORS_PART_INVENTORY);
		SHOP_INVENTORY.put("Special Parts", ENGINE_PART_INVENTORY);
		SHOP_INVENTORY.put("Special Parts", SPECIAL_PART_INVENTORY);	
	}
	
	public MechWeapon GenerateWeapon() {
		MechWeapon outputWeapon = switch (SEED.nextInt(SEED_RANGE)){
			case 0 -> new MachineGun();
			case 1 -> new Sword();
			case 2 -> new BeamRifle();
			default -> new MechWeapon();
		};
		return outputWeapon;
	}
}
