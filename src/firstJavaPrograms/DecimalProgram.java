package firstJavaPrograms;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimalProgram {
	public static void main(String[] args) {
		
		DecimalFormat TwoDecimals = new DecimalFormat("0.00");
		DecimalFormat SixDecimals = new DecimalFormat("0.000000");
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		double double1 = readDouble(input);
		
		
		System.out.print("Enter a decimal number: ");
		double double2 = readDouble(input);

		System.out.println();

		System.out.println(TwoDecimals.format(double1) + " * " + TwoDecimals.format(double2) + " = " + TwoDecimals.format(double1 * double2));

		System.out.println(TwoDecimals.format(double1) + " * " + TwoDecimals.format(double2) + " = " + SixDecimals.format(double1 * double2));


	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
