package collection.framework;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import domain.chap2.Employee;

public class HashMapImplementations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties kafkaProps = new Properties();
		
		Employee e = new Employee(1L, "Rocha");

		kafkaProps.put("key1",e);
		kafkaProps.setProperty("key2", "Property 2");

		Set<Entry<Object, Object>> i = kafkaProps.entrySet();

		Iterator<Entry<Object, Object>> iterator = i.iterator();

		while (iterator.hasNext()) {
			Entry<Object, Object> algo = iterator.next();
			System.out.println("key: " + algo.getKey() + " value: " + algo.getValue());
		}

	}

}
