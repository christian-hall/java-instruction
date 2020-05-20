package business;
//this one calculates the points and returns them
public class Turn {
	public static void playerPitch() {
		Pitch.playerPitch();
		Bat.computerBat();
	}
	
	public static void playerBat() {
		Bat.playerBat();
		Pitch.computerPitch();
	}

}
