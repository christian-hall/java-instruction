import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		//introduce the program
		System.out.println("Welcome to the Travel Time Calculator!");
		System.out.println(); //print a blank line)
		
		Scanner sc = new Scanner (System.in);
		
		//establish loop for repeated uses
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			// prompt for user input
			System.out.print("Enter miles: ");
			double miles = sc.nextDouble();
			System.out.print("Enter miles per hour: ");
			double speed = sc.nextDouble();
			
			//complete business logic - compute travel times in hours and minutes
			double minutesTraveled = (miles/speed)*60;
			int timeTraveledHour = (int)(minutesTraveled/60);
			int timeTraveledMin = (int)(minutesTraveled%60);
			
			//complete business logic with BigDecimal
			
			
			//display output - display hours and minutes
			System.out.println("Estimated Travel Time");
			System.out.println("---------------------");
			System.out.println("Hours: " +timeTraveledHour);
			System.out.println("Minutes:" +timeTraveledMin);
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}
		
		//say goodbye
		System.out.println("Goodbye");
	}

}
;