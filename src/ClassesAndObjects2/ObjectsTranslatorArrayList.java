package ClassesAndObjects2;

import java.util.ArrayList;
import java.util.Scanner;

import Objects.WordPair;

public class ObjectsTranslatorArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<WordPair> translatorArrayList = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		while (true) {
			System.out.print("Enter an English word: ");
			String englishWord = input.nextLine();
			if (englishWord.equalsIgnoreCase("ok")) {
				break;
			}
			System.out.print("Enter a Finnish word: ");
			String finnishWord = input.nextLine();
			translatorArrayList.add(new WordPair(englishWord, finnishWord));
		}

		System.out.println("=== English-Finnish translation service (quit ends) ===");

		while (true) {
			System.out.print("Enter an English word: ");
			String inputEnglishWord = input.nextLine();
			if(inputEnglishWord.equalsIgnoreCase("quit")) {
				System.out.println("Bye!");
				break;
			}
			
			boolean foundWord = false;
			
			for (WordPair wordPairObject: translatorArrayList ) {
				if (inputEnglishWord.equalsIgnoreCase(wordPairObject.getEnglishWord())) {
					System.out.println(wordPairObject.getFinnishWord());
					foundWord = true;
					break;
				}
			}
			
			if(!foundWord) {
				System.out.println("Unknown word");
			}
		}
	}
}
