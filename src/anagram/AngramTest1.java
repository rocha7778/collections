package anagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AngramTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, List<String>> function = w -> {

			return w.
					lines()
					.map(word -> word.split(""))
					.flatMap(Arrays::stream)
					.sorted()
					.collect(Collectors.toList());

		};

		String hola = "Hola";
		String halo = "halo";
		
		if(isAnagram(normalizeWord(hola), normalizeWord(halo), function)) {
			System.out.println("The words are anagram");
		}else {
			System.out.println("The words are not anagram");
		}

		

		

	}
	
	public static String normalizeWord(String word) {
		return word.toLowerCase().trim();
	}

	public static boolean isAnagram(String word1, String word2, Function<String, List<String>> function) {

		var list1 = function.apply(word1);
		var list2 = function.apply(word2);

		Collections.sort(list1);
		Collections.sort(list2);

		return list1.equals(list2);

	}

	public static boolean isAnamgram(String word1, String word2, Function<String, List<String>> function) {

		var list1 = function.apply(word1);
		var list2 = function.apply(word2);

		Collections.sort(list1);
		Collections.sort(list2);

		return list1.equals(list2);

	}

}
