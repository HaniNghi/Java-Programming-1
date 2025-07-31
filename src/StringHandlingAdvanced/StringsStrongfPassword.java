package StringHandlingAdvanced;

import java.util.Scanner;

public class StringsStrongfPassword {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter password: ");
		String inputPassword = input.nextLine();
		if (checkStrength(inputPassword)) {
			System.out.println("OK");
		} else {
			System.out.println("Not strong enough!");
		}
	}

	private static boolean checkStrength(String password) {

		if (password.length() < 8) {
			return false;
		}
		boolean isPassWordIncludeUpperCase = false;
		boolean isPassWordIncludeLowerCase = false;
		boolean isPassWordIncludeDigits = false;
		boolean isPassWordIncludeOtherLetters = false;

		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				isPassWordIncludeUpperCase = true;
			}
			if (Character.isLowerCase(c)) {
				isPassWordIncludeLowerCase = true;
			}
			if (Character.isDigit(c)) {
				isPassWordIncludeDigits = true;
			}
			if (!Character.isLetterOrDigit(c)) {
				isPassWordIncludeOtherLetters = true;
			}
		}

		int passRules = 0;
		if (isPassWordIncludeDigits)
			passRules++;
		if (isPassWordIncludeLowerCase)
			passRules++;
		if (isPassWordIncludeOtherLetters)
			passRules++;
		if (isPassWordIncludeUpperCase)
			passRules++;

		return passRules >= 3;
	}
}
