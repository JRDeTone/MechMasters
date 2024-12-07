package CharacterSystems;
/**
 * Lead Author(s):
 * 
 * @author Joe DeTone
 * 
 * Other contributors:
 * 
 * References:
 * 
 * Version/date: 0.1 15 NOV 2024
 * 
 * Responsibilities of class:
 * 
 * {@code EntityComponentGenerator} provides methods to generate a name and a {@code Mech} object for use in {@code CombatMechanics}.
 */
import java.util.Random;
import MechSystems.HeavyMech;
import MechSystems.LightMech;
import MechSystems.Mech;
import MechSystems.MediumMech;

public class EntityComponentGenerator {
	/**
	* iNeedACharacter instantiates and returns a {@code NonPlayerCharacter} object and populates characterName field based on a random seed 0-9 by calling {@code Random}.
	* @param Random nameSeeder Instance of {@code Random}.
	* @param String characterName Character name depends on switch case outcome.
	* @return <STRONG>NonPlayerCharacter</STRONG> npc Returns a {@code NonPlayerCharacter} object.
	*/
	public static NonPlayerCharacter iNeedACharacter() {
		Random nameSeeder = new Random();
		String characterName = switch (nameSeeder.nextInt(10)) {
			case 0 -> "Cole Law";
			case 1 -> "Holden Baks";
			case 2 -> "Morry Christmas";
			case 3 -> "Capri Tsun";
			case 4 -> "Jimmy Two Easters";
			case 5 -> "Trystan Valentine";
			case 6 -> "Rendezvous Saint Patrick's Day";
			case 7 -> "Michael Sorbo";
			case 8 -> "Mike Sandoval";
			case 9 -> "Gane Jundam";
			default -> "De'folt Exseeyon";
		};
		NonPlayerCharacter npc = new NonPlayerCharacter(characterName);
		return npc;
	}
	/**
	* iNeedAMech instantiates and returns {@code Mech} object and populates the mechName and mechColor 
	* field based on a random seed 0-9 by calling {@code Random}. 
	* The mechType field is populated with a seed 0-2.
	* @param Random nameSeeder Instance of {@code Random}.
	* @param String mechName Mech name depends on switch case outcome.
	* @return <STRONG>Mech</STRONG> enemyMech Returns a {@code Mech} object.
	*/
	public static Mech iNeedAMech() {
		Random nameSeeder = new Random();
		String mechName = switch (nameSeeder.nextInt(10)) {
			case 0 -> "Big Zam";
			case 1 -> "Guntank";
			case 2 -> "Khul Johei";
			case 3 -> "ANX-PLR Custom";
			case 4 -> "GLK19";
			case 5 -> "A 2006 Nissan Murano";
			case 6 -> "Last Train Home";
			case 7 -> "C-GUSTAF";
			case 8 -> "AW-BNS Unit_RM";
			case 9 -> "Giga Oobly";
			default -> "De'folt Exseeyon";
		};
		
		String mechColor = switch (nameSeeder.nextInt(10)) {
			case 0 -> "Bastard-Amber";
			case 1 -> "Flame-of-Burnt-Brandy";
			case 2 -> "Lusty Gallant";
			case 3 -> "Pervenche";
			case 4 -> "Sang-de-Boeuf";
			case 5 -> "Verditer";
			case 6 -> "Zaffre";
			case 7 -> "Melichrous";
			case 8 -> "Smaragdine";
			case 9 -> "Skobeloff";
			default -> "De'folt Exseeyon";
		};
		
		int mechType = nameSeeder.nextInt(2);
			if (mechType == 0) {
				LightMech enemyMech = new LightMech (mechName, mechColor);
				return enemyMech;
			}
			else if (mechType == 1) {
				MediumMech enemyMech = new MediumMech (mechName, mechColor);
				return enemyMech;
			}
			else {
				HeavyMech enemyMech = new HeavyMech (mechName, mechColor);
				return enemyMech;
			}
	}
}
