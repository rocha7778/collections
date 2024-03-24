package anagram;

import java.util.stream.Collectors;

public class Palindrome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindrome("Anita lava la tina");

	}
	
	public static void isPalindrome2(String word) {
		
		String cleanedWord = word.chars()
		.filter(c -> !Character.isWhitespace(c))
		.filter(c -> !Character.isAlphabetic(c))
		.mapToObj(n -> (char) n)
		.map(Object::toString)
		.collect(Collectors.joining());
		
		StringBuilder sb = new StringBuilder(cleanedWord);
		
		if(sb.reverse().toString().equalsIgnoreCase(cleanedWord)) {
			System.out.println("Palandrome");
		}
	}

	public static void isPalindrome(String word) {

		String cleanWord = word.replaceAll("\\W", "").toLowerCase();

		cleanWord = cleanWord.replace("\\s+", "").toLowerCase();

		String reversedWord = new StringBuilder(cleanWord).reverse().toString();

		if (cleanWord.equals(reversedWord)) {

			System.out.println("Is palindrome");
		}

	}

}
