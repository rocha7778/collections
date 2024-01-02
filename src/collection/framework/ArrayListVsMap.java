package collection.framework;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListVsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer size = 10_000_000;

		List<String> list = new ArrayList<>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		

		long start = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			list.add(RandomStringGenerator.generateRandomString());
		}

		long end = System.currentTimeMillis();

		NumberFormat number = NumberFormat.getInstance();

		System.out.println(
				"Time to insert " + number.format(size) + " element in ArrayList " + number.format(end - start));
		

		start = System.currentTimeMillis();

//		for (int i = 0; i < size; i++) {
//			if(i == 9999999) {
//				map.put(i,"Rocha1");
//			}else {
//				map.put(i,RandomStringGenerator.generateRandomString());
//			}
//		}
		
		for (int i = 0; i < size; i++) {
			map.put(i, RandomStringGenerator.generateRandomString());
		}

		end = System.currentTimeMillis();


		System.out.println(
				"Time to insert " + number.format(size) + " element in map " + number.format(end - start));
		
		
//		System.out.println("Retrieving values from AraryList (9999999)");
//		
//		start = System.currentTimeMillis();
//
//		String valueFound = list.get(9999999);
//
//		end = System.currentTimeMillis();
//		
//		System.out.println("Found value: " + valueFound);
//
//
//		System.out.println(
//				"Time to get " + number.format(size) + " element in ArrayList " + number.format(end - start));
//		
//		
//		System.out.println("Retrieving values from HashSet (9999999)");
//		
//		start = System.currentTimeMillis();
//		
//	    String result = map.get(9999999);
//	    System.out.println("found (10_000_000) " + result);		
//		
//		
//		end = System.currentTimeMillis();
//		
//		
//		System.out.println(
//				"Time to get " + number.format(size) + " element in Map " + number.format(end - start));
//
	}
//	
	

}
