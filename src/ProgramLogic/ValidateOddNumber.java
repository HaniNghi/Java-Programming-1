package ProgramLogic;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class ValidateOddNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an odd number: ");
		String inputString = input.nextLine();
		System.out.println();
		
		try {
			int inputNumber = Integer.parseInt(inputString);
			if (inputNumber % 2 == 0) {
				System.out.println(inputNumber + " is not an odd number");
			} else {
				System.out.println("Ok");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("'" + inputString + "'" + " is not an integer");
		}
	}
}
