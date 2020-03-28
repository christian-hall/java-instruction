import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorEnhanced {

	public static void main(String[] args) {
		// display welcome message
		System.out.println("Welcome to the Tip Calculator!");
		System.out.println("        ...now with enhancements and Data Verfication!");
		System.out.println("______________________________________________________");
		System.out.println();

		// call Scanner and establish bill variables
		double bill = 0;
		String billPrompt = "What is your total bill? ";
		Scanner sc = new Scanner(System.in);
		String progChoicePrompt = "Would you like to start over? (y/n): ";
		String progChoice = "y";

		// establish program loop
		while (progChoice.equals("y")) {
			bill = verifyDouble(sc, billPrompt);
			System.out.println();

			// prompts and variables for, mealType, serviceQuality, and tip entry
			String mealType = "";
			String mealTypePrompt = "What meal did you have? \n" + "b - breakfast \n" + "l - lunch \n" + "d - dinner \n"
					+ "\n" + "enter choice :";
			mealType = verifyMealType(sc, mealTypePrompt);

			String serviceQualityPrompt = "What was the level of quality of your service? \n"
					+ "0 - the server was rude \n" + "1 - the service was poor \n" + "2 - the service was fair \n"
					+ "3 - the service was good \n" + "4 - the service was great \n"
					+ "5 - the service was the best (or I know the server personally) \n" + "Enter choice: ";
			String serviceQuality = "";
			serviceQuality = verifyServiceQuality(sc, serviceQualityPrompt);

			double tipEntry = 0;
			String tipEntryPrompt = "Please enter desired tip %: ";

			// establishes variables for standard tipRate and the recommendedTip
			double tipRate = 0;
			double recommendedTip = 0;
			tipRate = tipRateFinder(mealType);
			recommendedTip = calculateRecommendedTip(tipRate, serviceQuality);
			tipEntry = verifyTipEntry(sc, tipEntryPrompt);

			// calculates, formats, and prints the meal cost, tip percent, tip amount, and
			// total amount

			Double tipTotal = bill * (tipEntry / 100);
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String tipTotalString = currency.format(tipTotal);

			Double grandTotal = bill + tipTotal;
			NumberFormat currency2 = NumberFormat.getCurrencyInstance();
			String grandTotalString = currency2.format(grandTotal);

			NumberFormat currency3 = NumberFormat.getCurrencyInstance();
			String billString = currency3.format(grandTotal);

			// calculates relation of tipEntry to Recommended Tip
			String textResponse = "";

			if ((tipEntry / 100) < recommendedTip) {

				Double fixedTipTotal = bill * (recommendedTip);
				NumberFormat currency4 = NumberFormat.getCurrencyInstance();
				String fixedTipTotalString = currency4.format(fixedTipTotal);

				Double fixedGrandTotal = bill + fixedTipTotal;
				NumberFormat currency5 = NumberFormat.getCurrencyInstance();
				String fixedGrandTotalString = currency5.format(fixedGrandTotal);
				textResponse = "This tip is low for the meal and service you reported. \n" + "\n"
						+ "You should tip at least:     " + (int) (recommendedTip * 100) + "% \n"
						+ "Your tip would be:           " + fixedTipTotalString + "\n" + "Your total expense would be: "
						+ fixedGrandTotalString;
			}

			else if ((tipEntry / 100) >= recommendedTip) {
				textResponse = "This is a good amount for a tip!";
			}

			System.out.println();
			System.out.println("Your check total is:   " + billString);
			System.out.println("You entered a tip of:  " + tipEntry + "%");
			System.out.println("Your tip amount is:    " + tipTotalString);
			System.out.println("Your total expense is: " + grandTotalString);
			System.out.println();
			System.out.println(textResponse);
			System.out.println();

			// ask if you want to start over
			progChoice = verifyProgChoice(sc, progChoicePrompt);
			System.out.println();

		}

		System.out.println("Thank you! Have a nice day!");
		sc.close();

	}

	// method that establishes the tipRate
	public static double tipRateFinder(String mealType) {
		double tipRate = 0;
		if (mealType.equals("b")) {
			tipRate = 0.18;
		} else {
			tipRate = 0.15;
		}

		return tipRate;
	}

	// method that calculates an appropriate tip rate
	public static double calculateRecommendedTip(double tipRate, String serviceQuality) {
		double recommendedTip = 0;
		if (serviceQuality.equals("0")) {
			recommendedTip = 0;
		} else if (serviceQuality.equals("1")) {
			recommendedTip = tipRate - 0.05;
		} else if (serviceQuality.equals("2")) {
			recommendedTip = tipRate;
		} else if (serviceQuality.equals("3")) {
			recommendedTip = tipRate + 0.03;
		} else if (serviceQuality.equals("4")) {
			recommendedTip = tipRate + 0.06;
		} else if (serviceQuality.equals("5")) {
			recommendedTip = tipRate + 0.1;
		}
		return recommendedTip;
	}

	// method that secures the bill entry
	public static double verifyDouble(Scanner sc, String billPrompt) {
		double bill = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(billPrompt);
			if (sc.hasNextDouble()) {
				bill = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error: please enter total like this example: 19.96");
				System.out.println();
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return bill;
	}

	// method that secures the tip entry
	public static double verifyTipEntry(Scanner sc, String tipEntryPrompt) {
		double tipEntry = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.println();
			System.out.print(tipEntryPrompt);
			if (sc.hasNextDouble()) {
				tipEntry = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error: please enter a whole number.");
				System.out.println();
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return tipEntry;
	}

	// method that secures the program choice while loop
	public static String verifyProgChoice(Scanner sc, String progChoicePrompt) {
		String progChoice = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(progChoicePrompt);
			sc.hasNext();
			progChoice = sc.next();
			if (progChoice.equals("y") || progChoice.equals("n")) {
				isValid = true;
			} else {
				System.out.println("Error: Please enter 'y' for yes and 'n' for no.");
				System.out.println();
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return progChoice;
	}

	// method that secures the meal type entry
	public static String verifyMealType(Scanner sc, String mealTypePrompt) {
		String mealType = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(mealTypePrompt);
			sc.hasNext();
			mealType = sc.next();
			if (mealType.equals("b") || mealType.equals("l") || mealType.equals("d")) {
				isValid = true;
				System.out.println();
			} else {
				System.out.println("Error: Please enter 'b' for breakfast, 'l' for lunch, or 'd' for dinner.");
				System.out.println();
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return mealType;
	}

	// Method that secures the serviceQuality entry
	public static String verifyServiceQuality(Scanner sc, String serviceQualityPrompt) {
		String serviceQuality = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(serviceQualityPrompt);
			sc.hasNext();
			serviceQuality = sc.next();
			if (serviceQuality.equals("0") || serviceQuality.equals("1") || serviceQuality.equals("2")
					|| serviceQuality.equals("3") || serviceQuality.equals("4") || serviceQuality.equals("5")) {
				isValid = true;
			} else {
				System.out.println("Error: Please a number 0 though 5.");
				System.out.println();
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return serviceQuality;
	}

}