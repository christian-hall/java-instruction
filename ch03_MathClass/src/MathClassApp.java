
public class MathClassApp {

	public static void main(String[] args) {
		// do some rounding - while # rounding
		long result = Math.round(1.667);
		int result1 = (int)Math.round(1.49);
		
		//reound a double to a specific @ of decimal places
		double x = 10.315;
		//round to 2 decomal placed
		double x1 = (double)Math.round(x*100) / 100;
		System.out.println(x1);
		//round to 1 decimal place
		double x2 = (double)Math.round(x*10) / 10;
		System.out.println(x2);

		
		//generate some random numbers
		double r1 = Math.random() * 100;
		System.out.println(r1);
		//dice roll - random between 1 and 6
		int die1 = (int)(Math.random()*6)+1;
		System.out.println(die1);
		
		//min and max
		System.out.println(Math.max(7,  1));
		System.out.println(Math.min(3678, 3422));
		
	}

}
