package ProgramLogic;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.NumberFormatException;

public class ValidatePrice {
	public static void main(String[] args) {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);
		try {

			System.out.print("Enter the price before VAT: ");
			double priceBeforeVat = readDouble(input);

			System.out.println();

			System.out.println("The VAT inclusive price is " + twoDecimals.format(1.25 * priceBeforeVat));
		} catch (NumberFormatException nfe) {

			System.out.println();

			System.out.println("Invalid price!");
		}
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
