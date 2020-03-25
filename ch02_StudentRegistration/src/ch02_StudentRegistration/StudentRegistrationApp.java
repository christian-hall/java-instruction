import java.util.Scanner;

public class StudentRegistrationApp {
	public static void main(String[] args) {
		System.out.println("Student Registration Form"); //print intro to application
		System.out.println(); //print a blank line
		
		// create a scanner object "sc"
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter year of birth: ");
		String birthYear = sc.nextLine();
		
		System.out.println();
		System.out.println("Welcome "+ firstName + " " +lastName +"!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is " +firstName +"*" +birthYear );
		
		

	}

}
