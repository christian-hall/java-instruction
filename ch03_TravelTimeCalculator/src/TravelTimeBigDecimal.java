import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TravelTimeBigDecimal {

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
			String milesStr = sc.next();
			BigDecimal milesBD = new BigDecimal(milesStr);
			System.out.print("Enter miles per hour: ");
			String speedStr = sc.next();
			BigDecimal speedBD = new BigDecimal(speedStr);
			
			//complete business logic - compute travel times in hours and minutes
//			double minutesTraveled = (miles/speed)*60;
//			int timeTraveledHour = (int)(minutesTraveled/60);
//			int timeTraveledMin = (int)(minutesTraveled%60);
			
			//complete business logic with BigDecimal
			BigDecimal sixty = new BigDecimal(60);
			BigDecimal minutesTraveled = milesBD.divide(speedBD,2,RoundingMode.HALF_UP).multiply(sixty);
			int timeTraveledHour = (int)minutesTraveled.divide(sixty).doubleValue();
			int timeTraveledMin = (int)minutesTraveled.remainder(sixty).doubleValue();
			
			//display output - display hours and minutes
			System.out.println("Estimated Travel Time");
			System.out.println("---------------------");
			System.out.println("Hours: " +timeTraveledHour);
			System.out.println("Minutes:" +timeTraveledMin);
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		
		//say goodbye
		System.out.println("Goodbye");
	}

}
;