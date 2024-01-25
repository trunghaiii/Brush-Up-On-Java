package FirstProgram;

import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the Array that you want to create: ");
		int size = scanner.nextInt();

		int[] numbersArray = new int[size];

		System.out.println("Now enter integer elements to push on the Array: ");

		for (int i = 0; i < size; i++) {
			numbersArray[i] = scanner.nextInt();
		}

		System.out.println("Done! This is your Array: " + Arrays.toString(numbersArray));

	}

}
