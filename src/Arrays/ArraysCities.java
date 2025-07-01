package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of city names: ");
		int numberOfCity = readInteger(input);

		String[] cities = new String[numberOfCity];

		int loop = 0;
		while (loop < numberOfCity) {
			System.out.print("Enter city name: ");
			cities[loop] = input.nextLine();
			loop++;
		}

		Arrays.sort(cities);

		String output = cities[0] + " ";

		for (int i = 1; i < numberOfCity; i++) {
			if (!cities[i].equalsIgnoreCase(cities[i - 1])) {
				output += cities[i] + " ";
			}
		}

		System.out.println(output);
	}

	private static int readInteger(Scanner input) {
		return Integer.parseInt(input.nextLine().replace(',', '.'));
	}
}
