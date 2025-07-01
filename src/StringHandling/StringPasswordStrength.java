package StringHandling;

import java.util.Scanner;

public class StringPasswordStrength {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = input.nextLine();

		System.out.print("Enter password: ");
		String password = input.nextLine();

		if (checkStrength(username, password) == true) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
	}

	private static boolean checkStrength(String username, String password) {
		boolean isPasswordIncludeUserName = (password.toLowerCase()).contains(username.toLowerCase());

		if (password.length() >= 9 && !isPasswordIncludeUserName) {
			return true;
		} else {
			return false;
		}

	}
}
