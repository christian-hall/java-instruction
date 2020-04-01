
public class Person {
	protected String firstName;
	protected String lastName;
	
	//default constructor
	public Person() {
		super();
	}
	//fully loaded constructor
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//getter and setters
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
	@Override
	public String toString() {
		return "Name: " +firstName + " " +lastName;
	}
	
	
	

	
	
}
