import java.util.Scanner;

public class ShortCircuitApp {

	public static void main(String[] args) {
		
		System.out.println("Stop Light Approaching!!!");
		Scanner sc = new Scanner(System.in);
		System.out.print("What color is the light (r,y,g)?");
		System.out.print("How far away is the light (feet)? ");
		String light = sc.next();
		int feet = sc.nextInt();
		System.out.print("How fast are you going (mph):?");
		int mph = sc.nextInt();
		
		if (light.equalsIgnoreCase("r")) {
			//light is red - stop
		}
		else if (light.equalsIgnoreCase("y") && feet < 30) {
			// light is yellow and we are super close!
			//how fast are we going?
			if (mph >60) {
				//speed up!
			}
			else {
				//slow to stop
			}
		}
		else if (light.equalsIgnoreCase("g")) {
			//light is green, keep going!
		}
		else {
			//light is yellow and we are far away

		}
	}

}
