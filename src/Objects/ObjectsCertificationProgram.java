package Objects;

import java.util.Scanner;

public class ObjectsCertificationProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Coach[] coaches = new Coach[4];

		for (int i = 0; i < coaches.length; i++) {
			System.out.print("Enter coach name: ");
			String name = input.nextLine();

			System.out.print("Enter " + name + "'s score: ");
			int score = readInteger(input);
			
			coaches[i] = new Coach(name, score);
		}
		
		System.out.println();
		System.out.print("Enter the minimum passing score: ");
		int minimumScore = readInteger(input);
		System.out.println();
		System.out.println("Passing scores");
		
		double count = 0;
		
		for (int i = 0; i < coaches.length; i++) {
			if (coaches[i].getScore() >= minimumScore) {
				System.out.println(coaches[i].getName() + " (" + coaches[i].getScore() + " points)");
				count++;
			}
		}
		
		System.out.println("The passing rate is " + (count/coaches.length)*100 + " %");
		
	}

	private static int readInteger(Scanner input) {
		return Integer.parseInt(input.nextLine());
	}
}
