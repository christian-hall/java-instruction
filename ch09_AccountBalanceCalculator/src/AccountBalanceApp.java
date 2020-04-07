
public class AccountBalanceApp {

	public static void main(String[] args) {
		// display welcome message
		System.out.println("Welcome to the Account application \n");

		//create a checking and savings account
		CheckingAccount c = new CheckingAccount();
		c.setBalance(1000);
		c.setFee(1); //this is the fee for the checking account
		
		SavingsAccount s = new SavingsAccount();
		s.setBalance(1000);
		s.setInterest(0.012);
		double sInterest = ((s.getInterest() * s.getBalance())); //this is the interest for savings account
		
		
		// display starting balances
		System.out.println("Starting Balances");
		System.out.println(c.toString());
		System.out.println(s.toString());
		System.out.println("\n" + "Enter the transactions for the month:");
		

		// while loop
		String choice = "y";
		double a = 0;
		double changeBalance = 0;
		while (choice.equals("y")) {

			// withdraw or deposit
			String transactionType = "";
			String s1 = "w";
			String s2 = "d";
			transactionType = Console.getString("Withdrawal or Deposit (w/d): ", s1, s2);

			// checking or savings
			String accountType = "";
			s1 = "c";
			s2 = "s";
			accountType = Console.getString("Checking or Savings (c/s): ", s1, s2);

			// amount? --user enters a double
			double changeAmount = Console.getDouble("Amount? ");
			
			
			//business - choice in withdrawal or deposit
			if (transactionType.equals("w")) {
				changeBalance = -1;	
			}
			else if (transactionType.equals("d")) {
				changeBalance = 1;	
			}
			
			// business - choice in account type
			if (accountType.equals("c")) {
				a = c.balance;
				
			}
			else if (accountType.equals("s")) {
				a = s.balance;
			}
			
			//business - calculate change in account balance
			a = a + (changeBalance * changeAmount);
			
			//set the new balance
			if (accountType.equals("c")) {
				c.setBalance(a);
			}
			else if (accountType.equals("s")) {
				s.setBalance(a);
			}

			// continue statement
			s1 = "y";
			s2 = "n";
			choice = Console.getString("\nContinue? (y/n): ", s1, s2);
			System.out.println();

		}
		//take care of fee and interest
		c.setBalance(c.getBalance() - 1);
		s.setBalance(s.getBalance() +sInterest);
		

		// display fees and interest, remaining balance
		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking fee:             " + Console.getCurrency(c.getFee()));
		System.out.println("Savings interest payment: " + Console.getCurrency(sInterest));
		
		System.out.println("Final Balances");
		System.out.println(c.toString());
		System.out.println(s.toString());
		System.out.println();
		// savings -

		// display goodbye message
		System.out.println("Thank you!");

	}

}

// potential enhancements:
// prevent customer from overdrawing
// require customer to enter PIN (normally this would require many more
// interfaces
// and classes, this will be a simple number verification for '1234').