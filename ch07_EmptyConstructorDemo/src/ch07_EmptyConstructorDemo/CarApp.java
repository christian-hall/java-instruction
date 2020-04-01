package ch07_EmptyConstructorDemo;

public class CarApp {

	public static void main(String[] args) {
		// create an instance of car
		Car c1 = new Car();
		Car c2 = new Car("Toyota", "RAV4", 2008, 24.5);
		c1.setMake("Ford");
		c1.setModel("Bronco");
		c1.setYear(2021);
		c1.setMpg(19.8);
		//print its contents
		System.out.println(c1);
		System.out.println(c2);
	}

}
