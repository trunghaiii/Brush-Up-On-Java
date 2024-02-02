package oopPracticeProgram;

public class Product {

	private String name;
	private double price;
	private double tax;

	public void inputData() {
	}

	public void displayData() {
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}
}
