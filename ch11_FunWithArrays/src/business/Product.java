package business;
import java.text.NumberFormat;

public class Product implements Cloneable, Comparable { //not going to compile until Printable is implemented
	//define some instance variables
	//an instance is an instance of the class (a physical product of the class)
	//instance variables are variables that are applied to the instance of a class 
	
	// 1. define some instance variables
	private String code; //private is an access modifier
	private String description;
	private double price;
	private static int numberOfObjects;
	
	// 2. define constructor(s)
	// this is an empty/default constructor, because it has no parameters
	public Product() {	
		//Explicitly initialize variables
		code = "";
		description = "";
		price = 0;
		numberOfObjects++;
	}
	//fully loaded constructor (all variables)
	public Product(String code, String description, double price) {
		super(); //this is the "super" class
		this.code = code; //the "this" keyword refers to "this instance" of 
						  //the previous constructor
		this.description = description;
		this.price = price;
		numberOfObjects++;
	}
	
	// 3. define getters and setters
	public String getCode() {
		return code;
	}
	
	
	
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPriceFormatted() {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		return cf.format(price);
	}
	
	// 4/ (optional) toString()
	//these methods are not static. They are meaningless unless
	//the variables in the constructors above have value
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + getPriceFormatted() 
		+ "# of objects = " + numberOfObjects + "]";
	
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public int compareTo(Object arg0) {
		// tell java how to compare products, in this case the code
		//compareTo needs to return either -1, 0, or 1
		Product pdt = (Product)arg0;
		return code.compareTo(pdt.getCode());
	}
	

	
	
	
}
