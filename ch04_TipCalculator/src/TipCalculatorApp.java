import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Tip Calculator App! \n" + "    ...now with Data Verification! \n"
				+ "----------------------------------");
		System.out.println();

		// insert loop
		String choice = "y";
		String again = "Continue? (y/n): ";
		while (choice.equalsIgnoreCase("y")) {
			// get input from user
			String prompt = "Cost of meal: ";
			Double mealCost = verifyDoubleType(sc, prompt);
			System.out.println();

			// pull up currency format

			// get 15% tip and total
			double tipFifteen = mealCost * 0.15;
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String tipFifteenDollar = currency.format(tipFifteen);
			double fifteenTotal = tipFifteen + mealCost;
			String fifteenTotalDollar = currency.format(fifteenTotal);

			// get 18% tip and total
			double tipTwenty = mealCost * 0.18;
			String tipTwentyDollar = currency.format(tipTwenty);
			double twentyTotal = tipTwenty + mealCost;
			String twentyTotalDollar = currency.format(twentyTotal);

			// get 21% tip and total
			double tipTwentyFive = mealCost * 0.21;
			String tipTwentyFiveDollar = currency.format(tipTwentyFive);
			double twentyFiveTotal = tipTwentyFive + mealCost;
			String twentyFiveTotalDollar = currency.format(twentyFiveTotal);

			// output
			System.out.println("15%");
			System.out.println("Tip amount: " + tipFifteenDollar);
			System.out.println("Total amount: " + fifteenTotalDollar);
			System.out.println();
			System.out.println("18%");
			System.out.println("Tip amount: " + tipTwentyDollar);
			System.out.println("Total amount: " + twentyTotalDollar);
			System.out.println();
			System.out.println("21%");
			System.out.println("Tip amount: " + tipTwentyFiveDollar);
			System.out.println("Total amount: " + twentyFiveTotalDollar);
			System.out.println();

			// loop
			choice = verifyString(sc, again);
			System.out.println();

		}
		sc.close();
		System.out.println("Goodbye");
	}
	
	
	// method that verifies that the entry is a double
	public static double verifyDoubleType(Scanner sc, String prompt) {
		double entry = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				entry = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Invalid entry. Please try again, and enter a whole number.");
				System.out.println();
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return entry;
	}
	//method that verifies the string type
	public static String verifyString(Scanner sc, String again) {
		String choice = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(again);
			sc.hasNext();
			choice = sc.next();
			if (choice.equals("y") || choice.equals("n")) {
				isValid = true;
			} else {
				System.out.println("Please enter 'y' for yes and 'n' for no.");
				System.out.println();
			}
		}
		sc.nextLine(); // discard any other data entered on the line
		return choice;
	}

}
