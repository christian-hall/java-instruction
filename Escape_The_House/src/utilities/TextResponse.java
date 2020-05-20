package utilities;

import java.util.ArrayList;
import java.util.List;

import business.Location;

public class TextResponse {
	//introductory texts
	public static void introLogo() {
		System.out.println("                     ___[]____________\n"
				         + "                    / ESCAPE THE HOUSE\n"
				         + "                   / by Christian Hall\n"
			     	     + "                  /___________ver. 1.2\n"
				         + "                   | []  [][]   |X| []\n"
				         + "                   |____________|X|___\n\n");
	}
	
	public static void introText() {
		System.out.println("You suddenly find yourself in a dark, creepy, abandonded house.\n"
				 + "You have no idea how you got here, but you know that you must\n"
				 + "escape. You try to open the front door, but it is locked. Look\n"
				 + "for items in different rooms that might help you get free.\n"
				 + "Good luck...\n");
	}
	//location names and descriptions
	public static void locationName(int locationId) {
		String locationName = "";
		if (locationId == 1) {
			locationName = "FOYER";
		}
		else if (locationId == 2) {
			locationName = "LIVING ROOM";
		}
		else if (locationId == 3) {
			locationName = "DINING ROOM";
		}
		else if (locationId == 4) {
			locationName = "KITCHEN";
		}
		else if (locationId == 5) {
			locationName = "LIBRARY";
		}
		else if (locationId == 6) {
			locationName = "STAIRS";
		}
		else if (locationId == 7) {
			locationName = "HALL";
		}
		else if (locationId == 8) {
			locationName = "BATHROOM";
		}
		else if (locationId == 9) {
			locationName = "GUEST BEDROOM";
		}
		else if (locationId == 10) {
			locationName = "MASTER BEDROOM";
		}
		else if (locationId == 11) {
			locationName = "BALCONY";
		}
		else if (locationId == 12) {
			locationName = "BASEMENT";
		}
		else if (locationId == 13) {
			locationName = "EXIT";
		}
		else {
			locationName = "ERROR";
		}
		System.out.println("location: " + locationName);
	}
	
	public static void locationDescription(int locationId) {
		String locationDescription = "";
		if (locationId == 1) {
			locationDescription = "It seems all the windows in this house are boarded up.";
		}
		else if (locationId == 2) {
			locationDescription = "The furniture is dusty and moldy. No one has sat here in a long time. ";
		}
		else if (locationId == 3) {
			locationDescription = "The chandelier has fallen and crushed the large dining table.";
		}
		else if (locationId == 4) {
			locationDescription = "Any food that was here rotted away long ago.";
		}
		else if (locationId == 5) {
			locationDescription = "There are thousands of books written in obscure languages.";
		}
		else if (locationId == 6) {
			locationDescription = "These stairs creak very loudly.";
		}
		else if (locationId == 7) {
			locationDescription = "Parts of the floor have collapsed. Step carefully.";
		}
		else if (locationId == 8) {
			locationDescription = "The sink doesn't work. There's no running water in here.";
		}
		else if (locationId == 9) {
			locationDescription = "The bed is covered in dust, and there's an erie portrait on the wall.";
		}
		else if (locationId == 10) {
			locationDescription = "There are old clothes strewn about. Someone left here in a hurry.";
		}
		else if (locationId == 11) {
			locationDescription = "Outside! Too bad jumping would be fatal. There's nothing to climb down with either.";
		}
		else if (locationId == 12) {
			locationDescription = "It's dark, damp, and full  of spiderwebs.";
		}
		else if (locationId == 13) {
			locationDescription = "";
		}
		else {
			locationDescription = "ERROR";
		}
		System.out.println(locationDescription + "\n");
	}

	//method that prints out the commandMenu
	//	TODO - add a new method that does this more efficiently using an ArrayList
	public static void commandMenu(int locationId) {
		
		System.out.println("COMMAND MENU:");
		System.out.println("-------------");
		
		if (locationId == 1) {
			System.out.println("go to EXIT");
			System.out.println("go to LIVING ROOM");
			System.out.println();	
		}
		else if (locationId == 2) {
			System.out.println("go to FOYER");
			System.out.println("go to LIBRARY");
			System.out.println("go to DINING ROOM");
			System.out.println("go to STAIRS");
			System.out.println();
			
		}
		else if (locationId == 3) {
			System.out.println("go to LIVING ROOM");
			System.out.println("go to KITCHEN");
			System.out.println();
		}
		else if (locationId == 4) {
			System.out.println("go to DINING ROOM");
			System.out.println();
		}
		else if (locationId == 5) {
			System.out.println("go to LIVING ROOM");
			System.out.println();
		}
		else if (locationId == 6) {
			System.out.println("go to BASEMENT");
			System.out.println("go to LIVING ROOM");
			System.out.println("go to HALL");
			System.out.println();
		}
		else if (locationId == 7) {
			System.out.println("go to STAIRS");
			System.out.println("go to MASTER BEDROOM");
			System.out.println("go to GUEST BEDROOM");
			System.out.println("go to BATHROOM");
			System.out.println();
		}
		else if (locationId == 8) {
			System.out.println("go to HALL");
			System.out.println();
		}
		else if (locationId == 9) {
			System.out.println("go to HALL");
			System.out.println();
		}
		else if (locationId == 10) {
			System.out.println("go to BALCONY");
			System.out.println("go to HALL");
			System.out.println();
		}
		else if (locationId == 11) {
			System.out.println("go to MASTER BEDROOM");
			System.out.println();
		}
		else if (locationId == 12) {
			System.out.println("go to STAIRS");
			System.out.println();
		}
		else if (locationId == 13) {
			System.out.println();
		}
		//need to use location ID to search objects and pull out information
		
	}
}
