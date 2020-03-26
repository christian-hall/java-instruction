import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Greatest Common Divisor App; \n"
				         + "===========================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		//- while loop begins here
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter first number: "); //x
			int x = sc.nextInt();
			System.out.print("Enter second number: "); //y
			int y = sc.nextInt();
			
			// logic - euclidean algorithmn
			while (x > 0) {
				while (x <= y) {
					//subtract x from y
					y = y - x;
					// y -= x;
				}
				//swap the values of x and y
				int oldY = y;
				y = x;
				x = oldY; //now x and y are swapped
				
			}
			// y should be the greatest common divisor
			
			//display output - gcd
			System.out.println("Greatest common divisor: " +y);
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
			
		}
		
		
		//bye
		System.out.println("Goodbye");
		sc.close();

	}

}
