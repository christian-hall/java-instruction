
public class ProductManagerApp {

	public static void main(String[] args) {
		//create some instances of Products
		//Display their information 
		System.out.println("Welcome to Product Manager");
		//create 2 instances of Product
		Product p1 = new Product();
		p1.setCode("java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(57.50);
		System.out.println(p1.toString());
		System.out.println("Price of p1 is " +p1.getPriceFormatted());
		
		//this is a more concise way to do this. Do this unless 
		//the situation dictates the need to set it like above.
		Product p2 = new Product("MySQL", "Murach's MySQL", 54.50);
		System.out.println(p2);
		
		Product p3 = new Product ("C#", "Murach's C#", 55.50);
		System.out.println(p3);
		
		
		System.out.println("Goodbye");
	}

}
