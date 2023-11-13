package collection.framework;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListVsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer size = 10_000_000;

		List<String> list = new ArrayList();
		Set<String> set = new TreeSet();

		long start = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			list.add(RandomStringGenerator.generateRandomString());
		}

		long end = System.currentTimeMillis();

		NumberFormat number = NumberFormat.getInstance();

		System.out.println(
				"Time to insert " + number.format(size) + " element in ArrayList " + number.format(end - start));
		

		start = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			if(i == 9999999) {
				set.add("Rocha1");
			}else {
				set.add(RandomStringGenerator.generateRandomString());
			}
		}

		end = System.currentTimeMillis();


		System.out.println(
				"Time to insert " + number.format(size) + " element in Set " + number.format(end - start));
		
		
		System.out.println("Retrieving values from AraryList (9999999)");
		
		start = System.currentTimeMillis();

		String valueFound = list.get(9999999);

		end = System.currentTimeMillis();
		
		System.out.println("Found value: " + valueFound);


		System.out.println(
				"Time to get " + number.format(size) + " element in ArrayList " + number.format(end - start));
		
		
		System.out.println("Retrieving values from HashSet (9999999)");
		
		start = System.currentTimeMillis();
		
		Iterator<String> iterator = set.iterator();
		String stringtoFind = "Rocha1";
		
		while(iterator.hasNext()) {
			String currentValue = iterator.next();
			if(currentValue.toLowerCase().equalsIgnoreCase(stringtoFind.toLowerCase())) {
				System.out.println("Found value: " + currentValue);
				
				break;
				
			}
			
		}
		
		end = System.currentTimeMillis();
		
		
		System.out.println(
				"Time to get " + number.format(size) + " element in HashSet " + number.format(end - start));

	}
	
	

}
