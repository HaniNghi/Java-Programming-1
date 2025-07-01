package ProgramLogic;

import java.util.Scanner;

public class MethodsRange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first value: ");
		int firstValue = Integer.parseInt(input.nextLine());

		System.out.print("Enter last value: ");
		int lastValue = Integer.parseInt(input.nextLine());
		System.out.println();
		printRange(firstValue, lastValue);
	}

	private static void printRange(int first, int last) {
		String range = "";
		for (int i = first; i <= last; i++) {
			range = range + i + " ";
		}
		System.out.print(range);
	}
}
