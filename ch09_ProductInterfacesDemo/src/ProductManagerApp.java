 
public class ProductManagerApp {

	public static void main(String[] args) {
		// creat an instance of product
		Product p1 = new Product("java", "Murcah's Java Programming", 57.50);
		
		//print the product
		System.out.println("p1 = " + p1); 
		
		//clone that product
		Product p2 = null;
		try {
			p2 = (Product)p1.clone();
		}
		catch (CloneNotSupportedException cnse) {
			System.out.println(cnse);
		}
		
		//change the price of the cloned product
		System.out.println("Change price of p2.");
		p2.setPrice(45.99);
		
		//print both products
		System.out.println("p1 = " + p1); 
		System.out.println("p2 = " +p2);

	}

}
