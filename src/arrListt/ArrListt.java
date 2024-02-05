package arrListt;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> myArr = new ArrayList();

		while (true) {
			System.out.println("Enter a number: ");
			double number = scanner.nextDouble();

			myArr.add(number);
			scanner.nextLine();

			System.out.println("Continue? Y or N: ");
			String option = scanner.nextLine();

			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}

		System.out.println("Your Array You Just Created Is: " + myArr);

		double sum = 0;
		for (int i = 0; i < myArr.size(); i++) {
			sum += myArr.get(i);
		}

		System.out.println("The Sum of your array is: " + sum);

	}

}
