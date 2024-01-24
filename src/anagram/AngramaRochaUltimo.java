package anagram;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AngramaRochaUltimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, List<String>> function = aWord -> {
			
			return aWord
			.lines()
			.map(word -> word.split(""))
			.flatMap(Arrays::stream)
			.sorted()
			.toList();
		};
		
		String word1 = "amor";
		String word2 = "roma";
		
		char [] arrayWord1 = word1.toCharArray();
		char [] arrayWord2 = word2.toCharArray();
		
		Arrays.sort(arrayWord1);
		Arrays.sort(arrayWord2);
		
		if(Arrays.equals(arrayWord1, arrayWord2)) {
			System.out.println("Is Anagram");
		}
		

	}

}
