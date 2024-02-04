package oopPracticeProgram;

public class Product {

	private String name;
	private double price;
	private double tax;

	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Product inputData(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;
	}

	public void displayData(Product pr) {
		System.out.println("Name: " + pr.name);
		System.out.println("Price: " + pr.price);
		System.out.println("Tax: " + pr.tax);
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}
}
