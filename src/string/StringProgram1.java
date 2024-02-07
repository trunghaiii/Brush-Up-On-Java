package string;

import java.util.Scanner;

public class StringProgram1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your username: ");
		String username = scanner.nextLine();

		System.out.println("Enter your password: ");
		String password = scanner.nextLine();

		if (username.equals("trunghai")) {
			if (password.length() > 5) {
				if (password.equals("123456")) {
					System.out.println("Logged In");
				} else {
					System.out.println("Incorrect Password");
				}
			} else {
				System.out.println("Invalid Password");
			}
		} else {
			System.out.println("Incorrect username");
		}

	}

}
