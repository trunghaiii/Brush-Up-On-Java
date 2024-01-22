package FirstProgram;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What do you want to know about? ");
		System.out.println("1. Computer Science");
		System.out.println("2. Accounting");
		System.out.println("3. Law");
		System.out.println("================================");
		System.out.println("What is your option number?");

		int option = scanner.nextInt();

		switch (option) {
		case 1:
			System.out.println("Computer science is the study of computers and computing technologies, "
					+ "encompassing the theoretical and practical aspects of computation.");
			break;
		case 2:
			System.out.println("Accounting is the systematic process of recording, analyzing, interpreting, "
					+ "summarizing, and presenting financial information.");
			break;
		case 3:
			System.out.println(
					"Law refers to a system of rules and regulations that are created and enforced by a recognized authority, "
							+ "such as a government or legal institution. ");
			break;
		default:
			System.out.println("Your option is not available");
			break;
		}
	}

}
