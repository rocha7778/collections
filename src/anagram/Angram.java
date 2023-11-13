package anagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Angram {

	public static void main(String arg[]) {

		Function<String, List<String>> function = w -> {

			return w.lines().map(word -> word.split("")).flatMap(Arrays::stream).sorted().collect(Collectors.toList());

		};

		String word1 = "listen";
		String word2 = "silent";

		if (isAnagram(word1, word2, function)) {

			System.out.println("Is Anagram word1 " + word1.toString() + " word2: " + word2);

		} else {
			System.out.println("Is not anagram");
		}

	}

	public static boolean isAnagram(String word1, String word2, Function<String, List<String>> function) {

		var list1 = function.apply(word1);
		var list2 = function.apply(word2);

		Collections.sort(list1);
		Collections.sort(list2);

		return list1.equals(list2);

	}

}
