package ProgramLogic;

public class MethodsWarmup {
	public static void main(String[] args) {
		String output = "";
		
		for (int i = 1; i <= 100; i += 3) {
			output += i + " ";
		}
		printNumbers(output);
		
		output = "";
		
		for (int i = 100; i >= 1; i -= 3) {
			output += i + " ";
		}
		printNumbers(output);
	}
	
	private static void printNumbers(String number) {
		System.out.println(number);
	}
}
