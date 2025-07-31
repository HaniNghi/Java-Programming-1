package ClassesAndObjects2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsCityNames {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> cityNames = new ArrayList<>();

		while (true) {
			System.out.print("Enter city name: ");
			String inputCityName = input.nextLine();
			if (inputCityName.equalsIgnoreCase("quit")) {
				break;
			}
			cityNames.add(inputCityName.toUpperCase());
		}
		
		System.out.println();

		Collections.sort(cityNames);

		for (String city : cityNames) {
			System.out.println(city);
		}
	}

}
