package business;

public class NumberGenerator {
	
	//hours passed counter
	public static int hoursPassed(int hoursPassed) {
		hoursPassed++;
		return hoursPassed;
	}
	public static int escapeDie() {
		int roll = (int) ((Math.random()*6 ) + 1);
		return roll;
	}
	public static int locationDie() {
		int roll = (int) ((Math.random()*6 ) + 1);
		return roll;
	}


}
