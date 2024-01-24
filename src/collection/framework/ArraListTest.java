package collection.framework;

import java.util.ArrayList;
import java.util.LinkedList;



public class ArraListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		
		

		list.add("a");
		list.add("c");
		list.add(null);
		list.add("a");
		list.add("3");
		list.add(0, "1.a");
		list.add("b");
		
		//list.forEach(e -> System.out.print(e));
		
		

		
	
		//list.sort((a,b)->a.compareTo(b));
		//Collections.sort(list, (a,b) -> a.compareTo(b));
		System.out.println(list);
		
		
		
		
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("a");
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add(null);
		linkedList.add("3");
		linkedList.add(0, "1.a");
		linkedList.get(3);
		
		
		
		
		
		
		
		System.out.println(linkedList);
		
		

	}

}
