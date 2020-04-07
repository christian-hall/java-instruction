package ui;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		// introduce the application
		System.out.println("Reservation Calculator");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

		// get input from the user
		int arrivalMonth = Console2.getInt("\nEnter the arrival month (1-12): ", 0, 13);
		int arrivalDay = Console2.getInt("Enter the arrival day: ", 0, 32);
		int arrivalYear = Console2.getInt("Enter the arrival year: ", 2019, 2121);
		int departureMonth = Console2.getInt("\nEnter the departure month (1-12): ", 0, 13);
		int departureDay = Console2.getInt("Enter the departure day: ", 0, 32);
		int departureYear = Console2.getInt("Enter the departure year: ", 2019, 2121);

		// business calculations
		// format the arrivalDate and departureDate Month and days
		String arrivalMonthF = monthDayFormat(arrivalMonth);
		String arrivalDayF = monthDayFormat(arrivalDay);
		String departureMonthF = monthDayFormat(departureMonth);
		String departureDayF = monthDayFormat(departureDay);
		// form arrival and departure dates
		LocalDate arrivalDate = LocalDate.parse(arrivalYear + "-" + arrivalMonthF + "-" + arrivalDayF);
		LocalDate departureDate = LocalDate.parse(departureYear + "-" + departureMonthF + "-" + departureDayF);
		//format arrival and departure dates
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String arrivalDateF = f.format(arrivalDate);
		String departureDateF = f.format(departureDate);
		//establish cost
		double ROOM_COST = 145.00;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String roomCostF = currency.format(ROOM_COST);
		//calculate the days
		long stayDuration = ChronoUnit.DAYS.between(arrivalDate, departureDate);
		//calculate total price
		double totalCost = ROOM_COST * stayDuration;
		String totalCostF = currency.format(totalCost);
		
		// display output
		System.out.println("\nArrival Date: " +arrivalDateF);
		System.out.println("Departure Date: " +departureDateF);
		System.out.println("Price: " +roomCostF +" per night");
		System.out.println("Total price: " +totalCostF +" for " +stayDuration + " nights");
		
		choice = Console2.getString("\nContinue? (y/n): ", "y", "n");
		}
		
		
		
		

		// say goodbye
		System.out.println("\nGoodbye!");

	}

	public static String monthDayFormat(int month) {
		String monthFormat = "";
		if (month < 10) {
			monthFormat = "0" + month;
		} else if (month > 9) {
			monthFormat = "" + month;
		}
		return monthFormat;
	}

}
