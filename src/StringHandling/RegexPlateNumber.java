package StringHandling;

import java.util.Scanner;

public class RegexPlateNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter plate number: ");
		String number = input.nextLine();

		if (number.matches("[A-Z]{3}-[0-9]{3}")) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid plate number");
		}
	}
}
