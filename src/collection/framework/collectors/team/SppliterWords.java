package collection.framework.collectors.team;

import java.util.Scanner;

public class SppliterWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Define the regular expression for tokens
        String regex = "[A-Za-z!_,.'@?]+";

        // Split the string into tokens
        String[] tokens = input.split(" ");

        // Count and print the number of tokens
        System.out.println(tokens.length);

        // Print each token on a new line (filtered by the regex)
        for (String token : tokens) {
            if (token.matches(regex)) {
                System.out.println(token);
            }
        }

        scanner.close();

	}

}
