import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodstoMyMaddness {

	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		String name = "Christian";
		printWelcomeMessage();
		printWelcomeMessage(name);
		printWelcomeMessage("Steven");

		// get two integers from one line of input
		// System.out.print("Enter 2 integers (ex. 1 5): ");
		// int a = sc.nextInt();
		// int b = sc.nextInt();

		// get int a
		int a = getValidInt("Enter number 1: ", sc);

		// get int b
		int b = getValidInt("Enter number 2: ", sc);

		System.out.println("Sum is " + sum(a, b));
		System.out.println("Difference is " + diff(a, b));
		System.out.println("Product is " + product(a, b));

		System.out.println("Goodbye");
		sc.close();

	}

//method to handle exceptions
	private static int getValidInt(String prompt, Scanner sc) {
		int i = 0;
		while (true) {
			// print message to the user
			System.out.print(prompt);
			try {
				// get user input
				i = sc.nextInt();
				break;
			}
			catch (InputMismatchException ime) {
				//check if there's an exception
				System.out.println("Error: Entry must be a whole number. Try again. ");
				sc.nextLine(); //discard any input
			}

			// re-prompt if exception

			// return valid input
		}
		return i;

	}

	private static void printWelcomeMessage() {
		System.out.println("Welcome to my madness!"); // useful for referencing a print with no variables
	}

	private static void printWelcomeMessage(String name) { // useful for adding strings with variables in there

		System.out.println("Welcome, " + name + ", to my madness!");
	}

	private static int sum(int n1, int n2) { // useful for running operations and returning a number or string
		return n1 + n2;
	}

	private static int diff(int a, int b) {
		return a - b;
	}

	private static int product(int a, int b) {
		return a * b;
	}

}
