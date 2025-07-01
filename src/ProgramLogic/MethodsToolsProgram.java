package ProgramLogic;
import java.util.Scanner;

class MethodsTools {
	public static int minimum(int a, int b, int c) {
		int smallest = a;
		if (a <= b && a <= c) {
			smallest = a;
		} else if (b <= a && b <= c) {
			smallest = b;
		} else if (c <= a && c <= b) {
			smallest = c;
		}
		return smallest;
	}
}

public class MethodsToolsProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int firstInt = readInteger(input);

		System.out.print("Enter second integer: ");
		int secondInt = readInteger(input);

		System.out.print("Enter third integer: ");
		int thirdInt = readInteger(input);

		int minimum = MethodsTools.minimum(firstInt, secondInt, thirdInt);

		System.out.println();
		System.out.println("The minimum value is " + minimum);
	}

	private static int readInteger(Scanner input) {
		return Integer.parseInt(input.nextLine());
	}
}
