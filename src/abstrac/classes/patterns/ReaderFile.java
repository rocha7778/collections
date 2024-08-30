package abstrac.classes.patterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class ReaderFile {
	
	public static int count = 0;
	public static int countZero = 0;
	public static int countGt1 = 0;
	public static int count1 = 0;
	public static String zeroCuerpos = "";

	public static void readFile(String fileName, Function<String, Integer> intToString) {
		

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				int numeroPuestos = intToString.apply(line);
				
				String hola = ("Titulo: " + line + " -> Número de puestos: " + numeroPuestos);
				if (numeroPuestos != 0) {
					// System.out.println(hola);
				}
				count++;

				if (numeroPuestos == 0) {
					countZero++;
					//zeroCuerpos = zeroCuerpos + " " + hola + "\n";
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

	}

}
