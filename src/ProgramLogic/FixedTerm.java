package ProgramLogic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FixedTerm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.println("Enter initial deposit: ");
		double deposit = Double.parseDouble(input.nextLine().replace(",", "."));

		System.out.println("Enter time period in full years: ");
		int year = Integer.parseInt(input.nextLine());

		System.out.println("Enter interest rate (%): ");
		double interestRate = Double.parseDouble(input.nextLine().replace(",", "."));

		System.out.println("Enter capital income tax rate (%): ");
		double taxRate = Double.parseDouble(input.nextLine().replace(",", "."));
		System.out.println();
		double balanceEveryYear = deposit;
		double interestEveryYear = 0;
		for (int i = 1; i <= year; i++) {
			interestEveryYear = interestEveryYear + interestRate / 100 * balanceEveryYear;
			balanceEveryYear = deposit + interestEveryYear;
			System.out.println("Year " + i + ": " + twoDecimals.format(interestEveryYear) + " | "
					+ twoDecimals.format(balanceEveryYear));
		}
		System.out.println();
		double interestAfterTax = (1 - taxRate / 100) * (balanceEveryYear - deposit);
		double finalBalanceAfterTax = deposit + interestAfterTax;
		System.out.println("The interest after tax is " + twoDecimals.format(interestAfterTax));
		System.out.println("The remaining balance after tax is " + twoDecimals.format(finalBalanceAfterTax));
	}
}
