package anagram;

import java.util.Arrays;

public class AnagramaRocha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = "Hello";
		String word2 = "hello";

		char[] word1Char = sortWords(word1);
		char[] word2Char = sortWords(word2);

//		if (isAnamgram(word1Char, word2Char)) {
//			System.out.println("Are anagrams");
//
//		}

		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		
		char[] otro = word1.toCharArray();
		char[] otro2 = word2.toCharArray();

		sort(otro);
		sort(otro2);

		System.out.println(otro);
		System.out.println(otro2);
		
		if(charArraysEqual(otro, otro2) ) {
			System.out.println( "anagram from scrach");
		}else {
			System.out.println("no scracht");
		}

		// anagramTest(word1, word2);
	}

	public static void anagramTest(String word1, String word2) {
		StringBuilder sb = new StringBuilder(word1);
		if (sb.reverse().toString().equals(word2)) {
			System.out.println("Are anagrams builder");
		}
	}

	public static boolean isAnamgram(char[] word1Char, char[] word2Char) {
		return Arrays.equals(word1Char, word2Char);
	}

	public static char[] sortWords(String word) {
		char[] word1Char = word.toCharArray();
		Arrays.sort(word1Char);
		return word1Char;

	}

	public static void sort(char[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length -i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	

	static boolean charArraysEqual(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
	
	

}
