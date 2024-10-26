package CombatSystems;

import java.util.HashMap;

import MechSystems.Mech;
import MechSystems.MechEquipment;
import MechSystems.MechWeapon;

public class CombatMechanics {
	
//	private final int LOADOUTSLOTCOLUMNS = 4;
//	private final int LOADOUTSLOTROWS = 1;
	
	
//	public void combinedEquipmentLoadout(MechEquipment[] playerMech, MechEquipment[] enemyMech) {
//		int columnCount = 0;
//		MechEquipment[][] mechLoadout = new MechEquipment[LOADOUTSLOTROWS][LOADOUTSLOTCOLUMNS];
//		for (MechEquipment i : playerMech) {
//			mechLoadout[LOADOUTSLOTROWS - 1][columnCount++] = i;
//		}
//		for (MechEquipment i : enemyMech) {
//			mechLoadout[LOADOUTSLOTROWS][columnCount++] = i;
//		}
//	}
	
//	public void equipmentLoadout(MechEquipment[] playerMech, MechEquipment[] enemyMech) {
//		HashMap<String, MechEquipment[]> combinedLoadout = new HashMap<>();
//		combinedLoadout.put("PlayerLoadout", playerMech);
//		combinedLoadout.put("EnemyLoadout", enemyMech);
//	}
	
	
//	public void damageValuesArray(MechEquipment playerMech, MechEquipment enemyMech) {
//		int[] damageValues = new int[1];
//		
//	}
	
	public boolean combatPlayerActionAttack(Mech attackingMech, Mech defendingMech) {
//		Probably won't use this first one since it would need to load these fields every time.
//		int playerWeaponDamage = playerMech.getMechWeapon().getDamageAmount();
//		int enemyArmorClass = enemyMech.getMechArmorClass();
//		if (playerWeaponDamage > enemyArmorClass) {
//			enemyMech.setMechArmorAmount(enemyMech.getMechArmorAmount() - playerWeaponDamage);
//		}
		// Will likely go with this in the long run, less readable but would require less overhead.
		if (attackingMech.getMechWeapon().getDamageAmount() > defendingMech.getMechArmorClass()) {
			defendingMech.setMechArmorAmount(defendingMech.getMechArmorAmount() - attackingMech.getMechWeapon().getDamageAmount());
		}
		else {
			defendingMech.setMechArmorAmount(defendingMech.getMechArmorAmount() - 1);
		}
		
		if (defendingMech.getMechArmorAmount() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
