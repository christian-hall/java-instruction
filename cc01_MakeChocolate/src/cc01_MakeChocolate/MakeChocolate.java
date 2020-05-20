package cc01_MakeChocolate;

public class MakeChocolate {

	public static void main(String[] args) {
		int small = Console2.getInt("Enter ammount of small bars you have: ");
		int large = Console2.getInt("Enter ammount of large bars you have: ");
		int goal = Console2.getInt("Enter the goal ammount of chocolate: ");
		int result = makeChocolate(small, large, goal);
		System.out.println(result);

	}

	private static int makeChocolate(int small, int large, int goal) {
		int result = 0;
		while (large > 0) {
			if (goal > large || goal > 4) {
				goal = goal - 5;
			}
			large--;
		}
		if (small >= goal) {
			while (small > 0) {
				if (goal > 0 ) {
					goal--;
					result++;
				}
				small--;
			}
		} else if (small < goal) {
			result = -1;
		}
		return result;
	}
}
