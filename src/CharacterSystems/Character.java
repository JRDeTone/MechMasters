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

public abstract class Character {
	private String characterName;
	/**
	* Constructs {@code Character} object with supplied String argument for {@code characterName} field.
	* @param inputName String input for character name.
	*/
	public Character(String inputName) {
		this.characterName = inputName;
	}
	/**
	*  Returns {@code characterName} field as String value.
	* @return String characterName
	*/
	public String getCharacterName() {
		return this.characterName;
	}
	/**
	 * Sets {@code characterName} field with String argument.
	* @param inputName String argument for character name.
	*/
	public void setCharacterName(String inputName) {
		this.characterName = inputName;
	}
}
