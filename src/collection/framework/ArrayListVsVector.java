package collection.framework;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListVsVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer size = 10_000_000;
			
		List<String> list = new ArrayList();
		List<String> vector = new Vector();
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < size; i++) {
			list.add(RandomStringGenerator.generateRandomString());
		}
		
		long end = System.currentTimeMillis();
		
		NumberFormat number = NumberFormat.getInstance();
		
		
		System.out.println("Time to insert " + number.format(size) + " element in ArrayList " + number.format(end - start));
		
		
		long startv = System.currentTimeMillis();
		
		for (int i = 0; i < size; i++) {
			vector.add(RandomStringGenerator.generateRandomString());
		}
		
		long endv = System.currentTimeMillis();
		
		
		System.out.println("Time to insert " + number.format(size) + " element in ArrayList " + number.format(endv - startv));
		

	}

}
