package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		list.stream()
	    .sorted(Collections.reverseOrder()) 
	    .forEach(System.out::println);
		
		String listJoping = list.stream().map(s -> s.toString()).collect(Collectors.joining(","));
		
		System.out.println(listJoping);
		
		

	}

}
