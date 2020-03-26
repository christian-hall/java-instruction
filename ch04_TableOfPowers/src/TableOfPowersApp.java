import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Squares and Cubes Table");
		System.out.println();
		
		// create a new scanner
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			//user input requests
			System.out.print("Enter an integer: ");
			int input = sc.nextInt();
			int x = 1;
			// business calculations
			
			String detail = "";
			while (x <= input) {
				int squared = (int) Math.pow(x, 2);
				int cubed = (int) Math.pow(x, 3);
				detail += x + "        " +squared +"        " +cubed+"\n";
				//System.out.println(x + "        " +squared +"        " +cubed);
				x++;
			}
			
			//output
			System.out.println("Number   Squared  Cubed   \n"
			                +  "=======  =======  =======  ");
			System.out.println(detail);
			System.out.println();
			
			//see if user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		
		//goodbye
		System.out.println("Goodbye");
	}

}
