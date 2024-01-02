package anagram;

import java.util.Arrays;

public class AnagramDos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = "amor!";
		String word2 = "!roma";
		
		
		 word1 = word1.replaceAll("[^a-zA-Z]", "");
		 word2 = word2.replaceAll("[^a-zA-Z]", "");

		char[] arrayWord1 = word1.toCharArray();
		char[] arrayWord2 = word2.toCharArray();

		Arrays.sort(arrayWord1);
		Arrays.sort(arrayWord2);
		
		

		if (Arrays.equals(arrayWord1, arrayWord2)) {
			System.out.println("Anagram");

		}
	}

}
