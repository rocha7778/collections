package anagram;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindrome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindrome("Anita lava la tina");
		
		List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(2, 5, 5);

        List<Integer> mergedAndSorted = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Merged and sorted list: " + mergedAndSorted);

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
