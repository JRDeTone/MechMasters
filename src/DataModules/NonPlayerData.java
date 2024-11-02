package DataModules;
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
 * Provides fields and methods for the NonPlayerData class.
 * 
 */

import java.util.ArrayList;

import CharacterSystems.NonPlayerCharacter;
import MechSystems.Mech;

public class NonPlayerData {
	
	private ArrayList<Mech> enemyMechArrayList = new ArrayList<Mech>();
	private ArrayList<NonPlayerCharacter> npcArrayList = new ArrayList<NonPlayerCharacter>();
	
	public NonPlayerData() {
		
	}

}
