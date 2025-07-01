package ProgramLogic;

import java.util.Scanner;

public class MethodsPrimality {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int inputNumber = Integer.parseInt(input.nextLine());

		String output = "";

		for (int i = 1; i < inputNumber; i++) {
			if (isPrime(i) == false) {
				output += i + " ";
			}
		}

		if (inputNumber <= 1) {
			System.out.println("Nothing to be printed");
		} else {

			System.out.println(output);
		}
	}

	private static boolean isPrime(int inputValue) {
		if (inputValue <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(inputValue); i++) {
			if (inputValue % i == 0) {
				return false;
			}
		}

		return true;
	}
}
