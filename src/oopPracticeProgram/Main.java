package oopPracticeProgram;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();

		Product pr1 = product.inputData("Iphone", 100, 0.1);
		product.displayData(pr1);
		System.out.println(product.getTaxPrice(pr1.getPrice(), pr1.getTax()));

	}

}
