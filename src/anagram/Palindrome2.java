package anagram;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindrome("Anita lava la tina");

	}

	public static void isPalindrome(String word) {

		String cleanedWord = word.replaceAll("\\W", "").toLowerCase();
		cleanedWord = cleanedWord.replaceAll("\\s+", "").toLowerCase();
		
		String reversedWord = new StringBuilder(cleanedWord).reverse().toString();
		
		if (reversedWord.equals(reversedWord)) {

			System.out.println("Is palindrome");
		}
		
	}

}
