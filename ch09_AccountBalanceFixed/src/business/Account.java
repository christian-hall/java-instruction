package business;
public class Account implements Depositable, Withdrawable, Balanceable {
	
	protected double balance;

	public Account() {
		super();
	}
	
	

	public Account(double balance) {
		super();
		this.balance = balance;
	}



	@Override
	public double getBalance() {

		return balance;
	}

	@Override
	public void setBalance(double balance) {
		this.balance = balance;
		
	}

	@Override
	public void withdraw(double amount) {
		balance = balance - amount;
		
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		
	}

}
