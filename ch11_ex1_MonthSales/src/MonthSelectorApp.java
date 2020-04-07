import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July","August",
        					  "September", "October", "November", "December"};
        
        double[] monthSales = {1701.00, 2100.56, 2439.40, 2967.99, 3842.82, 5656.56,
        					   7945.34, 7521.82, 9999.99, 14600.21, 21212.12, 74656.76};


        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            System.out.println(monthNumber);
            
            // get the index number for the month
            // and display the month name and sales   
            int i = monthNumber - 1;
            
            System.out.println("Sales for " +monthName[i] + ": " +currency.format(monthSales[i]));
            System.out.println();


            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        
      //  double sum = 0;
	  //  for (int i = 0; i < monthSales.length; i++) {
	  //	 sum += monthSales[i];
        
        //enhanced loop
        double sum = 0;
        for (double monthSale : monthSales) {
        	sum += monthSale;
		}
			
        System.out.println();
        System.out.println("Total sales: " +currency.format(sum));
        
        Console.displayLine();
    }

}
