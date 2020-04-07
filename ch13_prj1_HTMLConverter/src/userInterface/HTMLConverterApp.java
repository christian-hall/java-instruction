package userInterface;

public class HTMLConverterApp {

	public static void main(String[] args) {
		System.out.println("HTML Converter\n");
		System.out.println("INPUT:");
		String htmlInput = "<h1>Grocery List </h1>" + "\n" +
	                       "<ul>"                   + "\n" +
	                       "<li>Eggs</li>"          + "\n" +
	                       "<li>Milk</li>"          + "\n" +
	                       "<li>Butter</li>"        + "\n" ;
		System.out.println(htmlInput);
		
		//remove everything but <li>, replace <li> with *
		
		String html0 = htmlInput.replace("<h1>", "");
		String html1 = html0.replace("</h1>", "");
		String html2 = html1.replace("<ul>", "");
		String html3 = html2.replace("</li>", "");
		String html4 = html3.replace("<li>", "*");
		System.out.println("OUTPUT:");
		System.out.println(html4);
	}

}
