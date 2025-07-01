package ProgramLogic;

import java.util.Random;
import java.util.Scanner;

public class RandomProgram {
	static Random randomizer = new Random(); 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = randomizer.nextInt(100); 
		
		System.out.print("Guess a number (0-99): ");
		int guessNumber = Integer.parseInt(input.nextLine());
		
		while (guessNumber != number) {
			if (guessNumber > number) {
				System.out.println("The correct number is smaller!");
				System.out.println();
				System.out.print("Guess again: ");
				guessNumber = Integer.parseInt(input.nextLine());
			} else if (guessNumber < number) {
				System.out.println("The correct number is larger!");
				System.out.println();
				System.out.print("Guess again: ");
				guessNumber = Integer.parseInt(input.nextLine());
			}
		}
		
		System.out.println("Correct!");
	}
}
