package ui;

public class EmailCreatorApp {

	public static void main(String[] args) {
		//display introduction
		System.out.println("Email Creator\n");
		
		//store information in a String[](instead of getting user input)
		String[] csv =  {"james    , butler,jbutler@gmail.com",
				        "Josephine,Darakjy,Josephine_Darakjy@darakjy.org",
				        "ART,VENERE,ART@VENERE.ORG"};
		
		
				
		//combine email and information into one String
		for (int i = 0; i <csv.length; i++) {
			//format the names
			//remove all spaces
			csv[i] = csv[i].replace(" ", "");
			//separate by commas
			int index1 = csv[i].indexOf(",");
			int index2 = csv[i].indexOf(",", (index1)+1);
			String firstName = csv[i].substring(0, index1);
			String emailAddress = csv[i].substring((index2+1));
			//format the first name
			StringBuilder firstNameFormatted = new StringBuilder();
			firstName = firstName.toUpperCase();
			char firstLetter = firstName.charAt(0);
			firstName = firstName.toLowerCase();
			firstNameFormatted.append(firstName);
			System.out.println("firstNameFormatted: " +firstNameFormatted);
			firstNameFormatted.setCharAt(0, firstLetter);
			//format the email address
			emailAddress = emailAddress.toLowerCase();
			
			
			//insert the names and email addresses into the email
			//store email template into a String
			StringBuilder template = new StringBuilder();
			template.append("========================================================\n");
			String toLine = "To:        " +emailAddress +"\n";
			template.append(toLine);
			template.append("From:      noreply@deals.com\n");
			template.append("Subject:   Deals!\n\n");
			String headLine = "Hi "+firstNameFormatted +",\n\n";
			template.append(headLine);
			template.append("We've got some great deals for you. Check your website!");
			//insert email address
			System.out.println(template);
		}
		
		//print them out

	}

}
