import java.text.NumberFormat;

public class FormatNumbersApp {

	public static void main(String[] args) {
		double carPrice = 35000.00;
		System.out.println("Car price is: "+carPrice);
		//format as a currency
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Formatted car price is: "+ cf.format(carPrice));
		
		double interestRate = .035;
		NumberFormat pf = NumberFormat.getPercentInstance();
		pf.setMinimumFractionDigits(1); //adds fraction
		System.out.println("interest rate is: "+interestRate);
		System.out.println("formatted interest rate is: " +pf.format(interestRate));
		

	}

}
