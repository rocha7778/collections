package anagram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindrome("Anita lava la tina");

	}

	public static void isPalindrome(String word) {
		
		String cleanWord = word.replaceAll("\\W", "").toLowerCase();

		cleanWord = cleanWord.replace("\\s+", "").toLowerCase();

		StringBuilder sb = new StringBuilder(cleanWord);
		String reversedWord = sb.reverse().toString();
		
		if(cleanWord.equalsIgnoreCase(reversedWord)) {
			System.out.println("paolindrome");
		}

	}

}
