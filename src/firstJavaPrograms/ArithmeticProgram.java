package firstJavaPrograms;

import java.util.Scanner;

public class ArithmeticProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int integer1 = Integer.parseInt(input.nextLine());

		System.out.print("Enter another integer: ");
		int integer2 = Integer.parseInt(input.nextLine());

		System.out.print("Enter a decimal number: ");
		double aDouble = readDouble(input);
		
		System.out.println();
		
		System.out.println(integer1 + " * " + integer2 + " = " + (integer1 * integer2));
		
		System.out.println(integer1 + " * " + aDouble + " = " + (integer1 * aDouble));
		
		System.out.println(aDouble + " * " + aDouble + " = " + (aDouble * aDouble));

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
