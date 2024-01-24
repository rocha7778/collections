package json.array;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestJsonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONArray persons = new JSONArray();
		
		
		JSONObject person1 = new JSONObject();
		person1.put("name", "rocha");
		person1.put("age", 38);
		
		
		JSONObject person2 = new JSONObject();
		person2.put("name", "carlos");
		person2.put("age", 39);
		
		
		JSONObject person3 = new JSONObject();
		person3.put("name", "paola");
		person3.put("age", 40);
		
		persons.put(person1);
		persons.put(person2);
		persons.put(person3);
		
		
		persons.toList()
		.stream()
		.map(obj -> new  JSONObject(obj))
		.map(p -> new Person(p.getString("name"),  p.getInt("age"))).toList();
		
	}

}
