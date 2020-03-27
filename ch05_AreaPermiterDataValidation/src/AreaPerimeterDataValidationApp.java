import java.util.Scanner;

public class AreaPerimeterDataValidationApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Area & Perimeter Validation App...");
		System.out.println("                     ...now with Data Validation!");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// user input
			System.out.print("Enter length: ");
			double length = sc.nextDouble();
			System.out.print("Enter width:  ");
			double width = sc.nextDouble();
			System.out.println();

			// perimeter calculations
			
			System.out.println("Permiter = " + calculatePerimeter(length, width));
			System.out.println("Area     = " + calculateArea(length, width));
			
			// user loop question
			System.out.println();
			System.out.print("Enter another measurement? (y/n): ");
			choice = sc.next();
		}
		// goodbye statement
		System.out.println();
		System.out.println("Goodbye!");
		sc.close();

	}
	
	public static double calculatePerimeter(double length, double width) {
		double perimeter = length * 2 + width * 2;
		return perimeter;
	}
	public static double calculateArea(double length, double width) {
		double area = length * width;
		return area;
	}

}
