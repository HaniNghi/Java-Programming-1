package Objects;

public class ObjectsWordPairsProgram {
	public static void main(String[] args) {
		WordPair firstWord = new WordPair("school", "koulu");
		WordPair secondWord = new WordPair("student", "opiskelija");
		WordPair thirdWord = new WordPair("textbook", "oppikirja");

	System.out.println(firstWord.getEnglishWord() + " = " + firstWord.getFinnishWord());
	System.out.println(secondWord.getEnglishWord() + " = " + secondWord.getFinnishWord());
	System.out.println(thirdWord.getEnglishWord() + " = " + thirdWord.getFinnishWord());

	}
}
