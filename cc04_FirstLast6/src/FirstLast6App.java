public class FirstLast6App {

	public static void main(String[] args) {
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int length = Console2.getInt("Enter a number above 0: ");
			int[] array = new int[length];
			int idx = 0;
			while (idx < length) {
				int entry = Console2.getInt("Enter number for array: ");
				array[idx] = entry;
				idx++;
			}
			boolean bool = firstLast6(array, length);
			System.out.println(bool);
			choice = Console2.getString("Add another array? (y/n): ", "y", "n");
		}

	}

	private static boolean firstLast6(int[] array, int length) {
		boolean bool = false;
		if (array[0] == 6 || array[(length - 1)] == 6) {
			bool = true;
		}
		return bool;
	}

}
