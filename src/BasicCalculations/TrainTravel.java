package BasicCalculations;

import java.util.Scanner;
import java.text.DecimalFormat;


public class TrainTravel {
	public static void main(String[] args) {
		DecimalFormat TwoDecimals = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of train trips: ");
		double trainTrips = readDouble(input);
		
		System.out.print("Enter the single ticket price: ");
		double singlePrice = readDouble(input);
		
		System.out.print("Enter the monthly season ticket price: ");
		double monthlyPrice = readDouble(input);
		
		System.out.println();
		
		double costForSingleTicket = trainTrips * singlePrice;
		
		
		if (monthlyPrice < costForSingleTicket) {
			System.out.println("Buying a monthly season ticket is " + TwoDecimals.format(costForSingleTicket - monthlyPrice) + " euros cheaper.");
		} else if (monthlyPrice == costForSingleTicket) {
			System.out.println("The total cost is the same.");
		} else {
			System.out.println("Buying single tickets is " + TwoDecimals.format(monthlyPrice - costForSingleTicket) + " euros cheaper.");
		}
		

	}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
