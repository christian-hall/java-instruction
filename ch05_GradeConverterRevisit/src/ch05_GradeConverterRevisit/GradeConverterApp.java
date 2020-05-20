package ch05_GradeConverterRevisit;

import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Converter App");
		System.out.println();
		String choice = getChoice();
		Scanner sc = new Scanner(System.in);
		String letterGrade = "";
		while (choice.equalsIgnoreCase("y")) {
			int grade = getNumber();
			printGrade(grade);
			choice = getChoice();
			System.out.println();
		}
		System.out.println("Goodbye");

	}
	
	private static String getChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Continue (y/n): ");
		String choice = sc.next();
		return choice;
		
	}

	private static int getNumber() {
		System.out.print("\nEnter number grade from 0 to 100: ");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		System.out.println();
		return grade;
	}
	
	private static String getGrade(int grade) {
		String letterGrade = "";
		if (grade > 100 && grade < 0) {
			System.out.println("error: number not in range!\n");
		}
		else if (grade > 90 && grade < 101) {
			letterGrade = "A";
		}
		else if (grade > 80 && grade < 91) {
			letterGrade = "B";
		}
		else if (grade > 70 && grade < 81) {
			letterGrade = "C";
		}
		else if (grade > 60 && grade < 81) {
			letterGrade = "D";
		}
		else if (grade < 61) {
			letterGrade = "F";
		}
		return letterGrade;
	}
	
	private static void printGrade(int grade) {
		String letterGrade = getGrade(grade);
		System.out.println("Letter grade: " + getGrade(grade) +"\n");
	}
				
}
