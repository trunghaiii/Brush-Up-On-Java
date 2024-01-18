package FirstProgram;

import java.util.Scanner;

public class practiceProgram1 {

	public static void main(String[] args) {

		// This is Rectangle Calculation Program:

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of the rectangle: ");
		int length = scanner.nextInt();

		System.out.println("Enter the width of the rectangle: ");
		int width = scanner.nextInt();

		int perimeter = (length + width) * 2;
		int area = length * width;

		System.out.println("The length is " + Math.max(length, width));
		System.out.println("The width is " + Math.min(length, width));
		System.out.println("The perimeter is " + perimeter);
		System.out.println("The area is " + area);

	}

}
