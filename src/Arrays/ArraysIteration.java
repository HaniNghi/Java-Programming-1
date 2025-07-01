package Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class ArraysIteration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] integerArray = new int[5];

		for (int i = 0; i < integerArray.length; i++) {
			System.out.print("Enter an integer: ");
			integerArray[i] = input.nextInt();
		}
		Arrays.sort(integerArray);
		reverse(integerArray);
		
		for (int i = 0; i < integerArray.length; i++) {
			System.out.print(integerArray[i] + " ");
		}
	}

	private static void reverse(int[] array) {
		int start = 0, end = array.length - 1;
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}
