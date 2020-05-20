package ui;

public class TernaryOperatorApp {

	public static void main(String[] args) {
		System.out.println("red light green light game");
		// red, green traffic light. What to do?
		String lightColor = "green";
		System.out.println("Light color is " +lightColor);
		String action = "";
		
		// set the action based on the light color
		// if-else example
		//if (lightColor.equalsIgnoreCase("red")) {
		//	action = "stop";
		//}
		//else {
		//	action = "go";
		//}
		
		// ternary operator example/ needs to come from a boolean
		action = lightColor.equalsIgnoreCase("red") ? "STOP" : "GO";
		
				
		
		System.out.println("Action is " +action);
		
		System.out.println("Goodbye");

	}

}
