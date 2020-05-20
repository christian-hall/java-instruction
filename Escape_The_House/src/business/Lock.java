package business;

//elements
public class Lock {
	int lockId;
	int locationId;
	
	//fully loaded constructor
	public Lock(int lockId, int locationId) {
		super();
		this.lockId = lockId;
		this.locationId = locationId;
	}
	//empty constructor
	public Lock() {
		super();
	}
	
	//getters and setters
	public int getLockId() {
		return lockId;
	}
	public void setLockId(int lockId) {
		this.lockId = lockId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	//toString
	@Override
	public String toString() {
		return "Lock [lockId=" + lockId + ", locationId=" + locationId + "]";
	}
}
