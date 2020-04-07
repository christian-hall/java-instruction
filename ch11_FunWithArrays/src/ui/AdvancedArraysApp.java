package ui;

import java.util.Arrays;

import business.Product;

public class AdvancedArraysApp {

	public static void main(String[] args) {
		// lets create an array of numbers
		int[] numbers = { 11, 67, 222, 4, 76 };

		// order/sort, modify/add/remove, search(binary search), copy,
		// search
		int idx = Arrays.binarySearch(numbers, 222);
		System.out.println("idx of 222 = " + idx);

		// sort
		System.out.println("All elements of the array: ");
		for (int n : numbers) {
			System.out.println(n);
		}
		System.out.println("Sort them!");
		Arrays.sort(numbers);
		for (int n : numbers) {
			System.out.println(n);
		}
		
		System.out.println("=============lets sort some strings!==========");
		String[] students = {"Marcus", "Jeff", "Tyler", "Sarah", "Sam", "Christian"};
		for (String s: students) {
		System.out.println(s);
		}
		
		System.out.println("Sort em");
		Arrays.sort(students);
		for (String s: students) {
			System.out.println(s);
			}
		
		System.out.println("=========sort some products ===========");
		Product p1 = new Product("java", "Murach's Java", 55.55);
		Product p2 = new Product("andr", "Murach's Android", 65.55);
		Product p3 = new Product("mysql", "Murach's MySQL", 39.99);
		Product p4 = new Product("html", "Murach's HTML", 45.99);
		
		Product[] products = {p1,p2,p3,p4};
		for (Product p: products) {
			System.out.println(p);
		}
		//this would fail because Java does not know how to compare complex objects to each other
		//here is what is needed to sort objects stored in arrays
		System.out.println("===========sort============");
		Arrays.sort(products);
		for (Product p: products) {
			System.out.println(p);
		}
		
		System.out.println("==============rectangular array===================");
		int[][] table = new int[3][2]; //3x2, 3 rows, 2 columns
		table[0][0] = 1;
		table[0][1] = 2;
		table[1][0] = 3;
		table[1][1] = 4;
		table[2][0] = 5;
		table[2][1] = 6;
		
		for (int i = 0; i < table.length; i ++ ) { //iterate through rows
			for (int j = 0; j < table[i].length; j++) { //iterate through the columns
				System.out.print(table[i][j] + " ");	
			}
			System.out.print("\n");
		}

	}

}
