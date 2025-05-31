package BasicCalculations;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BeachVolleyball {
	public static void main(String[] args) {
		DecimalFormat TwoDemicalsFormat = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of people: ");
		int amountOfPeople = readInteger(input);
		
		System.out.print("Enter the hourly rate: ");
		double hourlyRate = readDouble(input);
		
		System.out.print("Enter the length of the rental (hours): ");
		int totalRentalHours = readInteger(input);
		
		double pricePerPerson = totalRentalHours * hourlyRate / amountOfPeople; 
		
		String result = "\nEach of the " + amountOfPeople + " people should pay " + TwoDemicalsFormat.format(pricePerPerson) + " euros.";
		System.out.println(result); 
	}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
	
	private static int readInteger(Scanner input) {
		return Integer.parseInt(input.nextLine());
	}
}
