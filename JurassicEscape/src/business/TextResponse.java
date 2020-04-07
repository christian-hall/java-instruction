package business;

public class TextResponse {

	public static String intro() {
		String intro = "---------------Jurassic Escape---------------\n"
				+ "                            by Christian Hall\n" + "                                     ver. 1.2\n"
				+ "---------------------------------------------\n" + "\n"
				+ "You are a Jurassic Park security guard. While\n" + "the rest of the park employees are on a short\n"
				+ "company retreat to Cancun, you are left behind\n" + "to keep an eye on the animals and make sure\n"
				+ "everything is where it is supposed to be. Your\n" + "boss said no animal should escape from their\n"
				+ "enclosures. Just to be safe though, you are\n" + "told to check the velociraptor enclosure often\n"
				+ "to make sure they are all accounted for.\n" + "---------------------------------------------\n"
				+ "\n";
		return intro;
	}

	// yesCheck text responses
	public static String yesCheck(int raptorEscapeChance) {
		String checkResponse = "";
		if (raptorEscapeChance < 6) {
			checkResponse = "All raptors are accounted for. \n";
		} else if (raptorEscapeChance > 5) {
			checkResponse = "The raptors have chewed through the electric fence! Run! \n";
		}
		return checkResponse;
	}

	// noCheck text responses
	public static String noCheck(int raptorEscapeChance) {
		String checkResponse = "";
		if (raptorEscapeChance == 1) {
			checkResponse = "You think to yourself, 'maybe I should have \n"
					+ "checked the fence' and start to worry, but \n" + "then you shrug off the worry and continue \n"
					+ "eating the ice cream from the freezer. Life \n" + "is good! \n";
		} else if (raptorEscapeChance == 2) {
			checkResponse = "You don't have time to check the raptor pen\n"
					+ "now! You're too busy playing a Java game\n" + "about whether or not to check the raptor pen!\n";
		} else if (raptorEscapeChance == 3) {
			checkResponse = "<sound of loud snoring>\n";
		} else if (raptorEscapeChance == 4) {
			checkResponse = "Open bar? No one is really going to know if a\n"
					+ "few shots of Lagavulin go missing!\n";
		} else if (raptorEscapeChance == 5) {
			checkResponse = "<phone ringing> 'Hi mom! Don't worry about me,\n"
					+ "we've been assured that no dinosaurs can escape\n"
					+ "from their enclosures. Mr. Hammond himself walks\n"
					+ "the grounds every day to see the animals.'\n";
		} else if (raptorEscapeChance > 5) {
			checkResponse = "A snarl pierces the room. You don't have time \n"
					+ "to turn around as you're tackled to the ground \n"
					+ "You think, 'I should have checked on the raptors', \n"
					+ "as your vision starts to fade into darkness...\n";
		}
		return checkResponse;
	}
	
	public static String escapeText() { 
		String escapeText = "You call the security supervisor, who tells you \n"
				          + "to hang on. If you can survive five hours and \n"
				          + "evade the raptors, a helicopter will find you\n"
				          + "and rescue you\n";
		return escapeText;
	}
	public static String hidingPlaces() {
		String hidingPlaces = "Where will you hide? \n"
							+ "1 - The control room \n"
							+ "2 - The visitor's center \n"
							+ "3 - The hotel \n"
							+ "4 - The docks \n"
							+ "5 - The maintenance shed \n"
							+ "6 - The development lab \n"
							+ "Enter choice: ";
		return hidingPlaces;
	}
	
	public static String gameOver() {
		String gameOver = "You should have accepted the job at Disney World.\n"
				        + "After all, when the Pirates of the Caribbean ride \n"
				        + "breaks down, the pirates don't eat the tourists! \n";
		return gameOver;
	}
	
	public static String raptorFind() {
		String raptorFind = "You see a raptor around the corner. You freeze, hoping\n"
	    	     + "it doesn't know you're there. However, you're so focused\n"
	    	     + "on this raptor you don't notice the other two quietly\n"
	    	     + "sneaking up on you...\n";
		return raptorFind;
	}
	public static String raptorSafe() {
		String raptorSafe = "No raptors here! But they could come any moment.\n"
		         + "You need to keep moving!\n";
		return raptorSafe;
	}
	public static String heliSafe() {
		String heliSafe = "The helecopter arrives to rescue you. As you are\n"
		         + "pulled into safety, you breathe a sigh of relief.\n"
		         + "'That's it', you say to yourself, 'I'm quitting!'\n";
		return heliSafe;
	}

}
