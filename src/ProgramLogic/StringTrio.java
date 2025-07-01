package ProgramLogic;

import java.util.Scanner;

public class StringTrio {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first string: ");
		String string1 = input.nextLine();

		System.out.println("Enter second string: ");
		String string2 = input.nextLine();

		System.out.println("Enter third string: ");
		String string3 = input.nextLine();

		if (string1.equals(string2) && string2.equals(string3)) {
			System.out.println("The strings are equal in case-sensitive comparison");
		} else if (string1.equalsIgnoreCase(string2) && string2.equalsIgnoreCase(string3)) {
			System.out.println("The strings are equal in case-insensitive comparison");
		} else {
			System.out.println("The strings are not equal");
		}

	}
}
