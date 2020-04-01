
public class Employee extends Person {
	//added variables
	protected String ssn;

	//generated default string
	public Employee() {
		super();
	}
	//generated fully loaded string
	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}
	//generated getters and setters
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "You entered a new employee: \n" +super.toString() + "\n"
				+ "SSN: " + "xxx-xx-" + ssn;
	}
}
