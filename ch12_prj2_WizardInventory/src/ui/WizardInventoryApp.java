package ui;

import util.Console2;
import java.util.ArrayList;
import java.util.List;

public class WizardInventoryApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Wizard Inventory Game");
		

		// enter original items in the bag
		List<String> wizardInventory = new ArrayList<>(4);
		wizardInventory.add("wooden staff"); // idx 0
		wizardInventory.add("wizard hat");   // idx 1
		wizardInventory.add("cloth shoes");  // idx 2

		// -- begin loop
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			// print out menu
			System.out.println("\nCOMMAND MENU:\n" + "show - show all items\n" + "grab - grab an item\n"
					+ "edit - edit an item\n" + "drop - drop an item\n" + "exit - exit program\n");
			command = Console2.getString("Enter command: ");

			// choice results
			// show - displays items
			if (command.equalsIgnoreCase("show")) {
				int index = 1;
				for (String showInventory : wizardInventory) {
					System.out.println(index +". - " + showInventory);
					System.out.println(showInventory);
					index = index + 1;
				}
			}
			// grab - adds an item (maximum of four items)
			else if (command.equalsIgnoreCase("grab")) {
				if (wizardInventory.size() > 3) {
					System.out.println("You can't carry more than four items. "
							          +"Drop something first.");
				}
				else if (wizardInventory.size() < 4) {
					String newItem = Console2.getString("Name: ");
					wizardInventory.add(newItem);
					System.out.println(newItem + " was added.");
					
				}
			}
			// edit - edit an item (removeObject)
			else if (command.equalsIgnoreCase("edit")) {
				int indexNo = Console2.getInt("Number: ", 0, 5);
				String changeItem = Console2.getString("Updated name: ");
				wizardInventory.set((indexNo-1), changeItem);
				System.out.println("Item " +indexNo +" was updated.");
			}
			// drop - drop an item (sets the item)
			else if (command.equalsIgnoreCase("drop")) {
				int indexNo = Console2.getInt("Number: ", 0, 5);
				wizardInventory.remove((indexNo-1));
				System.out.println("Item number " +indexNo +" was dropped.");

			} else if (command.equalsIgnoreCase("exit")) {
			} else {
				System.out.println("Command not recognized. Please try again.");
			}
		}
		// exit - exit program

		// get user input
		// business calculations
		// user output
		// goodbye message

	}

}
