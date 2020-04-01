
public class Contact {
	//Steps 1, 2, and 3 can apply to every project using classes
	// 1. define instance variables
	//    firstName, lastName, email, phone
	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	// 2. generate constructors with the IDE
	// - always 2 of them (default & fully loaded)
	//this is the default (empty) constructor. You need this for frameworks
	public Contact() {
		super();
	}

	//this is the fully loaded constructor
	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	// 3. generate getters and setters with the IDE
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// displayContact Method (per direction)
	public String displayContact() {
		String contactStr = "--------------------------------------\n" 
				           +"----Current Contact-------------------\n"
				           +"--------------------------------------\n"
				           +"Name:          "+firstName +" " +lastName  +"\n"
				           +"Email Address: "+email +"\n"
				           +"Phone Number:  "+phone +"\n"
				           +"--------------------------------------\n";
		return contactStr;
	}
	
	// 4. [optional] generate toString
}
