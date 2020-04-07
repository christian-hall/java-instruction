package ui;
import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import utilities.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		// welcome message + initialization
		System.out.println("Welcome to the Account Balance Calculator! \n");

		// create checking & savings accounts with 1000 balances each
		CheckingAccount ca = new CheckingAccount(1000, 1);
		SavingsAccount sa = new SavingsAccount(1000, .01);

		// display inital balances
		System.out.println("Starting Balances");
		summarizeAccountBalances(ca, sa);
		System.out.println();
		System.out.println("Enter transactions for the month:");
		System.out.println();

		// start loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// get user input - monthly loop through monthly transactions
			// transaction = w/d, c/s
			// transType: String
			// acctType: String
			// amount: double
			String transType = Console.getString("Withdraw or Deposit? (w/d): ", "w", "d");
			String acctType = Console.getString("Checking or Savings: ", "c", "s");

			System.out.println();

			Account a;
			// business logic and calculations
			// apply transaction to appropriate account
			
			if (acctType.equals("c")) {
				a = ca;
			} else {
				a = sa;
			}

			if (transType.equals("w")) {
				double amount = Console.getDouble("Ammount? ", 0, a.getBalance());
				a.withdraw(amount);
			} else {
				double amount = Console.getDouble("Ammount? ", 0, Double.POSITIVE_INFINITY);
				a.deposit(amount);
			}

			// loop ends (user enter "n" to continue)
			choice = Console.getString("Continue? (y/n): ", true);
		}

		// calculate monthly payments and fees
		sa.applyPayment();
		ca.subtractMonthlyFee();
		// apply them to the balances
		// display payments and fees
		System.out.println("Monthly payments and Fees:");
		System.out.println();
		System.out.println("Checking Fee: " +currency.format(ca.getMonthlyFee()));
		System.out.println("Savings Interest Payment: " +currency.format(sa.getMonthlyInterestPayment()));
		// display final balances
		System.out.println("Final Balances:");
		summarizeAccountBalances(ca,sa);

		// goodbye

	}

	public static void summarizeAccountBalances(CheckingAccount ca, SavingsAccount sa) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println(
				"Checking: " + currency.format(ca.getBalance()) + "\nSavings:  " + currency.format(sa.getBalance()));

	}

}
