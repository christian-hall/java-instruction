
public class PersonManagerApp {

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Welcome to the Person Manager App \n");
		// get a loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Get input from user
			String personChoice = Console.getStringCE("Create customer or employee? (c/e): ");
			System.out.println();
			
			//if/else statement that registers correct data based on previous choice
			if (personChoice.equals("c")) {
				Customer c = new Customer();
					c.setFirstName(Console.getString("Enter first name: "));
					c.setLastName(Console.getString("Enter last name: "));
					c.setNumber(Console.getString("Enter customer number: "));
					
					System.out.println("\n" + c +"\n");
					
					
			} else if (personChoice.equals("e")) {
				Employee e = new Employee();
					e.setFirstName(Console.getString("Enter first name: "));
					e.setLastName(Console.getString("Enter last name: "));
					e.setSsn(Console.getString("Enter last 4 SSN: "));
					
					System.out.println("\n" + e +"\n");
				
			}
			
 			// display output
			
			
			
			
			// close loop
			choice = Console.getStringYN("\n Continue? (y/n): ");
			System.out.println();

		}

		// goodbye message
		System.out.println("Thank you!");

	}

}
