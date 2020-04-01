import java.text.NumberFormat;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle() {
		length = 0;
		width = 0;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		double area = length * width;
		return area;
	}

	public String getAreaFormat() {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(3);
		String numberFormatted = number.format(this.getArea());
		return numberFormatted;
	}

	public double getPerimeter() {
		double perimeter = length * 2 + width * 2;
		return perimeter;
	}

	public String getPerimeterFormat() {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(3);
		String numberFormatted = number.format(this.getPerimeter());
		return numberFormatted;
	}

}
