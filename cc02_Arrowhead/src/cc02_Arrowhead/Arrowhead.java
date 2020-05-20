package cc02_Arrowhead;

public class Arrowhead {

	public static void main(String[] args) {
		int input = Console2.getInt("Enter arrowhead size: ");
		int idx = 1;
		int print = 0;
		while (idx <= input) {
			while (print < idx) {
				System.out.print(">");
				print ++;
			}
			print = 0;
			System.out.print("\n");
			idx ++;
		}
		idx = input - 1;
		while (idx > 0) {
			while (print < idx) {
				System.out.print(">");
				print ++;
			}
			print = 0;
			System.out.print("\n");
			idx --;
		}

	}

}
