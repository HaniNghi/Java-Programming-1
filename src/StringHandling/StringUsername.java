package StringHandling;

import java.util.Scanner;

public class StringUsername {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter given name: ");
		String name = input.nextLine();

		System.out.print("Enter surname: ");
		String surname = input.nextLine();
		
		if (createUsername(name, surname) == null) {
			System.out.println("Not enough letters to create a username!");
		} else {
			System.out.println(createUsername(name, surname));
		}

	}

	private static String createUsername(String name, String surname) {
		String username = "";

		if (surname.length() >= 3 && name.length() >=2) {
			String lastThreeLetters = surname.substring(surname.length() - 3);
			username += lastThreeLetters + name.substring(0, 2);
		} else {
			username = null;
		}

		return username.toLowerCase();

	}
}