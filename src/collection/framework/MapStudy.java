package collection.framework;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(1, "Casillas");
		map.put(15, "Ramos");
		map.put(3, "Pique");
		map.put(5, "Puyol");
		map.put(11, "Capdevila");
		map.put(14, "Xabi Alonso");
		map.put(16, "Busquets");
		map.put(8, "Xavi Hernandez");
		map.put(18, "Pedrito");
		map.put(6, "Iniesta");
		map.put(7, "Villa");
		map.put(null, null);
		

		System.out.println("Sixe of map: " + map.size());
		System.out.println("Content of HashMap: " + map);
		System.out.println("HashCode of HashMap: " + map.hashCode());
		
		Set<Entry<Integer, String>> mapEntry = map.entrySet();
		
		for (Entry<Integer, String> entry : mapEntry) {
			System.out.println("Key : " + entry.getKey() + "  value: " + entry.getValue());
		}
		
		map.computeIfAbsent(100, k -> "computed key");
		
		for (Entry<Integer, String> entry : mapEntry) {
			System.out.println("Key : " + entry.getKey() + "  value: " + entry.getValue());
		}
		

	}

}
