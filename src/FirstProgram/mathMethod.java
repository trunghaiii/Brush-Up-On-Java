package FirstProgram;

import java.util.Scanner;

public class mathMethod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the First Number: ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter the Second Number");
		int secondNumber = scanner.nextInt();

		System.out.println("The bigger number is " + Math.max(firstNumber, secondNumber));
		System.out.println("The smaller number is " + Math.min(firstNumber, secondNumber));
		System.out.println(
				"The value of first number to the power of second number is " + Math.pow(firstNumber, secondNumber));
		System.out.println("The square root of the first number is " + Math.sqrt(firstNumber));

	}

}
