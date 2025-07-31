package Objects;

import java.util.Scanner;

public class ObjectsTranslatorArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an English word: ");
		String englishWord = input.nextLine();

		WordPair[] wordPairs = new WordPair[6];

		wordPairs[0] = new WordPair("bird", "lintu");
		wordPairs[1] = new WordPair("bar", "baari");
		wordPairs[2] = new WordPair("bus", "bussi");
		wordPairs[3] = new WordPair("car", "auto");
		wordPairs[4] = new WordPair("cat", "kissa");
		wordPairs[5] = new WordPair("dog", "koira");

		boolean found = false;

		for (int i = 0; i < wordPairs.length; i++) {
			if (englishWord.equalsIgnoreCase(wordPairs[i].getEnglishWord())) {
				System.out.println(wordPairs[i].getFinnishWord());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Unknown word");
		}

	}
}
