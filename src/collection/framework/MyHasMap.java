package collection.framework;

import java.util.HashMap;
import java.util.Map;

public class MyHasMap {
	
	private Map<String, Integer> map = new HashMap<>();
	
	
	public void put(String key, Integer value) {
		map.put(key, value);
	}
	
	public Integer get(String key) {
		return map.get(key);
	}
}
