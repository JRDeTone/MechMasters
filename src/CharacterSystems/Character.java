package CharacterSystems;
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
 * Provides fields and methods for the Character superclass.
 * 
 */

public class Character {
	private String characterName;
	
	public Character() {
		
	}
	
	public Character(String inputName) {
		this.characterName = inputName;
	}
	
	public String getCharacterName() {
		return this.characterName;
	}
	
	public void setCharacterName(String inputName) {
		this.characterName = inputName;
	}
}
