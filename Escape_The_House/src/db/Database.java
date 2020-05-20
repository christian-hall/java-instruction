package db;

import java.util.ArrayList;
import java.util.List;

import business.*;

public class Database {
	
	//locations database - locationId, locked, door1, door2, door3, door4, hasItem
	Location foyer = new Location(1, false, "EXIT", null, "LIVING ROOM", null, false);
	Location livingRoom = new Location(2, false, "FOYER", "LIBRARY", "DINING ROOM", "STAIRS", true);
	Location diningRoom = new Location(3, false, "LIVING ROOM", null, "KITCHEN", null, false);
	Location kitchen = new Location(4, false, "DINING ROOM", null, null, null, true);
	Location library = new Location(5, true, null, null, null, "LIVING ROOM", true);
	Location stairs = new Location(6, false, "BASEMENT", "LIVING ROOM", "HALL", null, false);
	Location hall = new Location(7, false, "STAIRS", "MASTER BEDROOM", "GUEST BEDROOM", "BATHROOM", false);
	Location bathroom = new Location(8, false, null, "HALL", null, null, true);
	Location guestBedroom = new Location(9, false, "HALL", null, null, null, false);
	Location masterBedroom = new Location(10, true, null, null, "BALCONY", "HALL", false);
	Location balcony = new Location(11, true, "MASTER BEDROOM", null, null, null, true);
	Location basement = new Location(12, true, null, null, "STAIRS", null, true);
	Location exit = new Location(13, true, null, null, null, null, false);
	
	//keys database - keyID, keyName, keyLocation
	Key copperKey = new Key(1, "COPPER KEY", 4);
	Key brassKey = new Key(2, "BRASS KEY", 2);
	Key bronzeKey = new Key(3, "BRONZE KEY", 8);
	Key silverKey = new Key(4, "SILVER KEY", 12);
	Key goldKey = new Key(5, "GOLD KEY", 13);
	
	//locks database - lockID, location
	Lock copperLock = new Lock(1, 5);
	Lock brassLock = new Lock(2, 10);
	Lock bronzeLock = new Lock(3, 11);
	Lock silverLock = new Lock(4, 12);
	Lock goldLock = new Lock(5, 13);

}
