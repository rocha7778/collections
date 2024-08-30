package abstrac.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFileInCPS {

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
		
		MAPA_COINCIDENCIAS.put("once", 11);
		MAPA_COINCIDENCIAS.put("11", 11);
		
		MAPA_COINCIDENCIAS.put("Biplaza", 2);
		MAPA_COINCIDENCIAS.put("biplaza", 2);
	}

	public static void main(String[] args) {
		String fileName = "sillon.cps.csv";
		int count = 0;
		int countZero = 0;
		int countGt1 = 0;
		int count1 = 0;
		String zeroCuerpos = "";

		/*try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				int numeroPuestos = extraerNumeroPuestos(line);
				String hola = ("Titulo: " + line + " -> Número de puestos: " + numeroPuestos);
				if (numeroPuestos != 0) {
					System.out.println(hola);
				}
				count++;

				if (numeroPuestos == 0) {
					countZero++;
					zeroCuerpos = zeroCuerpos + " " + hola + "\n";
				}

				if (numeroPuestos == 1) {
					count1++;
				}

				if (numeroPuestos > 1) {
					countGt1++;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
*/
		
		String line = "Engage Performance - Sofá Biplaza De Terciopelo, Color Gris";
		int numeroPuestos = extraerNumeroPuestos(line);
		String hola = ("Titulo: " + line+ " -> Número de puestos: " + numeroPuestos);
		System.out.println(hola);
		
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
		String patron = "(?i)\\b(\\d+)(?:\\s*)(biplazas?|biplaza|Biplaza)\\b";

		Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(titulo);

		if (matcher.find()) {
			String grupo = matcher.group(1).toLowerCase();
			// Intentamos convertir el número encontrado a un entero
			try {
				return Integer.parseInt(grupo);
			} catch (NumberFormatException e) {
				// Si el grupo no es un número, lo encontramos en MAPA_COINCIDENCIAS
				return MAPA_COINCIDENCIAS.getOrDefault(grupo, 0);
			}
		}

		// Retorna 0 si no se encontró ningún patrón
		return 0;
	}

}
