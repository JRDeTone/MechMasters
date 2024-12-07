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
 * Version/date: 0.3 27 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the {@code Character} superclass.
 * 
 */

public class Character {
	private String characterName;
	
	/**
	*	Constructor for Character objects.
	* @param characterName String value the represents a character's name.
	*/
	public Character() {
		
	}
	/**
	*	Constructs a Character object with the specified String argument.
	* @param text
	*/
	public Character(String inputName) {
		this.characterName = inputName;
	}
	/**
	*  Returns the characterName field as a String value.
	* @return String characterName
	*/
	public String getCharacterName() {
		return this.characterName;
	}
	/**
	 * Accepts a String argument and assigns it to String characterName field.
	* @param inputName
	*/
	public void setCharacterName(String inputName) {
		this.characterName = inputName;
	}
}
