package ProgramLogic;

import java.util.Iterator;
import java.util.Scanner;

public class MethodsTriplex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int inputInteger = Integer.parseInt(input.nextLine());
		
		
		
		String output = "";
		
		for (int i = 1; i <= inputInteger; i++) {
			
			output += "triplex(" + i + ") = " + triplex(i) +"\n";
			
		}
		System.out.println(output);
	}
	
	private static int triplex(int inputValue) {
		
		int outputValue = 1;
		
		for (int i = 1; i < inputValue; i+=3) {
			outputValue *= i;
		}
		
		return outputValue*inputValue;
		
	}
}
