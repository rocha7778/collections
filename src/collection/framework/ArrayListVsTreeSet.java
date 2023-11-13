package collection.framework;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListVsTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer size = 10_000_000;

		List<String> list = new ArrayList();
		Set<String> set = new TreeSet();

		long start = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			list.add("a");
		}

		long end = System.currentTimeMillis();

		NumberFormat number = NumberFormat.getInstance();

		System.out.println(
				"Time to insert " + number.format(size) + " element in ArrayList " + number.format(end - start));
		

		start = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
				set.add("a");
		}

		end = System.currentTimeMillis();


		System.out.println(
				"Time to insert " + number.format(size) + " element in Set " + number.format(end - start));
		
		
		System.out.println("Retrieving values from AraryList (9999999)");
		
		System.out.println("Size list with duplicate " + list.size());
		
		start = System.currentTimeMillis();

		List<String> newList = list.stream().distinct().toList();
		System.out.println("Size list without duplicate " + newList.size());
		String valueFound = list.get(0);

		end = System.currentTimeMillis();
		
		System.out.println("Found value: " + valueFound);


		System.out.println(
				"Time to get " + number.format(size) + " element in ArrayList " + number.format(end - start));
		
		
		System.out.println("Retrieving values from HashSet (9999999)");
		
		start = System.currentTimeMillis();
		
		Iterator<String> iterator = set.iterator();
		String stringtoFind = "a";
		
		while(iterator.hasNext()) {
			String currentValue = iterator.next();
			if(currentValue.toLowerCase().equalsIgnoreCase(stringtoFind.toLowerCase())) {
				System.out.println("Found value: " + currentValue);
				
				break;
				
			}
			
		}
		
		end = System.currentTimeMillis();
		
		
		System.out.println(
				"Time to get " + number.format(size) + " element in TreeSet " + number.format(end - start));

	}
	
	

}
