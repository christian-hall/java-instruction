
public class Customer extends Person {
	protected String number;

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String number) {
		super(firstName, lastName);
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "You entered a new customer: \n" +super.toString() + "\n"
				+ "Customer Number: " +number;
	}
	
	
	

}
