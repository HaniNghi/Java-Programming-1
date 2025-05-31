package BasicCalculations;

import java.util.Scanner;

public class DivisionAndRemainder {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter x: ");
		int x = readInt(input);

		System.out.print("Enter y: ");
		int y = readInt(input);

		System.out.println();
		
		if (x % 2 == 0) {
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}
		
		if (y % 2 == 0) {
			System.out.println(y + " is even");
		} else {
			System.out.println(y + " is odd");
		}
		
		System.out.println("The remainder of " + x + " / " + y + " is " + (x % y));
		System.out.println("The remainder of " + y + " / " + x + " is " + (y % x));
	}

	private static int readInt(Scanner input) {
		return Integer.parseInt(input.nextLine().replace(',', '.'));
	}
}
