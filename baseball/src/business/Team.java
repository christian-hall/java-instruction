package business;

import utilities.Console2;
import utilities.TextResponse;

public class Team {
	public static String pickTeam() {
		String player = null;
		TextResponse.pickTeam();
		int enterTeam = Console2.getInt("Enter your team: ");
		switch (enterTeam) {
		case 1:
			player = "Cardinals ";
			break;
		case 2:
			player = "Mariners  ";
			break;
		case 3:
			player = "Phillies  ";
			break;
		case 4:
			player = "Rangers   ";
			break;
		case 5:
			player = "Reds      ";
			break;
		case 6:
			player = "Twins     ";
			break;
		default:
			player = "Spiders";
			System.out.println("You didn't pick right. You are now the Cleveland Spiders,");
			System.out.println("the worst team in the history of the MLB");
		}

		return player;
	}
	
	public static String computerPick(String player) {
		int picked = 0;
		if (player.equals("Cardinals ")) {
			picked = 1;
		} else if (player.equals("Mariners  ")) {
			picked = 2;
		} else if (player.equals("Phillies  ")) {
			picked = 3;
		} else if (player.equals("Rangers   ")) {
			picked = 4;
		} else if (player.equals("Reds      ")) {
			picked = 5;
		} else if (player.equals("Twins     ")) {
			picked = 6;
		}
		int picker = picked;
		String computer = "";
		while (picker == picked) {
			picker = (int) ((Math.random()*6)+1);
			if (picker == 1) {
				computer = "Cardinals ";
			} else if (picker == 2) {
				computer = "Mariners  ";
			} else if (picker == 3) {
				computer = "Phillies  ";
			} else if (picker == 4) {
				computer = "Rangers   ";
			} else if (picker == 5) {
				computer = "Reds      ";
			} else if (picker == 6) {
				computer = "Twins     ";
			}
		}
		return computer;
		
	}
}
