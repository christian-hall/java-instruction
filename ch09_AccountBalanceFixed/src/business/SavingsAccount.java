package business;

public class SavingsAccount extends Account {

	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double balance, double monthlyInterestRate) {
		super(balance);
		this.monthlyInterestRate = monthlyInterestRate;
	}

	//getters and setters
	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	// apply monthlyPayment to the balance
	public void applyPayment() {
		monthlyInterestPayment = balance * monthlyInterestRate;
		balance += monthlyInterestPayment;
	}
	
	
}
