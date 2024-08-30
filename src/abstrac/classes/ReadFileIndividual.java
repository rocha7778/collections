package abstrac.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFileIndividual {


	public static void main(String[] args) {
		String fileName = "sillon.individual.csv";
		int count = 0;
		int countZero = 0;
		int countGt1 = 0;
		int count1 = 0;
		String zeroCuerpos = "";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				int numeroPuestos = extraerNumeroPuestos(line);
				String hola = ("Titulo: " + line + " -> Número de puestos: " + numeroPuestos);
				System.out.println(hola);

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
		String FIND_IGNORE_CASE_INDIVIDUAL_ES = "(?i)individual(?:es)?";
		Pattern pattern = Pattern.compile(FIND_IGNORE_CASE_INDIVIDUAL_ES, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(titulo);
		if (matcher.find()) {
			return 1;
		}
		return 0;
	}

}
