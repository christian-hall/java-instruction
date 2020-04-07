

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        //identify the name seperations by the spaces
        int nameLength = name.length();
        int index1 = name.indexOf(" ");
        int index2 = name.indexOf(" ", index1 + 1);
        
        //if statement that assigns strings to names between two or three
        
        if (index2 == -1) { //if there is only a first or last name)
        	String firstName = name.substring(0, index1);
        	String lastName = name.substring((index1 + 1));
        	System.out.println();
        	System.out.println("First name: " +firstName);
        	System.out.println("Last name:  " +lastName);
        	
        } else if (index2 != -1) { //if there is a first, middle, and last name
        	String firstName = name.substring(0, index1);
        	String middleName = name.substring((index1 + 1), index2);
        	String lastName = name.substring((index2 + 1));
        	System.out.println();
        	System.out.println("First name:  " +firstName);
        	System.out.println("Middle name: " +middleName);
        	System.out.println("Last name:   " +lastName);
        	
        }
        
        //seperate the name into two or three names
        
        //print out new names
        
    }
}
