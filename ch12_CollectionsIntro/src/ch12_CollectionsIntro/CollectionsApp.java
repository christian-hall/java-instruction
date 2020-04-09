package ch12_CollectionsIntro;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsApp {

	public static void main(String[] args) {
		System.out.println("Create an array of ints...");
		int[] numbersArray = new int[5];
		numbersArray[0] = 5;
		numbersArray[1] = 7;
		numbersArray[2] = 15;
		numbersArray[3] = 22;
		numbersArray[4] = 3;
		
		for (int number: numbersArray) {
			System.out.println(number);
		}
		System.out.println();
		
		//part of the collection framework, make sure to import util
		ArrayList<Integer> numbersList = new ArrayList<>(); 
		numbersList.add(5);
		numbersList.add(7);
		numbersList.add(15);
		numbersList.add(22);
		numbersList.add(3);
		numbersList.add(3);
		numbersList.add(3);
		numbersList.add(3);
		numbersList.add(3);
		numbersList.add(0,1);
		for (int number : numbersList) {
			System.out.println(number);
		}
		System.out.println(numbersList);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Sean");
		names.add("Trevor");
		names.add("Marcus");
		names.add("Christian");
		System.out.println(names);
		
		//get a specific instance
		System.out.println("What name is in position 2? " +names.get(2));
		//below throws an exception becuase there is not an entry
		//System.out.println("What names is in position 4? " +names.get(4));
		//This gets the size of array (length)
		System.out.println("How big is the array list? "+names.size());
		System.out.println("Is Trevor in the list? " +names.contains("Trevor"));
		System.out.println("Position of Christian: " +names.indexOf("Christian"));
		//like arrays, when your sort strings, capital letters are sorted first
		//followed by lowercase letters
		//you can use the method below to bypass this
		Collections.sort(names,String.CASE_INSENSITIVE_ORDER);
		System.out.println(names);

	}

}
