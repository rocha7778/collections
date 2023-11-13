package collection.framework;

import java.text.NumberFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class ArrayListVsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer size = 10_000_000;

		List<String> list = new ArrayList();
		Queue<String> queue = new ArrayDeque();

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
				queue.add("Rocha1");
			}else {
				queue.add(RandomStringGenerator.generateRandomString());
			}
		}

		end = System.currentTimeMillis();


		System.out.println(
				"Time to insert " + number.format(size) + " element in Queue " + number.format(end - start));
		
		
		System.out.println("Retrieving values from AraryList (9999999)");
		
		start = System.currentTimeMillis();

		String valueFound = list.get(9999999);

		end = System.currentTimeMillis();
		
		System.out.println("Found value: " + valueFound);


		System.out.println(
				"Time to get " + number.format(size) + " element in ArrayList " + number.format(end - start));
		
		
		System.out.println("Retrieving values from queue (9999999)");
		
		start = System.currentTimeMillis();
		
		Iterator<String> iterator = queue.iterator();
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
				"Time to get " + number.format(size) + " element in queue " + number.format(end - start));

	}
	
	

}
