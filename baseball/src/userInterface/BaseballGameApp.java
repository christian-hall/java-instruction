package userInterface;

import business.Team;
import business.Turn;
import utilities.TextResponse;

public class BaseballGameApp {

	public static void main(String[] args) {
		TextResponse.intro();
		String player = Team.pickTeam();
		String computer = Team.computerPick(player);
		int top1 = 0;
		int bot1 = 0;
		int top2 = 0;
		int bot2 = 0;
		int top3 = 0;
		int bot3 = 0;
		int inning = 1;
		while (inning <= 3) {
			//pitching methods and point system
			//	send to as many different classes as I can
			String turn = " ^" + inning +"  ";
			TextResponse.inningTopOne(player, computer, turn);
			Turn.playerPitch();
			
			System.out.println();
			// batting methods and points system
			//	send to as many different classes as I can
			turn = " v" + inning + "  ";
			TextResponse.inningTopOne(player, computer, turn);
			Turn.playerBat();
			inning ++;
			System.out.println();
		}
		
		//formal declaration of the winner and the conclusion of the game
	}

}
