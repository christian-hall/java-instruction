
public class ContactListApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Contact List application");
		
		//NOTE we are skipping Continue loop to save time
		//Get user input :firstName, lastName, email, phone, all strings
		String firstName = Console.getString("Enter first name: ");
		String lastName = Console.getString("Enter last name: ");
		String email = Console.getString("Enter email: ");
		String phone = Console.getString("Enter phone: ");
		
		//business logic: //create an instance of contact by capturing i
		//input and storing them inside a construct
		Contact contact = new Contact(firstName, lastName, email, phone);
		
		//display output: Current Contact Display, per specs
		System.out.println(contact.displayContact());
		
		
		
		//bye
		System.out.println("Goodbye!");

	}

}
