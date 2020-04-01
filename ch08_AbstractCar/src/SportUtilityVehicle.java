
public class SportUtilityVehicle extends Car {
	private boolean thirdRow;
	private boolean allWheelDrive;
	
	//empty constructor
	public SportUtilityVehicle() {
		super();
	}

	//fully loaded constructor
	public SportUtilityVehicle(String make, String model, int year, double mpg, boolean thirdRow,
			boolean allWheelDrive) {
		super(make, model, year, mpg);
		this.thirdRow = thirdRow;
		this.allWheelDrive = allWheelDrive;
	}

	public boolean isThirdRow() {
		return thirdRow;
	}

	public void setThirdRow(boolean thirdRow) {
		this.thirdRow = thirdRow;
	}

	public boolean isAllWheelDrive() {
		return allWheelDrive;
	}

	public void setAllWheelDrive(boolean allWheelDrive) {
		this.allWheelDrive = allWheelDrive;
	}

	@Override
	public String toString() {
		return super.toString() +"SportUtilityVehicle [thirdRow=" + thirdRow + ", allWheelDrive=" + allWheelDrive + "]";
	}

	@Override
	public String getDisplayText() {
		return make + " " +model +", " + year;
		//these didn't work because their variables were visible
		//changed from 'private' to 'protected' in car class
	}
	
	

}
