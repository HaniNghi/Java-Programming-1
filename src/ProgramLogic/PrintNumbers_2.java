package ProgramLogic;

import java.util.Scanner;

public class PrintNumbers_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the middle number: ");
		int middleNumber = readInteger(input);

		String output = "";

		int count = 0;

		for (int i = 1; i <= middleNumber; i++) {
			output = output + i + " ";
			count = count + 1;
		}

		for (int i = (middleNumber - 1); i >= 1; i--) {
			output = output + i + " ";
			count = count + 1;
		}

		System.out.println(output);

		if (count == 1) {
			System.out.println(count + " number printed");
		} else {
			System.out.println(count + " numbers printed");
		}
	}

	private static int readInteger(Scanner input) {
		return Integer.parseInt(input.nextLine());
	}
}
