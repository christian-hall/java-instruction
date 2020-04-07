
public class Account implements Depositable, Withdrawable, Balanceable {
	
	//added a double 'amount'
	public double balance;
	
	//added blank constructor
	public Account() {
		super();
	}
	
	//added fully loaded constructor
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	

	//auto-generated method stub
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
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
