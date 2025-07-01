package StringHandling;

import java.util.Scanner;

public class RegexStudentNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student number: ");
		String studentNumber = input.nextLine();
	
		
		if ((studentNumber.matches("^2[0-9]{7}"))){
			System.out.println("OK");
		} else {
			System.out.println("Invalid student number");
		}
	}
}
