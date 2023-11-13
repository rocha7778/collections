package anagram;

import java.util.Arrays;

public class AnagramDetector {
	public static boolean isAnagram(String word1, String word2) {
		// Eliminar espacios en blanco y convertir a minúsculas
		word1 = word1.replaceAll("\\s", "").toLowerCase();
		word2 = word2.replaceAll("\\s", "").toLowerCase();

		// Verificar si las palabras tienen la misma longitud
		if (word1.length() != word2.length()) {
			return false;
		}

		// Crear array de frecuencias
		int[] frequencies = new int[26]; // Suponiendo que solo se manejan letras del alfabeto inglés

		// Incrementar contador de frecuencias para la primera palabra
		for (int i = 0; i < word1.length(); i++) {
			char c = word1.charAt(i);
			
			System.out.println("char c = word1.charAt(i); -- "+ c);
			System.out.println("c - a; -- "+ (c-'a'));
			

			frequencies[c - 'a']++;
		}
		
		for (int i=0; i < frequencies.length; i ++) {
			System.out.println("Valores frecuencias" +frequencies[i]);
			
		}
		

		// Decrementar contador de frecuencias para la segunda palabra
		for (int i = 0; i < word2.length(); i++) {
			char c = word2.charAt(i);
			frequencies[c - 'a']--;
		}

		
		
		// Verificar si todos los contadores son iguales a cero
		return Arrays.stream(frequencies).allMatch(frequency -> frequency == 0);
	}
	
	
	public static boolean isAnagram(String word1, String word2, String word3) {
		System.out.println("Hola");
		return false;
		
	}

	public static void main(String[] args) {
		String word1 = "amor";
		String word2 = "roma";

		if (isAnagram(word1, word2)) {
			System.out.println("Las palabras son anagramas.");
		} else {
			System.out.println("Las palabras no son anagramas.");
		}
	}
}
