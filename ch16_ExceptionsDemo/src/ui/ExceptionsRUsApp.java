package ui;

import java.util.InputMismatchException;

import util.ConsoleUtil;

public class ExceptionsRUsApp {

	public static void main(String[] args) {
		System.out.println("hi");
		
		try {
			double d = ConsoleUtil.getDouble("Enter a yearly interest rate: ");
		} catch (InputMismatchException ime) {
			System.out.println("Error getting yearly interest rate");
		}
		
		
		
		System.out.println("bye");

	}

}
