import java.util.Scanner;

public class Console {
    
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }
    
    // yes/no validator
    public static String getStringYN(String prompt) {
    	String s = "";
    	boolean isValid = false;
    	while (!isValid) {
    		s = getString(prompt);
    		if (s.equals("y")) {
    			isValid = true;

    		}
    		else if (s.equals("n")) {
    			isValid = true;
    		}
    		else {
    			System.out.println("Error! Entry must be a 'y' or 'n'. Try again.");
    		}
    	}
    	return s;
    	
    }
    
    // customer/employee validator
    public static String getStringCE(String prompt) {
    	String s = "";
    	boolean isValid = false;
    	while (!isValid) {
    		s = getString(prompt);
    		if (s.equals("c")) {
    			isValid = true;

    		}
    		else if (s.equals("e")) {
    			isValid = true;
    		}
    		else {
    			System.out.println("Error! Entry must be a 'c' or 'e'. Try again.");
    		}
    	}
    	return s;
    	
    }
    

    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
}