package FirstProgram;

import java.util.Random;
import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);

		int randomNumber = rand.nextInt(10);
		boolean lost = true;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Guess the number from 1 to 9: (time " + i + ")");
			int guessNumber = scanner.nextInt();

			if (guessNumber == randomNumber) {
				System.out.println("Congratulations! Your guess is right! " + randomNumber);
				lost = false;
				break;
			}
		}

		if (lost == true) {
			System.out
					.println("Sorry! You lost the Game. No more time to guess! the correct answer is " + randomNumber);
		}

	}

}
