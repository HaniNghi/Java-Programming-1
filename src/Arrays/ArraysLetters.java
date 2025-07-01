package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraysLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat Onedecimal = new DecimalFormat("0.0");
		String[] grades = {"A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "B", "A", "C", "C", "C"};
		
		System.out.print("Enter letter: ");
		String letter = input.nextLine();
		
		int count = 0;
	
		for (int i = 0; i < grades.length; i++) {
			if (letter.equals(grades[i])) {
				count++;
			}
		}
		
		double percent = (double) count/grades.length*100;
		System.out.println(Onedecimal.format(percent) + " %");
	}
}
