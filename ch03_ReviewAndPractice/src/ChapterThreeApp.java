import java.text.NumberFormat;

//This app is only to go through the concepts of Chapter 3 and make sense of them.
public class ChapterThreeApp {

	public static void main(String[] args) {
		// How to declare and initalize variables
/*		int answer = 42;
		System.out.println("The variable is: " +answer);
		double pi = 3.14;
		System.out.println("The decimal is: " +pi);
		float locustPopulation = 4508965F;
		System.out.println("The float is: " +locustPopulation);
		//strings cannot be assigned as a variable!
		
		// How to declare a constant
		final int interestRate = 3;
		System.out.println("The constant is: " +interestRate);
		
		//Using Arithmetic Expressions for multiple variables
		int x = 10;
		int y = 5;
								System.out.println("x = 10 \ny = 5");
		int result1 = x + y;	System.out.println("x + y = " +result1);
		int result2 = x - y;	System.out.println("x - y = " +result2);
		int result3 = x * y;	System.out.println("x * y = " +result3);
		int result4 = x / y;	
		int result5 = x % y;	System.out.println("x / y = " +result2
								+" remainder " +result5);
		
		//Using unary operators
		int z = 5;	System.out.println("z = 5");
		z++;	System.out.println("z++ should be 6, = " +z);
		
		int a = 5;
		a--;	System.out.println("z-- should be 4, = " +a);
		
		//Compound assignment operators
		int b = 15;		System.out.println("b = 15");
		b += 1;			System.out.println("b += 1 is 16: " +b);
		b -= 1;			System.out.println("b -= 1 is 15: " +b);
		b *= 2;			System.out.println("b *= 2 is 30: " +b);
		b /= 5;			System.out.println("b /= 1 is 6: " +b);
		b %= 4;			System.out.println("b %= 2 is 0: " +b);

		// Order of precidence for increment.
		int x = 14;
		int y = 5;
		int z = 2;
		
		int ans1 = (++x) - y - z * y; System.out.println(ans1);


		//implicit and explecit casting
		int x = 93;
		double y = 100;
		int ans1 = (int) x - (int) y;	System.out.println(ans1);
		

		//round method
		long result = Math.round(1.17); System.out.println(result);
		int ans = Math.round(4.12F); System.out.println(ans);
		
		//How to round to a specified number of decimal points
		//you need to make the decimal an integer first, by
		//multiplying the answer by 10, 100, etc, then completing
		//the function, then dividing by those numbers.
		
		double x = 2.1199; //round to one decimal
		x = (double) Math.round(x * 1000) / 1000; System.out.println(x);
		
		// POW & SQRT method (exponents & square roots)
		double ans = Math.pow(8, 2); System.out.println(ans);
		double ans1 = Math.sqrt(64); System.out.println(ans1);
	
		//random function designed to pick a number 1 though 5
		double y = Math.random() * 100 +1;
		double ans = Math.round(y);
		System.out.println(ans);
		
		//random function designed to flip a coin
		double y = Math.random();
		double flip = Math.round(y); 
			System.out.println(flip);
			System.out.println("1 = Heads, 0 = Tails");

		//NumberFormat Classes. Import Number Format
		//Currency
		double carCost = 5500;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String price = currency.format(carCost);
		System.out.println(price);

		//Percentage
		double interestRate = .6667;
		NumberFormat percent = NumberFormat.getPercentInstance();
		String interest = percent.format(interestRate);
		System.out.println(interest);
		
		//Format numbers to specific decimal places
		double score = 98.56;
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(1);
		String grade = number.format(score);
		System.out.println(grade);
*/		
		//Big Decimal (big problem)
		
	
		
		
		
	}	

}
