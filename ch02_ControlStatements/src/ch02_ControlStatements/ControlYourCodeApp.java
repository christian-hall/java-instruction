package ch02_ControlStatements;

import java.util.Scanner;

public class ControlYourCodeApp {

	public static void main(String[] args) {
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println( "enter a number"); //this is an infinite loop until told stop
		
			int nbr = sc.nextInt();
			
			if (nbr < 0) {
				System.out.println("error: entry must be <0");
				
			}
			else if (nbr >100) {
				System.out.println("error, must be <101");
			}
			else {
				System.out.println("valid grade entered"+nbr);
			}
			System.out.print("Continue?");
			
			choice = sc.next();
		}
		System.out.println("bye");

	}

}
