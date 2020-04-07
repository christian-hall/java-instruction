package userInterface;

import java.text.NumberFormat;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		// 1. enter welcome message
		System.out.println("Welcome to the Batting Average Calculator");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// 2. get user input
			int numberOfRuns = Console.getInt("\nEnter number of times at bat: ", 0, 31);
			System.out.println();
			System.out.println("0 - out \n" + "1 - single \n" + "2 - double \n" + "3 - triple \n" + "4 - home run \n");

			// 3. business calculations
			// have the new input determine the string length
			int[] enterRuns = new int[numberOfRuns];

			// have the user enter the information for each string
			double sum = 0;
			double sumAvg = 0;
			double battAvg = 0;
			for (int i = 0; i < enterRuns.length; i++) {
				int run = Console.getInt("Result for at-bat " + (i + 1) + ": ", -1, 5);
				enterRuns[i] = run;
				sum += enterRuns[i];
				//batting average calculations
				if (run == 0) {
					battAvg = 0;
				}else if (run != 0) {
					battAvg = 1;
				}
				sumAvg += battAvg;
			}
			// 4. display output
			System.out.println("\nBatting average:  " + getStatFormat((sumAvg/numberOfRuns)));
			System.out.println("Slugging percent: " + getStatFormat((sum/numberOfRuns)));

			// end loop
			choice = Console.getString("\nEnter another player? (y/n): ", "y", "n");
		}
		// 5. display goodbye message
		System.out.println("\nThank you!");
	}
	public static String getStatFormat(double unformat) {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(3);
		String formatted = number.format(unformat);
		return formatted;
	}
}
