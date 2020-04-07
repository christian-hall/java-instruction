package ui;

import business.Product;

public class ArraysApp {

	public static void main(String[] args) {
		System.out.println("define some arrays...");

		double[] prices;
		prices = new double[10];

		// arrays start at an index of 0, so 0 - 9 if you have 10 prices
		prices[0] = 14.99;
		prices[1] = 2.57;

		System.out.println("prices [0] = " + prices[0]);
		System.out.println("prices [1] = " + prices[1]);
		System.out.println("prices [9] = " + prices[9]);

		String[] names = new String[5];
		names[0] = "Sally";
		names[1] = "George";
		System.out.println("Names [0] = " + names[0]);
		System.out.println("Names [1] = " + names[1]);
		System.out.println("Names [4] = " + names[4]);
		// System.out.println("Names [5] = " +names[5]); //gets an exception

		int[] numbers = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println("Numbers 0 = " + numbers[0]);
		System.out.println("Numbers 8 = " + numbers[8]);
		System.out.println("Numbers length? = " + numbers.length);
		System.out.println("compute the average of the numbers array");
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("sum " + sum);
		System.out.println("average = " + sum / numbers.length);

		System.out.println("all numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("numbers: " + i + "=" + numbers[i]);
			System.out.println();
		}
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println("numbers: " + i + "=" + numbers[i]);

		}
		for (int i = 0; i < numbers.length; i += 2) {
			System.out.println("numbers: " + i + "=" + numbers[i]);
		}

		Product[] products = new Product[5];
		Product p1 = new Product("java", "Murach's Java Programming", 57.50);
		Product p2 = new Product(".net", "Murach's C# & .Net Programming", 54.50);

		products[0] = p1;
		products[2] = p2;
		int i = 0;
		for (i = 0; i < products.length; i++) {
			System.out.println("Product[i] = " + i + "=" + products[i]);
		}
		System.out.println("=================");
		System.out.println("Find the product for a given code...");

		//a way to look for products
		String code = Console.getString("enter code: ");
		Product p = null;
		i = 0;
		for (i = 0; i < products.length; i++) {
			if (products[i] != null) {
				if (products[i].getCode().equalsIgnoreCase(code)) {
					//this is the product we are looking for!!!
					p = products[i];
				}
			}
		}
		System.out.println("Product is " + p);
		System.out.println("==============================");
		System.out.println("find profucts at a specific positoin/index");
		int idx = Console.getInt("Enter an index position to retreive: ");
		Product pdt1 = products[idx];
		System.out.println("Product found at position " +idx+ ": " +pdt1);
		
		//advanced for loop
		//print each product in the array if it's not null
		for (Product pdt2 : products) {
			if (pdt2==null) {
				System.out.println("-empty slot-");
			} else {
				System.out.println(pdt2);
			}
		}
	}
}
