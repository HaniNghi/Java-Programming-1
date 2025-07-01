package ProgramLogic;

import java.util.Scanner;

public class PrintNumbers_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the middle number: ");
		int middleNumber = readInteger(input);
		
		String output= "";
		
		for (int i = 1; i <= middleNumber; i++) {
			output = output + i + " ";
		}
		
		for (int i = (middleNumber - 1); i >= 1; i-- ) {
			output = output + i + " ";
		}
		
		System.out.println(output);
	}

	private static int readInteger(Scanner input) {
		return Integer.parseInt(input.nextLine());
	}
}
