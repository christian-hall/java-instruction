import java.util.ArrayList;
import java.util.List;

public class fizzbuzzapp {

	public static void main(String[] args) {
		System.out.println("FizzBuzz");
			
		ArrayList<Integer> fizzbuzz = new ArrayList<Integer>();
		int entry = 1;
		
		while (entry <= 50) {
			fizzbuzz.add(entry);
			entry++;
		}

		for (int fb : fizzbuzz) {
			if ((fb % 3 == 0) && (fb % 5 == 0)) {
				System.out.print("fizzbuzz, ");
			} else if (fb % 3 == 0) {
				System.out.print("fizz, ");
			} else if (fb % 5 == 0) {
				System.out.print("buzz, ");
			} else {
				System.out.print(fb +", ");
			}
		}

	}

}
