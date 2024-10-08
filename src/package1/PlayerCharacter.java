package package1;
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
 * Version/date: 0.1 8 OCT 2024
 * 
 * Responsibilities of class:
 * 
 * Provides fields and methods for the PlayerCharacterClass.
 * 
 */
public class PlayerCharacter {
	private String playerCharacterName;
	private int playerCharacterAge;
	private int playerCharacterGender;
	
	public PlayerCharacter() {
		
	}
	
	public PlayerCharacter(String inputName, int inputAge, int inputGender) {
		this.playerCharacterName = inputName;
		this.playerCharacterAge = inputAge;
		this.playerCharacterGender = inputGender;
	}
	
	public String getPlayerCharacterName() {
		return this.playerCharacterName;
	}
	
	public void setPlayerCharacterName(String inputPlayerName) {
		this.playerCharacterName = inputPlayerName;
	}
	
	public int getPlayerCharacterAge() {
		return this.playerCharacterAge;
	}
	
	public void setPlayerCharacterAge(int inputAge) {
		this.playerCharacterAge = inputAge;
	}
	
	public int getPlayerCharacterGender() {
		return this.playerCharacterAge;
	}
	
	public void setPlayerCharacterGender(int inputGender) {
		this.playerCharacterGender = inputGender;
	}
}
