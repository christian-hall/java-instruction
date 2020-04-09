package util;

public class TextResponse {
	
	public static String appIntro() {
		String appIntro = "Welcome to the Pet Store App!\n"
				        + "This application will manage a list of pets.\n"
				        + "You can add pets to the inventory, and remove\n"
				        + "them when they get adopted.";
		return appIntro;
	}
	
	public static String commandMenu() {
		String commandMenu = "\nCommand Menu:\n"
			    	       + "==============\n"
			    	       + "list  - list all pets\n"
			    	       + "add   - add pet to inventory\n"
			    	       + "adopt - remove adopted pet from inventory\n"
			    	       + "menu  - show the command menu\n"
			    	       + "exit  - exit the application\n";
		return commandMenu;
			    	       
	}
	public static String petInventoryTitle() {
		String inventoryTitle = "\nPet Inventory\n"
			              	  + "-------------";
		return inventoryTitle;
	}
	public static String addPetTitle() {
		String addPetTitle = "\nAdd a pet\n"
			              	  + "-------------";
		return addPetTitle;
	}
	
	public static String adoptTitle() {
		String adoptTitle = "\nPet Adoption"
				          + "------------";
		return adoptTitle;
	}
	
}
