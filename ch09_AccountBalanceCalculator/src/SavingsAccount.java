
public class SavingsAccount extends Account {

	//added variable interest
	protected double interest;

	//added default blank constructor
	public SavingsAccount() {
		super();
	}

	//added fully loaded constructor
	public SavingsAccount(double interest) {
		super();
		this.interest = interest;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	//to string
	@Override
	public String toString() {
		return "Savings:  " + Console.getCurrency(balance);
	}
	

	
}
