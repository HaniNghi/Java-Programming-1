package ProgramLogic;

import java.util.Scanner;

public class PrintShape {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter width: ");
		int width = readInteger(input);
		
		System.out.print("Enter height: ");
		int height = readInteger(input);
		
		System.out.println();
		
		String output = "";
		
		for (int i = 1; i <= width; i++) {
			output = output + "*";
		}
		
		for (int i = 1; i <= height; i++) {
			System.out.println(output);
		}
	}
	
	private static int readInteger(Scanner input) {
		return Integer.parseInt(input.nextLine());
	}
}
