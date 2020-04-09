package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtil {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static double getDouble(String prompt) {
		double d = 0.0;
		
		try {
			System.out.print(prompt);
			d = sc.nextDouble(); //sorround with
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
			throw ime; //this method throws the exception
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return d;
	}

}
