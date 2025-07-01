package ProgramLogic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		DecimalFormat oneDemical = new DecimalFormat("0.0");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int inputValue = readInteger(input);
		
		if (inputValue == 0) {
			System.out.println("No positive values");
			return;
		}
		
		double sumOfPositiveValues = 0;
		int amountOfValues = 0;
		
		if (inputValue > 0) {
			sumOfPositiveValues = inputValue;
			amountOfValues = 1;
		}
		
		while(inputValue != 0) {
			System.out.print("Enter next integer: ");
			inputValue = readInteger(input);
			
			if (inputValue > 0) {
				sumOfPositiveValues += inputValue; 
				amountOfValues++; 
			}
		}
				
		double averageResult = sumOfPositiveValues / amountOfValues; 
		
		System.out.println("\nThe average of the positive values is " + oneDemical.format(averageResult));
	}
	
	private static int readInteger(Scanner input) {
		return Integer.parseInt(input.nextLine());
	}
}
