package BasicCalculations;

import java.util.Scanner;

public class SoftDrinks {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int student = readInt(input);

		System.out.print("Enter the number of bottles: ");
		int bottle = readInt(input);

		System.out.println();

		System.out.println("There will be " + (bottle/student) + " bottles for each student.");
		System.out.println("There will be " + (bottle%student) + " leftover bottles.");
	}

	private static int readInt(Scanner input) {
		return Integer.parseInt(input.nextLine().replace(',', '.'));
	}
}
