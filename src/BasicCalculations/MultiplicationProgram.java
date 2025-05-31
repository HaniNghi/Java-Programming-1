package BasicCalculations; 

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplicationProgram {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		String x = input.nextLine().replace(',', '.');
		BigDecimal xBigDecimal = new BigDecimal(x);
				
		System.out.print("Enter y: ");
		String y = input.nextLine().replace(',', '.');
		BigDecimal yBigDecimal = new BigDecimal(y);
		
		String result = "\n" + x + " * " + y + " = " + xBigDecimal.multiply(yBigDecimal); 
		System.out.println(result);
	}
}