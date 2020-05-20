package business;

import utilities.Console2;
import utilities.TextResponse;

public class Pitch {
	
	public static void playerPitch() {
		TextResponse.pitchOptions();
		int choose = Console2.getInt("Choose: ", 0, 5);
		switch (choose){
		case 1:
			
		break;
		
		}
		
	}
	
	public static void computerPitch() {
		
	}
}
