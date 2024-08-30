package abstrac.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeaterKevin {

	private static final Map<String, Integer> MAPA_COINCIDENCIAS;

	static {
		MAPA_COINCIDENCIAS = new HashMap<>();
		MAPA_COINCIDENCIAS.put("un", 1);
		MAPA_COINCIDENCIAS.put("uno", 1);
		MAPA_COINCIDENCIAS.put("1", 1);
		MAPA_COINCIDENCIAS.put("individual", 1);

		MAPA_COINCIDENCIAS.put("dos", 2);
		MAPA_COINCIDENCIAS.put("2", 2);

		MAPA_COINCIDENCIAS.put("tres", 3);
		MAPA_COINCIDENCIAS.put("3", 3);

		MAPA_COINCIDENCIAS.put("cuatro", 4);
		MAPA_COINCIDENCIAS.put("4", 4);

		MAPA_COINCIDENCIAS.put("cinco", 5);
		MAPA_COINCIDENCIAS.put("5", 5);

		MAPA_COINCIDENCIAS.put("seis", 6);
		MAPA_COINCIDENCIAS.put("6", 6);

		MAPA_COINCIDENCIAS.put("siete", 7);
		MAPA_COINCIDENCIAS.put("7", 7);

		MAPA_COINCIDENCIAS.put("ocho", 8);
		MAPA_COINCIDENCIAS.put("8", 8);

		MAPA_COINCIDENCIAS.put("nueve", 9);
		MAPA_COINCIDENCIAS.put("9", 9);

		MAPA_COINCIDENCIAS.put("diez", 10);
		MAPA_COINCIDENCIAS.put("10", 10);
	}

	public static int extraerNumeroPuestos(String titulo) {
		// Expresión regular para detectar números de puestos seguidos por palabras
		// clave específicas
		String patron = "(?i)\\b(\\d+|uno?|dos|tres|cuatro|cinco|seis|siete|ocho|nueve|diez|once|individual)\\b(?:\\s+(cuerpos?|puestos?|cps?))?\\b";

		Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(titulo);

		if (matcher.find()) {
			String grupo = matcher.group(1).toLowerCase();

			// Si el grupo no es un número, lo encontramos en MAPA_COINCIDENCIAS
			return MAPA_COINCIDENCIAS.getOrDefault(grupo, 0);

		}

		// Retorna 0 si no se encontró ningún patrón
		return 0;
	}

	public static void main(String[] args) {
		String[] ejemplos = { "Sillón Sofa Tres (3) Cuerpos"

		};

		for (String titulo : ejemplos) {
			System.out.println("Titulo: " + titulo + " -> Número de puestos: " + extraerNumeroPuestos(titulo));
		}
	}
}