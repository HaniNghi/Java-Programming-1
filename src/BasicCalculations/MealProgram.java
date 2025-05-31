package BasicCalculations;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MealProgram {
	public static void main(String[] args) {
		DecimalFormat TwoDecimals = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the price of food: ");
		double price = readDouble(input);
		
		System.out.print("Enter the tax rate: ");
		double taxRate = readDouble(input);
		
		System.out.print("Enter the tip percentage: ");
		double tipRate = readDouble(input);
		
		double totalCost = price + price*(taxRate + tipRate)/100;
		
		System.out.println();
		
		System.out.println("The total cost is " + TwoDecimals.format(totalCost));
		
	}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}