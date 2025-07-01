package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysLotto {
	public static void main(String[] args) {
		Random randomGenerator = new Random();

		int[] lotto = new int[7];
		int count = 0;

		while (count < 7) {
			int randomNumber = randomGenerator.nextInt(39) + 1;
			boolean duplicate = false;

			for (int i = 0; i < count; i++) {
				if (lotto[i] == randomNumber) {
					duplicate = true;
					break;
				}
			}

			if (duplicate == false) {
				lotto[count] = randomNumber;
				count++;
			}

		}

		Arrays.sort(lotto);

		for (int b = 0; b < 7; b++) {
			System.out.print(lotto[b] + " ");
		}
	}
}
