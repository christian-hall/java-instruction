import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		//Welcome user to the program
		System.out.println("Welcome to the Temperature Converter App!");
		System.out.println();
		
		//create scanner object names sc
		Scanner sc = new Scanner (System.in);
		
		//perform temperature conversions until choice isn't equal to "y" or "Y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			//get temperature from user
			System.out.print("Enter degrees in fahrenheit: ");
			double degF = sc.nextDouble();
			String degreeF = "";
			
			//business conversions
			double conv = (5/9);
			double degC = degF * conv;
			
			//display results
			System.out.println("Degrees in Celcius: " +degC);
			
			//see if user wants to continue
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
			
			
		}
		sc.close();
		System.out.println("Goodbye!");

	}

}
