package StringHandling;

import java.util.Scanner;

public class StringCharacters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter  a string: ");
		String inputString = input.nextLine();

		int letters = 0;
		int digits = 0;
		int others = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char character = inputString.charAt(i);

			if (Character.isLetter(character)) {
				letters++;
			} else if (Character.isDigit(character)) {
				digits++;
			} else {
				others++;
			}
		}
		System.out.println(letters + " letter(s)");
		System.out.println(digits + " digit(s)");
		System.out.println(others + " other character(s)");
	}
}
