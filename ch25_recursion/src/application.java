
public class application {

	public static void main(String[] args) {

		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
			
			int entry = Console2.getInt("Enter a whole number: ");
			String output = null;
			while (entry < 0 || entry > 1) {
				if (entry > 1) {
					entry = entry - 2;
				}
				else if (entry < 0) {
					entry = entry * (-1);
				}
			}
			if (entry == 0) {
				output = "Even!";
			}
			else if (entry == 1) {
				output= "Odd!";
			}
			
			System.out.println(output);
			cont = Console2.getString("Continue? (y/n): ", true);
		}

	}
}
