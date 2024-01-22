package FirstProgram;

import java.util.Scanner;

public class practiceProgram2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("solving a linear equation ax + b = 0");

		System.out.println("Enter a: ");
		int a = scanner.nextInt();
		System.out.println("Enter b: ");
		int b = scanner.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("equation with infinitely many solutions.");
		} else if (a == 0 && b != 0) {
			System.out.println("equation with no solution.");
		} else {
			float x = (float) -b / a;
			System.out.printf("The solution of equation is: %.3f", x);
		}

	}

}
