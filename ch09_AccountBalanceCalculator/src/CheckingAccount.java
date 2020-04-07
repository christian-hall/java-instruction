
public class CheckingAccount extends Account {
	//added variable 'fee'
	private double fee;

	//default constructor, empty
	public CheckingAccount() {
		super();
	}

	//fully loaded constructor
	public CheckingAccount(double fee) {
		super();
		this.fee = fee;
	}

	//getters and setters
	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "Checking: " + Console.getCurrency(balance);
	}
	
	

	
	
	

}
