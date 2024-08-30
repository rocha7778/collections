package abstrac.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import abstrac.classes.patterns.CalculatorOfSeaterNumber;

public class ReadFileInCuerpos {

	private static final Map<String, Integer> MAPA_COINCIDENCIAS;

	static {
		MAPA_COINCIDENCIAS = new HashMap<>();
		MAPA_COINCIDENCIAS.put("un", 1);
		MAPA_COINCIDENCIAS.put("uno", 1);
		MAPA_COINCIDENCIAS.put("1", 1);
		MAPA_COINCIDENCIAS.put("individual", 1);
		MAPA_COINCIDENCIAS.put("individuales", 1);

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

	public static void main(String[] args) {
		String fileName = "sillon.cuerpos.csv";
		int count = 0;
		int countZero = 0;
		int countGt1 = 0;
		int count1 = 0;
		String zeroCuerpos = "";

		String line = "Sofá De Dos Plazas Niños Sofá Niños Brazo De Mader";
		int numeroPuestos = extraerNumeroPuestos(line);
		String hola = ("Titulo: " + line+ " -> Número de puestos: " + numeroPuestos);
		System.out.println(hola);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Total registros analizados " + count);
		System.out.println("Total registros con puesto zer0 " + countZero);
		System.out.println("Total registros con un puesto " + count1);
		System.out.println("Total registros con puesto mayor a 1 " + countGt1);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Total registros con 0 puesto  " + zeroCuerpos);
	}

	public static int extraerNumeroPuestos(String titulo) {
		String patron = "(?i)\\b(individual(es)?)\\b";


		Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(titulo);

		if (matcher.find()) {
			String grupo = matcher.group(1).toLowerCase();
			try {
				return Integer.parseInt(grupo);
			} catch (NumberFormatException e) {
				return MAPA_COINCIDENCIAS.getOrDefault(grupo, 0);
			}
		}

		return 0;
	}

}
