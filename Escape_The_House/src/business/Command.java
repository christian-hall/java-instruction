package business;

import utilities.Console2;

//the command class is used to move the character. Doesn't work right now
public class Command {

	public static int moveCommand(int locationId) {
		int newLocationId = 0;
		if (locationId == 1) {
			newLocationId = location1(locationId);

		} else if (locationId == 2) {
			newLocationId = location2(locationId);

		} else if (locationId == 3) {
			newLocationId = location3(locationId);

		} else if (locationId == 4) {
			newLocationId = location4(locationId);

		} else if (locationId == 5) {
			newLocationId = location5(locationId);

		} else if (locationId == 6) {
			newLocationId = location6(locationId);

		} else if (locationId == 7) {
			newLocationId = location7(locationId);

		} else if (locationId == 8) {
			newLocationId = location8(locationId);

		} else if (locationId == 9) {
			newLocationId = location9(locationId); 

		} else if (locationId == 10) {
			newLocationId = location10(locationId);

		} else if (locationId == 11) {
			newLocationId = location11(locationId);

		} else if (locationId == 12) {
			newLocationId = location12(locationId);

		} else if (locationId == 13) {
		} else {
			System.out.println("ERROR IN moveCommand IF-ELSE STATEMENT");
		}

		return newLocationId;
	}

	private static int location1(int locationId) {
		while (locationId == 1) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			switch (moveCommand) {
			case "EXIT":
				locationId = 13;
				break;
			case "LIVING ROOM":
				locationId = 2;
				break;
			default:
				System.out.println("ERROR: INVALID COMMAND\n");
				break;
			}
		}
		return locationId;
	}

	private static int location2(int locationId) {
		while (locationId == 2) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			switch (moveCommand) {
			case "FOYER":
				locationId = 1;
				break;
			case "LIBRARY":
				locationId = 5;
				break;
			case "DINING ROOM":
				locationId = 3;
				break;
			case "STAIRS":
				locationId = 6;
				break;
			default:
				System.out.println("ERROR: INVALID ENTRY\n");
				break;
			}
		}
		return locationId;
	}

	private static int location3(int locationId) {
		while (locationId == 3) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			if (moveCommand.equalsIgnoreCase("LIVING ROOM")) {
				locationId = 2;
			} else if (moveCommand.equalsIgnoreCase("KITCHEN")) {
				locationId = 4;
			} else {
				System.out.println("ERROR: INVALID ENTRY\n");
			}
		}
		return locationId;
	}

	private static int location4(int locationId) {
		while (locationId == 4) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			if (moveCommand.equalsIgnoreCase("DINING ROOM")) {
				locationId = 3;
			} else {
				System.out.println("ERROR: INVALID ENTRY\n");
			}
		}
		return locationId;
	}

	private static int location5(int locationId) {
		while (locationId == 5) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			if (moveCommand.equalsIgnoreCase("LIVING ROOM")) {
				locationId = 2;
			} else {
				System.out.println("ERROR: INVALID ENTRY\n");
			}
		}
		return locationId;
	}

	private static int location6(int locationId) {
		while (locationId == 6) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			if (moveCommand.equalsIgnoreCase("BASEMENT")) {
				locationId = 12;
			} else if (moveCommand.equalsIgnoreCase("LIVING ROOM")) {
				locationId = 2;
			} else if (moveCommand.equalsIgnoreCase("HALL")) {
				locationId = 7;
			} else {
				System.out.println("ERROR: INVALID ENTRY\n");
			}
		}
		return locationId;
	}

	private static int location7(int locationId) {
		while (locationId == 7) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			if (moveCommand.equalsIgnoreCase("STAIRS")) {
				locationId = 6;
			} else if (moveCommand.equalsIgnoreCase("MASTER BEDROOM")) {
				locationId = 10;
			} else if (moveCommand.equalsIgnoreCase("GUEST BEDROOM")) {
				locationId = 9;
			} else if (moveCommand.equalsIgnoreCase("BATHROOM")) {
				locationId = 8;
			} else {
				System.out.println("ERROR: INVALID ENTRY\n");
			}
		}
		return locationId;
	}

	private static int location8(int locationId) {
		while (locationId == 8) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			if (moveCommand.equalsIgnoreCase("HALL")) {
				locationId = 7;
			} else {
				System.out.println("ERROR: INVALID ENTRY\n");
			}
		}
		return locationId;
	}

	private static int location9(int locationId) {
		while (locationId == 9) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			if (moveCommand.equalsIgnoreCase("HALL")) {
				locationId = 7;
			} else {
				System.out.println("ERROR: INVALID ENTRY\n");
			}
		}
		return locationId;
	}

	private static int location10(int locationId) {
		while (locationId == 10) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			if (moveCommand.equalsIgnoreCase("BALCONY")) {
				locationId = 11;
			} else if (moveCommand.equalsIgnoreCase("HALL")) {
				locationId = 7;
			} else {
				System.out.println("ERROR: INVALID ENTRY\n");
			}
		}
		return locationId;
	}

	private static int location11(int locationId) {
		while (locationId == 11) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			if (moveCommand.equalsIgnoreCase("MASTER BEDROOM")) {
				locationId = 10;
			} else {
				System.out.println("ERROR: INVALID ENTRY\n");
			}
		}
		return locationId;
	}

	private static int location12(int locationId) {
		while (locationId == 12) {
			String moveCommand = Console2.getString("enter command: ", true);
			System.out.println();
			if (moveCommand.equalsIgnoreCase("STAIRS")) {
				locationId = 6;
			} else {
				System.out.println("ERROR: INVALID ENTRY\n");
			}
		}
		return locationId;
	}
}
