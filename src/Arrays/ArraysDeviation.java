package Arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

class ArraysLibrary {
	public static int count(int[] array) {
		return array.length;
	}

	public static int min(int[] array) {
		int minIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[minIndex] > array[i]) {
				minIndex = i;
			}
		}

		return array[minIndex];

	}

	public static int max(int[] array) {
		int maxIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[maxIndex] < array[i]) {
				maxIndex = i;
			}
		}

		return array[maxIndex];

	}

	public static double mean(int[] array) {
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;
	}

	public static double median(int[] array) {
		 int[] newArray = Arrays.copyOf(array, array.length);
		    Arrays.sort(newArray);
		    int n = newArray.length;

		    if (n % 2 == 0) {
		        return (newArray[n / 2 - 1] + newArray[n / 2]) / 2.0;
		    } else {
		        return newArray[n / 2];
		    }
	}

	public static double standardDeviation(int[] array) {
		double meanOfArray = ArraysLibrary.mean(array);
		double standardDeviation = 0;
		double sumOfArray = 0;

		for (int i = 0; i < array.length; i++) {
			sumOfArray += (array[i] - meanOfArray) * (array[i] - meanOfArray);
		}

		standardDeviation = Math.sqrt(sumOfArray / (array.length - 1));

		return standardDeviation;
	}
}

public class ArraysDeviation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		System.out.print("Enter the number of values: ");
		int numberOfValue = readInteger(input);
		if (numberOfValue < 4) {
			System.out.println("Sorry, at least 4 values required");
		} else {
			int[] values = new int[numberOfValue];

			int loop = 0;
			while (loop < numberOfValue) {

				System.out.print("Enter an integer : ");
				values[loop] = readInteger(input);
				loop++;
			}

			int n = ArraysLibrary.count(values);
			int min = ArraysLibrary.min(values);
			int max = ArraysLibrary.max(values);
			double mean = ArraysLibrary.mean(values);
			double median = ArraysLibrary.median(values);
			double standardDeviation = ArraysLibrary.standardDeviation(values);
			String data = "";

			for (int i = 0; i < values.length; i++) {
				data += values[i] + " ";
			}

			System.out.println("n = " + n);
			System.out.println("Min: " + min);
			System.out.println("Max: " + max);
			System.out.println("Mean: " + oneDecimal.format(mean));
			System.out.println("Median: " + oneDecimal.format(median));
			System.out.println("Sample standard deviation: " + oneDecimal.format(standardDeviation));
			System.out.println("Sample data: " + data);

		}
		
	}

	private static int readInteger(Scanner input) {
		return Integer.parseInt(input.nextLine().replace(',', '.'));
	}
}