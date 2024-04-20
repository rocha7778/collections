package anagram;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PalindromeFunctional2 {

	public static void main(String[] args) {
		isPalindrome("-La ruta nos aporto otro paso natural.-");

		System.out.println("5 is a digit " + Character.isDigit('5'));
		System.out.println("is a with space " + Character.isWhitespace(' '));

		char char1 = 'A';
		char char2 = '5';
		char char3 = 'b';

		// Check if char1 is alphabetic
		boolean isAlphabetic1 = Character.isAlphabetic(char1);
		System.out.println(char1 + " is alphabetic: " + isAlphabetic1);

		// Check if char2 is alphabetic
		boolean isAlphabetic2 = Character.isAlphabetic(char2);
		System.out.println(char2 + " is alphabetic: " + isAlphabetic2);

		// Check if char3 is alphabetic
		boolean isAlphabetic3 = Character.isAlphabetic(char3);
		System.out.println(char3 + " is alphabetic: " + isAlphabetic3);

	}

	public static void isPalindrome(String word) {

		String cleanedWord = word.chars()
				.peek(c -> System.out.println("printing each character " +c))
				.filter(c -> !Character.isDigit(c) 
						&& !Character.isWhitespace(c) 
						&& !Character.isAlphabetic(c)
						&& !isDot(c) && !isHyphen(c))
				.mapToObj(c -> (char) c).map(Object::toString).collect(Collectors.joining());

		StringBuilder sb = new StringBuilder(cleanedWord);
		String reversedWord = sb.reverse().toString();

		if (cleanedWord.equalsIgnoreCase(reversedWord)) {
			System.out.print("Palindrome");
		}

	}

	public static boolean isDot(int value) {
		return Character.valueOf((char) value).equals(".");
	}

	public static boolean isHyphen(int value) {
		return Character.valueOf((char) value).equals("-");
	}

}
