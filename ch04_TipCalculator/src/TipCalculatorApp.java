import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to the Tip Calculator App! \n"
						  +"----------------------------------");
		System.out.println();
		
		//insert loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			//get input from user
			System.out.print("Cost of meal: ");
			Double mealCost = sc.nextDouble();
			System.out.println();
			
			//pull up currency format
			
			
			//get 15% tip and total
			double tipFifteen = mealCost * 0.15;
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String tipFifteenDollar = currency.format(tipFifteen);
			double fifteenTotal = tipFifteen + mealCost;
			String fifteenTotalDollar = currency.format(fifteenTotal);
			
			//get 20% tip and total
			double tipTwenty = mealCost * 0.2;
			String tipTwentyDollar = currency.format(tipTwenty);
			double twentyTotal = tipTwenty + mealCost;
			String twentyTotalDollar = currency.format(twentyTotal);
			
			//get 25% tip and total
			double tipTwentyFive = mealCost * 0.25;
			String tipTwentyFiveDollar = currency.format(tipTwentyFive);
			double twentyFiveTotal = tipTwentyFive + mealCost;
			String twentyFiveTotalDollar = currency.format(twentyFiveTotal);
			
			
			//output
			System.out.println("15%");
			System.out.println("Tip ammount: " +tipFifteenDollar);
			System.out.println("Total ammount: " +fifteenTotalDollar);
			System.out.println();
			System.out.println("20%");
			System.out.println("Tip ammount: " +tipTwentyDollar);
			System.out.println("Total ammount: " +twentyTotalDollar);
			System.out.println();
			System.out.println("25%");
			System.out.println("Tip ammount: "+tipTwentyFiveDollar);
			System.out.println("Total ammount: " +twentyFiveTotalDollar);
			System.out.println();
			
			//loop
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
			
		}
		sc.close();
		System.out.println("Goodbye");
	}

}
