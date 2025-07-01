package ProgramLogic;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class ValidateAnswer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("What is 2 + 3? ");

		int correctAnswer = 5;
		boolean answeredCorrectly = false;

		while (!answeredCorrectly) {
			String inputAnswer = input.nextLine();

			try {
				int inputNumber = Integer.parseInt(inputAnswer);
				if (inputNumber == correctAnswer) {
					System.out.println("Correct!");
					answeredCorrectly = true;
				} else {
					System.out.print("Incorrect! Try again: ");
				}
			} catch (NumberFormatException nfe) {
				System.out.print("That is not a number! Try again: ");
			}
		}

	}
}
