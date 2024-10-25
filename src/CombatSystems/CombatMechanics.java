package CombatSystems;

import java.util.HashMap;

import MechSystems.Mech;
import MechSystems.MechEquipment;
import MechSystems.MechWeapon;

public class CombatMechanics {
	
	private final int LOADOUTSLOTCOLUMNS = 4;
	private final int LOADOUTSLOTROWS = 1;
	
	
	public void combinedEquipmentLoadout(MechEquipment[] playerMech, MechEquipment[] enemyMech) {
		int columnCount = 0;
		MechEquipment[][] mechLoadout = new MechEquipment[LOADOUTSLOTROWS][LOADOUTSLOTCOLUMNS];
		for (MechEquipment i : playerMech) {
			mechLoadout[LOADOUTSLOTROWS - 1][columnCount++] = i;
		}
		for (MechEquipment i : enemyMech) {
			mechLoadout[LOADOUTSLOTROWS][columnCount++] = i;
		}
	}
	
	public void equipmentLoadout(MechEquipment[] playerMech, MechEquipment[] enemyMech) {
		HashMap<String, MechEquipment[]> combinedLoadout = new HashMap<>();
		combinedLoadout.put("PlayerLoadout", playerMech);
		combinedLoadout.put("EnemyLoadout", enemyMech);
	}
	
	
	public void damageValuesArray(HashMap inputMap) {
		int[] damageValues = new int[1];
		
	}
	
	public boolean combatPlayerActionAttack(Mech playerMech, Mech enemyMech) {
		
		MechWeapon playerWeapon = playerMech.getMechWeapon();
		MechWeapon enemyWeapon = enemyMech.getMechWeapon();
		
		
	}

}
