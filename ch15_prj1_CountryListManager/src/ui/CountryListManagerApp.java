package ui;

import db.CountriesIO;

public class CountryListManagerApp {

	public static void main(String[] args) {
		// welcome + initialization
		System.out.println("Country List Manager\n");
		CountriesIO countriesIO = new CountriesIO(); // initializes the list
		int command = 0;

		while (command != 3) {

			// display menu
			displayMenu();

			// get user input
			command = Console2.getInt("Enter Menu Number: ", 0, 4);
			System.out.println();

			// business logic
			switch(command) {
			case 1: //displays the countries, page 486
				for (String country: countriesIO.getCountries()) {
					System.out.println(country);
				}
				System.out.println();
				break;
			case 2: //add a country
				String country = Console2.getString("Enter country: ", true); //adds a new app
				countriesIO.addCountries(country);//calls up addCountires method in countriesIO
				System.out.println("This country has been saved");
				System.out.println();
			case 3:
				//do nothing, exit app
			default:
				System.out.println("Please enter a number from 1 to 3.\n");
			// display results
			// - end loop
			}
		}
		System.out.println("bye");
		// bye
	

	}
	private static void displayMenu() {
		System.out.println("COMMAND MENU:\n"
				         + "1 - list countries\n"
				         + "2 - add countries\n"
				         + "3 - exit\n");
	}

}
