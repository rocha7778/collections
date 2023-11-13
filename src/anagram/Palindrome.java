package anagram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindrome("Anita lava la tina");

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
