package Arrays;

import java.util.Scanner;

public class ArraysCandidates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int numberOfCandidate = readInteger(input);

		String[] names = new String[numberOfCandidate];
		int[] votes = new int[numberOfCandidate];

		int loop = 0;
		while (loop < numberOfCandidate) {

			System.out.print("Enter name: ");
			names[loop] = input.nextLine();

			System.out.print("Enter " + names[loop] + "'s votes: ");
			votes[loop] = readInteger(input);
			loop++;
		}

		int winnerIndex = 0;
		for (int i = 1; i < numberOfCandidate; i++) {
			if (votes[i] > votes[winnerIndex]) {
				winnerIndex = i;
			}
		}

		int tieCount = 0;
		for (int i = 0; i < numberOfCandidate; i++) {
			if (votes[i] == votes[winnerIndex]) {
				tieCount++;
			}
		}

		if (tieCount > 1) {
			System.out.println("It is a tie!");
			for (int i = 0; i < numberOfCandidate; i++) {
				if (votes[i] == votes[winnerIndex]) {
					System.out.println(names[i] + " (" + votes[i] + " votes)");
				}
			}
		} else {

			System.out.println(names[winnerIndex] + " is the winner with " + votes[winnerIndex] + " votes!");
		}
	}

	private static int readInteger(Scanner input) {
		return Integer.parseInt(input.nextLine().replace(',', '.'));
	}
}
