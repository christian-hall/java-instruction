package business;
// variables 
public class Location {
	int locationId;
	boolean locked;
	String doorId1;
	String doorId2;
	String doorId3;
	String doorId4;
	boolean item;
	
	
	//fully loaded constructor
	public Location(int locationId, boolean locked, String doorId1, String doorId2, String doorId3,
			String doorId4, boolean item) {
		super();
		this.locationId = locationId;
		this.locked = locked;
		this.doorId1 = doorId1;
		this.doorId2 = doorId2;
		this.doorId3 = doorId3;
		this.doorId4 = doorId4;
		this.item = item;
	}
	//empty constructor
	public Location() {
		super();
	}
	//getters and setters
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public String getDoorId1() {
		return doorId1;
	}
	public void setDoorId1(String doorId1) {
		this.doorId1 = doorId1;
	}
	public String getDoorId2() {
		return doorId2;
	}
	public void setDoorId2(String doorId2) {
		this.doorId2 = doorId2;
	}
	public String getDoorId3() {
		return doorId3;
	}
	public void setDoorId3(String doorId3) {
		this.doorId3 = doorId3;
	}
	public String getDoorId4() {
		return doorId4;
	}
	public void setDoorId4(String doorId4) {
		this.doorId4 = doorId4;
	}
	public boolean isItem() {
		return item;
	}
	public void setItem(boolean item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locked=" + locked
				+ ", doorId1=" + doorId1 + ", doorId2=" + doorId2 + ", doorId3=" + doorId3 + ", doorId4=" + doorId4
				+ ", item=" + item + "]";
	}
	
	
	
	
	

}
