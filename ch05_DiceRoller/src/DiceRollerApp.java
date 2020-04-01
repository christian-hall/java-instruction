import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller! \n"
	                     + "============================");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.print("Roll the die? (y/n): ");
		choice = sc.nextLine();

		// first choice of whether or not to roll the die
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();

			// get dice
			int die1 = rollTheDie("y");
			int die2 = rollTheDie("y");
			int total = totalRoll(die1, die2);
			
			//print results for numbers
			System.out.println("Die 1: " +die1);
			System.out.println("Die 2: " +die2);
			System.out.println("Total: " +total);
			
			//add expressions
			if (die1 == 1 && die2 == 1) {
				System.out.println("Snake eyes!");
				System.out.println();
			}
			else if (die1 ==6 && die2 ==6) {
				System.out.println("Boxcars!");
				System.out.println();
			}
			else if (die1 == die2) {
				System.out.println("Doubles!");
				System.out.println();
			}
			else {
				System.out.println();
			}
			
			

			// asks if the user would like to roll again
			System.out.print("Roll again? (y/n): ");
			choice = sc.nextLine();

		}
		System.out.println();
		System.out.println("Thanks for playing!");
		sc.close();
	}

	public static int rollTheDie(String choice) {
		// program to randomly roll a dice and display it
		double randomNumber = Math.random(); // generates a random number
		double randomNumber6 = randomNumber * 5 + 1; // multiplies number by 6 adds 1
		double roundedNumber6 = Math.round(randomNumber6);
		int result = (int) roundedNumber6;
		return result;
	}
	public static int totalRoll(int die1, int die2) {
		int totalDie = die1 +die2;
		return totalDie;
		
	}
	
}