package CombatSystems;
/**
 * Lead Author(s):
 * 
 * @author Joe DeTone
 * 
 * References:
 * 
 * Version/date: 0.1 16 Nov 2024
 * 
 * Responsibilities of class:
 * 
 * Contains methods used to generate combat encounter feedback text using {@code Random} to determine what data is pushed to the UI.
 * 
 */
public class SoundsOfBattle {
	
	/**
	 * Generates combat encounter feedback text for the player using random 0-9 passed from {@code GUIController}
	 * @param lyricSeed Provides the int value required for the switch case.
	 * @return Returns a String based on pass argument.
	 */
	public static String playerSong(int lyricSeed) {
		String playerLyrics = switch (lyricSeed) {
		case 0 -> "This burning...like my veins are filled with nothing but gasoline\n"
				+ "   And with a spark...\n"
				+ "it's gonna' be the biggest fire you've ever SEEN!";
		case 1 -> "Cut me down or let me run...either way it's all gonna' burn!\n"
				+ "   It's the only way you'll ever learn...";
		case 2 -> "And I hear nothin' but the static\n"
				+ "  The static on the radio...\n"
				+ "I feel a fever comin' over me\n"
				+ "   Burning out of control!";
		case 3 -> "Show the world, keep the flow\n"
				+ "   Shattared so many dreams...\n"
				+ "Show the world, still can't see how the story ends!";
		case 4 -> "Can you feel life movin' through your mind?\n"
				+ "   Ooh, looks like you came back for more, yeah!\n"
				+ "Can you feel time slippin' down your spine?\n"
				+ "  Ooh, you try and tryin' to ignore, yeah!";
		case 5 -> "The enenmy will try to give me fear...\n"
				+ "   But never gonna run, never gonna hide.\n"
				+ "Take them down. Fight...Fight. FIIIIGHT!";
		case 6 -> "Think you're tough, think you're strong?\n"
				+ "   I see you now, the plan is clear. Find the weak spot.\n"
				+ "Never show 'em fear, cause I'm the winning side!";
		case 7 -> "You have a reason, you have a rhyme...\n"
				+ "   But you've gone and crossed my line.\n"
				+ "I'm gonna bring you down this time!";
		case 8 -> "I was going into Tosche station.\n"
				+ "  To pick up some power converts.\n"
				+ "It just isn't fair, I'm never gonna get of here!";
		case 9 -> "Keeping up the pace...\n"
				+ "   Keeping up with the quickness...\n"
				+ "Keep the lightning; bottled, throttled, throttle to the finsh!";
		default -> "De'folt Exseeyon";
		};
		
		return playerLyrics;	
	}
	/**
	 * Generates combat encounter feedback text for the opponent using a random 0-9 passed from {@code GUIController}
	 * @param lyricSeed Provides the int value required for the switch case.
	 * @return Returns a String based on argument supplied.
	 */
	public static String enemySong(int lyricSeed) {
		String enemyLyrics = switch (lyricSeed) {
		case 0 -> "Sleepin' like-ah soldier trapped inside an iron lung\n"
				+ "   Machines can keep ya breathing...\n"
				+ "But wha 'appens when you findah new war's BEGUN?!";
		case 1 -> "Flip ah switch an' turn it off; you won' be able tah breathe!\r\n"
				+ "  So eithah way yer a casualty...";
		case 2 -> "There's no machine that can stop me\r\n"
				+ "  And you'll soon see\r\n"
				+ "I've come fer vengeance\r\n"
				+ "  And I'm ready, and I'm willing, and I'm prepared tah-";
		case 3 -> "Spent our lives in shadows\n"
				+ "  Hiddin' off the radar...\n"
				+ "I see you now as the pressure builds";
		case 4 -> "I am the Eggman, that's what I am\n"
				+ "  I am the Eggman, I got the master plan\n"
				+ "I am the Eggman, that's what I am\n"
				+ "  I am the Eggman, with the master plan!";
		case 5 -> "So you fell into tha danger!\n"
				+ "  And you're all alone tonight...\n"
				+ "Well ya surrounded by the hurtin' type!\n"
				+ "  Who will come runnin' to ya side, who will protect ya from your fright?!";
		case 6 -> "It's your move.\n"
				+ "   Choose your side, cause the winners win and the losers lose.\n"
				+ "Cause I am the one you should fear the most.\n"
				+ "   I am the the one that will take you down!";
		case 7 -> "Have you in my sights.\n"
				+ "   Will find your weakness.\n"
				+ "I will shatter your chances now!";
		case 8 -> "Fire as shadows clash.\n"
				+ "   Forgotten footfalls engraved in ash.\n"
				+ "Fire will be repaid, 'fore our echoes begin to fade!";
		case 9 -> "Sonic boom, rings out loud from the engines.\n"
				+ "   Ironclad murder gonna 'liminate the distance!\n"
				+ "Accelerating past ya, gonna blast ya!";
		default -> "De'folt Exseeyon";
		};
		
		return enemyLyrics;	
	}

}