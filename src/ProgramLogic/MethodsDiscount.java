package ProgramLogic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsDiscount {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		System.out.print("Enter list price: ");
		double listPrice = Double.parseDouble(input.nextLine().replace(",", "."));
		
		System.out.print("Enter selling price: ");
		double sellPrice = Double.parseDouble(input.nextLine().replace(",", "."));
		
		double discount = computePercentage(listPrice, sellPrice);
		
		System.out.println();
		System.out.println("The discount percentage is " + twoDecimals.format(discount) + " %");
		
	}
	private static double computePercentage(double listPrice, double sellPrice) {
		
		return ((listPrice - sellPrice)/listPrice)*100;
		
	}
}
