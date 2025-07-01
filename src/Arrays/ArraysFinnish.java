package Arrays;

import java.util.Scanner;

public class ArraysFinnish {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] englishWords = {"bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher"};
		String[] finnishWords = {"bussi", "auto", "kissa", "talo", "kuu", "aurinko", "kiitos", "juna", "opettaja"};
		
		System.out.print("Enter an English word: ");
		String english = input.nextLine();
		String output = "";
		for (int i = 0; i < englishWords.length; i++) {
			if (english.equals(englishWords[i])) {
				output = finnishWords[i];
			} 
		}
		
		if (output.equals("")) {
			output = "Unknown word";
		}
		
		System.out.println(output);
		
	}
}
