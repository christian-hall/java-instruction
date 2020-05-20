package userInterface;

import business.Command;
import utilities.Console2;
import utilities.TextResponse;

public class EscapeTheHouseApp {

	public static void main(String[] args) {
		//print out introduction, get ready to play
		TextResponse.introLogo();
		TextResponse.introText();
		String introChoice = Console2.getString("Press Enter to Play\n");
		
		//set initial variables 
		int locationId = 1;
		
		while (locationId != 13) {
			TextResponse.locationName(locationId);
			TextResponse.locationDescription(locationId);
			
			TextResponse.commandMenu(locationId);
			locationId = Command.moveCommand(locationId);
		}
		System.out.println("You're Free!");
		
		
		
	}

}
