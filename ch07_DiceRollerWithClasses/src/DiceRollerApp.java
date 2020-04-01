import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("Welcome to the Dice Roller!");

		// get user input: Roll dice? : 'y' or 'Y' to continue
		String choice = Console.getString("Roll the dice? (y/n): ");

		while (choice.equalsIgnoreCase("y")) {

			// Business logic - sum of the dice
			Dice dice = new Dice();
			dice.roll();

			// Output - display total, roll name
			dice.printRoll();
			System.out.println();

			// loop
			choice = Console.getString("Roll again? (y/n): " );
		}
		// Goodbye
		System.out.println("Goodbye");

	}

}
