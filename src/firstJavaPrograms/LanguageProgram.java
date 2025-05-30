package firstJavaPrograms;

public class LanguageProgram {
	public static void main(String[] args) {
		String text = "Python is named after the \"Monty Python's Flying Circus\", a BBC comedy series from 1970s.";
		String[] textParts = text.split(", ");
		
		System.out.println(textParts[0] + ", ");
		System.out.println(textParts[1]); 
	}
}
