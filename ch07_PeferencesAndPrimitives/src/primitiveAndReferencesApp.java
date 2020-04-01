
public class primitiveAndReferencesApp {

	public static void main(String[] args) {
		System.out.println("Hello:");

		System.out.println("Primiteve types");
		double p1 = 57.50;
		double p2 = p1;
		p1 = 45.50;
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);

		Product product1 = new Product("java", "Murcah's Java", 57.50);
		Product product2 = product1;
		Product product3 = new Product("java", "Murcah's Java", 57.50);
		System.out.println("product 1 == product2: " + (product1 == product2));
		System.out.println("product 1 == product3: " + (product1 == product3));

		double p3 = 50.0;
		p3 = changePrice2(p3);
		System.out.println("p3 =" + p3);
		System.out.println("bye");
		System.out.println("p3 =" + p3);
		
		changePrice2(product1);
		System.out.println(product1);
		System.out.println();

	}

	private static void changePrice(double d) {
		// increase d by 10%
		System.out.println("d = " + d);
		d *= 1.1;
		System.out.println("d = " + d);

	}

	private static double changePrice2(double d) {
		// increase d by 10%
		System.out.println("d = " + d);
		d *= 1.1;
		System.out.println("d = " + d);
		return d;

	}
	private static void changePrice2(Product p) {
		double d = p.getPrice();
		d *= 1.1;
		p.setPrice(d);
	}
	
}