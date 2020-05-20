package utilities;

public class TextResponse {

	public static void intro() {
		System.out.println("        _--_     dMb");
		System.out.println("     __(._  )   d0P");
		System.out.println("       <  (D)  .MP                              ___");
		System.out.println("     .~ ~ /~```M-. ||\\\\        //||  ||        | __ \\");
		System.out.println("   .~    V    Mo_  || \\\\      // ||  ||        ||  \\ \\");
		System.out.println("  (   (___. {:)-./ ||  \\\\    //  ||  ||        ||--/ /");
		System.out.println("   ~._____.(:}     ||   \\\\  //   ||  ||        ||--\\ \\");
		System.out.println("     /     .M\\     ||    \\\\//    ||  ||_____   ||__/ /");
		System.out.println("    /      '' \\    ||     \\/     ||  ||_____|  | ___/");
		System.out.println("    |    /\\    \\  ");
		System.out.println("    /   /  \\    \\");
		System.out.println("   /   /    \\    \\");
		System.out.println("   \\__/      \\ __/");
		System.out.println("   / /        | |");
		System.out.println("  .^V^.      .^V^.");
		System.out.println("   +-+        +-+");
		System.out.println();

	}

	public static void pickTeam() {
		System.out.println("Pick a team:");
		System.out.println("------------");
		System.out.println("1. St. Louis Cardinals");
		System.out.println("2. Seattle Mariners");
		System.out.println("3. Philadelphia Phillies");
		System.out.println("4. Texas Rangers");
		System.out.println("5. Cincinnati Reds");
		System.out.println("6. Minnesota Twins");
		System.out.println();
		
	}
	
	public static void beginGame(String player, String computer) {
		System.out.println("Pitching: " + player);
	}
	
	public static void inningTopOne(String player, String comput, String i) {
		System.out.println("|----------------------|");	
		System.out.println("|           1 2 3  R   |");
		System.out.println("|"+comput+" [][][] []  |");
		System.out.println("|"+player+" [][][] []  |");
		System.out.println("|           in:"+i+"   |");
		System.out.println("|----------------------|");
		System.out.println("||                    ||");
		System.out.println();
		}
	
	public static void pitchOptions() {
		System.out.println("Select a pitch: ");
		System.out.println("------------------------");
		System.out.println("1. Fastball");
		System.out.println("2. Curveball");
		System.out.println("3. Screwball");
		System.out.println("4. Splitter");
		System.out.println();
	}

	public static void batOptions() {
		System.out.println("Select bat:");
		System.out.println("------------------------");
		System.out.println("1. Bat");
		System.out.println("2. Bunt");
		System.out.println("3. Hold");
		System.out.println();
	}
}
