import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TempConvertApp {

	public static void main(String[] args) {
		// print welcome message
		//uses BigDecimal
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
			//get user input
			System.out.print("Enter degrees in Fehrenheit: ");
			BigDecimal fahrenheitInput = sc.nextBigDecimal();
			System.out.println();
			
			//convert using BigDecimal
			BigDecimal thirtyTwo = new BigDecimal("32");
			BigDecimal five = new BigDecimal ("5");
			BigDecimal nine = new BigDecimal ("9");
			
			BigDecimal subtractThirtyTwo = fahrenheitInput.subtract(thirtyTwo);
			BigDecimal multiplyFive = subtractThirtyTwo.multiply(five);
			BigDecimal celsiusOutput = multiplyFive.divide(nine, 2, RoundingMode.HALF_UP);
			System.out.println("Degrees in Celsius: " +celsiusOutput);
			System.out.println();
			
			//Display output
			
			//Ask if continue
			System.out.print("Continue (y/n): ");
			choice = sc.next();
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Goodbye.");
		sc.close();
		
		
		//Display end message
	
	}

}
