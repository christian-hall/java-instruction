package ui;

import utilities.Console2;
import business.NumberGenerator;
import business.TextResponse;

public class JurassicEscapeApp {

	public static void main(String[] args) {
		// display welcome message and blurb about game
		System.out.println(TextResponse.intro());

		// variables
		int hoursPassed = 0;
		int raptorEscapeChance = 0;
		String checkChoice = "";
		// first step: checking on the raptor pen

		while (raptorEscapeChance < 6) {
			// hours passed string prompt
			checkChoice = Console2.getString(hoursPassed + " hours have passed. " + "Check the raptor pen? (y/n): ",
					"y", "n");
			hoursPassed = NumberGenerator.hoursPassed(hoursPassed);
			// computer will roll dice to determine if a raptor has escaped
			raptorEscapeChance = NumberGenerator.escapeDie();
			// responses to checkChoice and escapeDie
			if (checkChoice.equalsIgnoreCase("y")) {
				String checkResponse = TextResponse.yesCheck(raptorEscapeChance);
				System.out.println(checkResponse);
			} else if (checkChoice.equalsIgnoreCase("n")) {
				String checkResponse = TextResponse.noCheck(raptorEscapeChance);
				System.out.println(checkResponse);
			}

		}
		if (checkChoice.equalsIgnoreCase("y")) {
			System.out.println(TextResponse.escapeText());
			int hideChoice = 7;
			int raptor1 = 0;
			int raptor2 = 0;
			int raptor3 = 0;
			int hideHour = 0;
			while (hideChoice != raptor1 && hideChoice != raptor2 && hideChoice != raptor3 && hideHour < 6) {
				// computer rolls 3 dies to determine the locations of the raptors
				raptor1 = NumberGenerator.locationDie();
				raptor2 = NumberGenerator.locationDie();
				raptor3 = NumberGenerator.locationDie();
				
				//prompt the user for their choice
				hideChoice = Console2.getInt(TextResponse.hidingPlaces(), 0, 7);
				if (hideChoice == raptor1 || hideChoice == raptor2 || hideChoice == raptor3) {
					System.out.println(TextResponse.raptorFind());
				}
				else if (hideChoice != raptor1 && hideChoice != raptor2 && hideChoice != raptor3){
					hideHour++;
					System.out.println(TextResponse.raptorSafe());
				}
				
			}
			if (hideHour > 4) {
				System.out.println(TextResponse.heliSafe());
			}
			else if (hideHour < 6) {
				System.out.println(TextResponse.gameOver());
			}
		}

		else if (checkChoice.equalsIgnoreCase("n")) {
			System.out.println(TextResponse.gameOver());
		}

	}
	//v. 1.0
	//v. 1.1 added the option to not check with variable responses
	//v. 1.2 added two more raptors
	//Future: will fix problem of random number generator resulting in a "0", more 
	//        responses, will have variable number of raptors that escape
	

}
