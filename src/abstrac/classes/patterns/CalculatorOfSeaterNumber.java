package abstrac.classes.patterns;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorOfSeaterNumber {
	
	// Define your patterns in an array
		public static final String[] PATRONES = PatternsBySite.PATRONES_MLM;
		
		// Assuming you have a MAPA_COINCIDENCIAS map defined somewhere
		public static final Map<String, Integer> MAPA_COINCIDENCIAS = PatternsBySite.MAPA_COINCIDENCIAS_MLM;

		public static int extraerNumeroPuestos(String titulo) {
		    return Arrays.stream(PATRONES)
		            .map(patron -> Pattern.compile(patron, Pattern.CASE_INSENSITIVE).matcher(titulo))
		            .filter(Matcher::find)
		            .map(matcher -> matcher.group(1))
		            .filter(Objects::nonNull)
		            .map(group -> group.toLowerCase())
		            .map(group -> {
		                try {
		                    return Integer.parseInt(group);
		                } catch (NumberFormatException e) {
		                	return MAPA_COINCIDENCIAS.getOrDefault(group, 0);
		                }
		            })
		            .filter(resultado -> resultado > 0)
		            .findFirst()
		            .orElse(0);
		}

}
