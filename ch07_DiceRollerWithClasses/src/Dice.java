
public class Dice {

	private Die die1;
	private Die die2;
	
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}
	
	public int getSum() {
		int sum = die1.getValue() + die2.getValue(); //the random number is stored in getValue
		return sum;
		
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}
	
	public void printRoll() {
		// print the die 1, die 2, total, and special message if necessary
		System.out.println("Die 1: " + die1.getValue());
		System.out.println("Die 2: " + die2.getValue());
		System.out.println("Total: " +getSum());
		if (getSum()==2) {
			System.out.println("Snake Eyes!");
		}
		else if (getSum()==7) {
			System.out.println("Craps!");
			System.out.println();
		}
		else if (getSum()==12) {
			System.out.println("Boxcars!");
			System.out.println();
		}
		else {
			System.out.println();
		}
	}
	
}
