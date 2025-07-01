package ProgramLogic;

import java.util.Scanner;

public class StringBling {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String inputString = input.nextLine();

        if (inputString.equalsIgnoreCase("STOP")) {
            System.out.println("Nothing to be printed");
            return;
        }

        String longestString = inputString;
        int maxLength = inputString.length();

        while (true) {
            System.out.print("Enter next string: ");
            inputString = input.nextLine();

            if (inputString.equalsIgnoreCase("STOP")) {
                break;
            }

            if (inputString.length() > maxLength) {
                maxLength = inputString.length();
                longestString = inputString;
            }
        }

        System.out.println("'" + longestString + "'");
    }
}

