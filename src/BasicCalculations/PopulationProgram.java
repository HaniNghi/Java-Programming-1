package BasicCalculations;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PopulationProgram {
	public static void main(String[] args) {
		DecimalFormat OneDecimals = new DecimalFormat("0.0");
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the population of the area A: ");
		double a = readDouble(input);
		
		System.out.print("Enter the population of the area B: ");
		double b = readDouble(input);
		
		System.out.print("Enter the population of the area C: ");
		double c = readDouble(input);
		
		double percentA = a / (a + b + c);
		double percentB = b / (a + b + c);
		double percentC = c / (a + b + c);
		
		System.out.println();
		
		System.out.println("A: " + OneDecimals.format(percentA*100) + " %");
		System.out.println("B: " + OneDecimals.format(percentB*100) + " %");
		System.out.println("C: " + OneDecimals.format(percentC*100) + " %");

	}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
