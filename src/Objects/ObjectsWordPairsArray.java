package Objects;

public class ObjectsWordPairsArray {
	public static void main(String[] args) {
		WordPair[] wordPairs = new WordPair[3];

		wordPairs[0] = new WordPair("school", "koulu");
		wordPairs[1] = new WordPair("student", "opiskelija");
		wordPairs[2] = new WordPair("textbook", "oppikirja");

		for (int i = 0; i < wordPairs.length; i++) {
			System.out.println(wordPairs[i].getEnglishWord() + " = " + wordPairs[i].getFinnishWord());
		}
	}
}
