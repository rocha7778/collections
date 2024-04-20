package anagram;

import java.util.stream.Collectors;

public class PalindromeFunctional {

	public static void main(String[] args) {
		isPalindrome("Anita lava la tina");
	}

	public static void isPalindrome(String word) {
		

		String cleanedWord = 
				word
				.chars()
				.filter(n -> filterSpcialCharacters(n))
				.mapToObj(n -> (char) n)
				.map(Object::toString)
				.collect(Collectors.joining());
		
		
		String reversedWord = new StringBuilder(cleanedWord).reverse().toString();
		
		if(cleanedWord.equalsIgnoreCase(reversedWord)) {
			System.out.println("Palindrome");
		}
	}
	
	public static boolean filterSpcialCharacters(int n) {
		return !Character.isDigit(n) && !Character.isWhitespace(n);
	}



}
