package FirstProgram;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// Tax Calculation Program:

		Scanner scanner = new Scanner(System.in);
		int tax;

		System.out.println("What is your income per year?");
		int income = scanner.nextInt();

		if (income < 50000) {
			tax = (income / 100) * 5;
			System.out.println("You have to pay (5%) " + tax + " $ for tax");
		} else if (income < 100000) {
			tax = (income / 100) * 10;
			System.out.println("You have to pay (10%) " + tax + " $ for tax");
		} else {
			tax = (income / 100) * 20;
			System.out.println("You have to pay (20%) " + tax + " $ for tax");
		}

	}

}
