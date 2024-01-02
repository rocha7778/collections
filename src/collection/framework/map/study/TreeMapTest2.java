package collection.framework.map.study;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

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

		Set<Entry<Integer, String>> mapEntry = processMap(map).entrySet();

		printMap(mapEntry);

		System.out.println("XXXXX_XXXXX");
		System.out.println("XXXXX_XXXXX");
		System.out.println("XXXXX_XXXXX");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		map2.put(1, "Casillas");
		map2.put(15, "Ramos");
		map2.put(3, "Pique");
		map2.put(5, "Puyol");
		map2.put(11, "Capdevila");
		map2.put(14, "Xabi Alonso");
		map2.put(16, "Busquets");
		map2.put(8, "Xavi Hernandez");
		map2.put(18, "Pedrito");
		map2.put(6, "Iniesta");
		map2.put(7, "Villa");

		mapEntry = processMap2(map2).entrySet();
		printMap(mapEntry);

	}

	public static Map<Integer, String> processMap2(Map<Integer, String> map) {
		Map<Integer, String> copy = new LinkedHashMap(map);
		return copy;
	}

	public static Map<Integer, String> processMap(Map<Integer, String> map) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.putAll(map);
		return linkedHashMap;
	}

	public static void printMap(Set<Entry<Integer, String>> mapEntry) {

		for (Entry<Integer, String> entry : mapEntry) {
			System.out.println("Key : " + entry.getKey() + "  value: " + entry.getValue());
		}
	}

}
