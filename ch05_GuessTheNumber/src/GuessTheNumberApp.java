import java.util.Scanner;

public class GuessTheNumberApp {

	public static void main(String[] args) {
		// greeting
		System.out.println("Welcome to the Guess the Number Game! \n" + "       ...now with Data Verification! \n"
				+ "+++++++++++++++++++++++++++++++++++++ \n");
		// call up scanner
		Scanner sc = new Scanner(System.in);
		// full game loop
		String again = "Would you like to play again (y/n): ";
		String choice = "y";
		while (choice.equals("y")) {
			System.out.println("I'm thinking of a number 1 - 100.");
			System.out.println();
			int answer = randomNumber();
			int max = 101;
			int min = 0;
			int guess = 0;
			int count = 0;
			String prompt = "Enter guess: ";
			// loop for guesses
			while (answer != guess) {
				guess = verifyInt(sc, prompt, min, max);
				count = count + 1;
				System.out.println();
				// this if else statement is to determine responses based on user entries
				if (guess > (answer + 10)) {
					System.out.println("Way too high! Guess again!");
					System.out.println();
				} else if (guess > answer) {
					System.out.println("Too high! Guess again!");
					System.out.println();
				} else if (guess < answer - 10) {
					System.out.println("Way too low! Guess again!");
					System.out.println();
				} else if (guess < (answer)) {
					System.out.println("Too low! Try again!");
					System.out.println();
				} else if (guess == answer) {
					System.out.println("You guessed it in " +count +" tries!");
					if (count <= 5) {
						System.out.println("You are amazing!");
					} else if (count > 5 && count <= 10) {
						System.out.println("Not bad!");
					} else if (count > 10 && count < 99) {
						System.out.println("Could be better - try again!");
					} else
						System.out.println("You stink at this.");
				}
			}

			// loop ending. The application should only accept "y" or "n"
			System.out.println();
			choice = verifyString(sc, again);
			System.out.println();
		}
		// goodbye statement and closing statements
		System.out.println("\n" + "Bye - come back soon!");
		sc.close();

	}

	// method that generates random number between 1 and 100
	public static int randomNumber() {
		double doubleAnswer = Math.random() * 100;
		int intAnswer = (int) doubleAnswer;
		return intAnswer;
	}

	// method that verifies that the guess is an integer
	public static int verifyIntType(Scanner sc, String prompt) {
		int guess = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				guess = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Invalid entry. Please try again, and enter a whole number.");
				System.out.println();
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return guess;
	}

	// method that verifies that the integer is between 0 and 101
	public static int verifyInt(Scanner sc, String prompt, int min, int max) {
		int guess = 0;
		boolean isValid = false;
		while (!isValid) {
			guess = verifyIntType(sc, prompt);
			if (guess < min) {
				System.out.println("Invalid entry. Please enter a response greater than or equal to 1.");
				System.out.println();
			} else if (guess > max) {
				System.out.println("Invalid entry. Please enter a response less than or equal to 100.");
				System.out.println();
			} else {
				isValid = true;
			}
		}
		return guess;
	}

	public static String verifyString(Scanner sc, String again) {
		String choice = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(again);
			sc.hasNext();
			choice = sc.next();
			if (choice.equals("y") || choice.equals("n")) {
					isValid = true; }
			else {
				System.out.println("Please enter 'y' for yes and 'n' for no.");
				System.out.println();
			}
		}
		sc.nextLine(); // discard any other data entered on the line
		return choice;
	}

}
