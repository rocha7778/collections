package abstrac.classes.patterns;

import java.util.HashMap;
import java.util.Map;

public class PatternsBySite {
	
	public static final String[] PATRONES = {
			// Pattern to match digit or spelled-out numbers followed by keywords
			"(?i)\\b(?:\\(?\\s*)?(\\d+|uno?|dos|tres?|cuatro|cinco|seis|siete|ocho|nueve|diez|once)(?:\\s*\\)?)(\\s+)?(cuerpos?|cps?)\\b",

			// Border cases
			"\\b(?:[a-z]*)(\\d+)(\\s*)?(cuerpos?|cps?)\\b",
			"\\b(un|uno|una?)(\\s+)?(cuerpos?|cps?)\\b",
			"(?i)(\\d+)(\\s*|\\b)(cuerpos?|cps?)[a-zA-Z]*\\b", 
			"(?i)\\b(\\d+)(\\s*|\\.|,|\\s+)(cuerpos?|cps?)\\b",
			"(?i)(\\d+)(\\s*|\\.|,|\\s+)(c|cuerpo?s?|cps?)\\b", 
			"(?i)\\b(\\d+)\\b[^\\d]*\\b(cuerpos?|cps?)\\b",

	};
	
	public static final String[] PATRONES_MLB = {
			// Pattern to match digit or spelled-out numbers followed by keywords
			"(?i)\\b(?:\\(?\\s*)?(\\d+|um|dois|três|quatro|cinco|seis|sete|oito|nove|dez|onze)(?:\\s*\\)?)(\\s+)?(lugares?|lugar)\\b",
			"(?i)\\b(\\d{2})(\\s*|\\B)(lugares?|lugar)\\b",
// border cases
			"(?i)\\b(?:[a-zA-Z]+)?(\\d+)(\\s*|\\B)(lugares?|lugar)\\b",
			"(?i)\\b(\\d+)(\\s*)(lugares?|lugar)[a-zA-Z]*\\b",
			"(?i)(\\d+)(\\s*)(lugares?|lugar)(?=\\D|$)"

	};
	
	

	
	// Assuming you have a MAPA_COINCIDENCIAS_MLB map defined somewhere
		public static final Map<String, Integer> MAPA_COINCIDENCIAS_MLB = new HashMap<>();

		static {
			MAPA_COINCIDENCIAS_MLB.put("1", 1);
			MAPA_COINCIDENCIAS_MLB.put("dois", 2);
			MAPA_COINCIDENCIAS_MLB.put("três", 3);
			MAPA_COINCIDENCIAS_MLB.put("quatro", 4);
			MAPA_COINCIDENCIAS_MLB.put("cinco", 5);
			MAPA_COINCIDENCIAS_MLB.put("seis", 6);
			MAPA_COINCIDENCIAS_MLB.put("sete", 7);
			MAPA_COINCIDENCIAS_MLB.put("oito", 8);
			MAPA_COINCIDENCIAS_MLB.put("nove", 9);
			MAPA_COINCIDENCIAS_MLB.put("dez", 10);
			MAPA_COINCIDENCIAS_MLB.put("onze", 11);
		}
		
		
		
		// Assuming you have a MAPA_COINCIDENCIAS_MLB map defined somewhere
				public static final Map<String, Integer> MAPA_COINCIDENCIAS_MLM = new HashMap<>();

				static {
					MAPA_COINCIDENCIAS_MLM.put("1", 1);
					MAPA_COINCIDENCIAS_MLM.put("una", 1);
					MAPA_COINCIDENCIAS_MLM.put("individual", 1);
					MAPA_COINCIDENCIAS_MLM.put("individuales", 1);
					MAPA_COINCIDENCIAS_MLM.put("dos", 2);
					MAPA_COINCIDENCIAS_MLM.put("tres", 3);
					MAPA_COINCIDENCIAS_MLM.put("cuatro", 4);
					MAPA_COINCIDENCIAS_MLM.put("cinco", 5);
					MAPA_COINCIDENCIAS_MLM.put("seis", 6);
					MAPA_COINCIDENCIAS_MLM.put("siete", 7);
					MAPA_COINCIDENCIAS_MLM.put("ocho", 8);
					MAPA_COINCIDENCIAS_MLM.put("nueve", 9);
					MAPA_COINCIDENCIAS_MLM.put("diez", 10);
					MAPA_COINCIDENCIAS_MLM.put("once", 11);
					MAPA_COINCIDENCIAS_MLM.put("biplaza", 2);
					MAPA_COINCIDENCIAS_MLM.put("Biplaza", 2);
				}
				
				
				public static final String[] PATRONES_MLM = {
						"(?i)\\b(\\d+|biplaza)[a-zA-Z]*\\b",
						 "(?i)\\b(individual(es)?)\\b",
						 "(?i)\\b(\\d+|uno|una|dos|tres|cuatro|cinco|seis|siete|ocho|nueve|diez|once)\\s+(personas?|lugares?|plazas?)\\b"
, 
					};



}
