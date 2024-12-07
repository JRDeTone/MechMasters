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
 * Provides constructor for {@code PlayerCharacterClass} subclass of {@code Character}.
 * 
 */
public class PlayerCharacter extends Character{
	/**
	* Constructor for {@code PlayerCharacter} with a passed in String argument for characterName field.
	* @param String inputName Player name.
	*/
	public PlayerCharacter(String inputName) {
		super(inputName);
	}
}
