/* Notes: Hi, I have added a few small enhancements to this. Let me know if I need
 * to remove them and I will.
 */

//add adopt function
package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pet;
import util.Console;
import util.TextResponse;

public class PetStoreApp {

	public static void main(String[] args) {
		// print welcome, explanation, and the command menu
		System.out.println(TextResponse.appIntro());
		System.out.println(TextResponse.commandMenu());
		String command = "";
		
		//create an ArrayList for an initial pet database, add examples of pets
		ArrayList<Pet> petList = new ArrayList<>();
		Pet p1 = new Pet(1, "Dog", "Black Lab", "Sheba", 2);
		Pet p2 = new Pet(2, "Dog", "Grt Pyrenees", "Solomon", 6);
		Pet p3 = new Pet(3, "Dog", "Gold Retvr", "Beau", 9);
		Pet p4 = new Pet(4, "Cat", "Grey Tabby", "Socks", 4);;
		Pet p5 = new Pet(5, "Cat", "Orange Tabby", "Moose", 8);
		petList.add(p1);
		petList.add(p2);
		petList.add(p3);
		petList.add(p4);
		petList.add(p5);
		
		
		// ---start loop
		while (!command.equals("exit")) {
			command = Console.getString("Command: ", true);
			if (command.equals("list")) {
				listPets(petList);
				System.out.println();
				
			} else if (command.equals("add")) {
				addPet(petList);
				
			} else if (command.equals("adopt")) {
				adoptPet(petList);
				System.out.println();
			} else if (command.equals("menu")) {
				System.out.println(TextResponse.commandMenu());
			} else if (command.equals("exit")) {
				// exit the application
			} else {
				System.out.println("Error: invalid command\n"
						         + TextResponse.commandMenu());
			}

			

			// close loop
		}
		
		System.out.println("\nGoodbye");
	}
	
	public static void listPets(ArrayList<Pet> petList) {
		// display all pets
		System.out.println(TextResponse.petInventoryTitle());
		for (Pet showPetList : petList) {
			System.out.println(showPetList);
		}
	}
	
	public static ArrayList<Pet> addPet(ArrayList<Pet> petList) {
		// prompt the user to add information
		System.out.println(TextResponse.addPetTitle());
		int id = Console.getInt("Enter id?      ", 0, (int)Double.POSITIVE_INFINITY);
		String type = Console.getString("Enter type?    ", true);
		String species = Console.getString("Enter species? ", true);
		String name = Console.getString("Enter name?    ", true);
		int age = Console.getInt("Enter age?     ", 0, (int)Double.POSITIVE_INFINITY);
		System.out.println();
		Pet p = new Pet(id, type, species, name, age);
		petList.add(p);
		return petList;
	}
	//method for identifying info through id
	private static Pet getIdAndReturnPet(ArrayList<Pet> petList){
		Pet p = null;
		while (p == null) {
			int id = Console.getInt("Id of pet to adopt?  ", 0, (int)Double.POSITIVE_INFINITY);
			p = petList.get(id);
		}
		return p;
	}
	//method to adopt a pet
	private static ArrayList<Pet> adoptPet(ArrayList<Pet> petList) {
		TextResponse.addPetTitle();
		Pet p = getIdAndReturnPet(petList);
		petList.remove(p);
		//display confirmation message
		return petList;
		
		
	}
	

}
