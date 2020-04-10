package ui;

import java.util.List;

import business.User;
import db.DAO;
import db.UserDB;
import utility.Console;

public class PRSConsoleApp {

	// create an instance of UserDB, using DAO because UserDB extends DAO. Put it before the
	//main method so that it can be accessed by other methods
	private static DAO<User> userRepo = new UserDB();

	public static void main(String[] args) {
		// welcome message
		System.out.println("PRS Console");

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ", true);
			switch (command) {
			case "list":
				listUsers();
				System.out.println();
				break;
			case "add":
				addUser();
				System.out.println();
				break;
			case "get":
				getUser();
				break;
			case "del":
				deleteUser();
				System.out.println();
				break;
			case "exit":
				System.out.println();
				break;
			default:
				System.out.println("Invalid entry");
				System.out.println();
				break;
			}
		}

		// goodbye message
		System.out.println("Goodbye");

	}

	private static void addUser() {
		//prompt for all user fields
		String username = Console.getString("Username? " ,true);
		String password = Console.getString("Password? ", true);
		String firstName = Console.getString("First Name? ", true);
		String lastName = Console.getString("Last Name? ", true);
		String phoneNumber = Console.getString("Phone Number? ", true);
		String email = Console.getString("Email? ", true);
		//skip boolean fields for now, right now set both to false
		User u = new User(username, password, firstName, lastName, phoneNumber, email, false, false);
		if (userRepo.add(u)) {
		System.out.println("User successfully added");
		}
		else {
			System.out.println("issue adding user.");
		}

	}

	private static void listUsers() {
		List<User> users = userRepo.list(); // this is the list function, it lists from the userRepo created one line
											// above

		System.out.println("List of users...");
		for (User u : users) {
			System.out.println(u);
		}

	}
	private static void getUser() {
		// prompt user for id
		User u = getIdAndReturnUser();
		//display to screen
		System.out.println(u);
	}
	
	private static void deleteUser() {
		// prompt user for id and get the movie
		User u = getIdAndReturnUser();
		if (userRepo.delete(u)) {
			System.out.println("User successfully deleted");
			}
			else {
				System.out.println("issue deleting user.");
			}
		
	}
	private static User getIdAndReturnUser(){
		User u = null;
		while (u == null) {
			int id = Console.getInt("User ID:  ", 0, (int)Double.POSITIVE_INFINITY);
			u = userRepo.get(id);
			System.out.println();
		}
		return u;
	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("-------------");
		System.out.println("list - list all users");
		System.out.println("get - display a specific user");
		System.out.println("add - add a new user");
		System.out.println("del - delete a user");
		System.out.println("exit - exit the application");
		System.out.println();
	}
	


}
