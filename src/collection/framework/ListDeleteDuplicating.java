package collection.framework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListDeleteDuplicating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();

		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(null);
		list.add("3");
		list.add("3");
		
		System.out.println(list);
		List<String> list2 = list.stream().distinct().toList();
		System.out.println("eleminating duplicates by strem: " + list2);
		
		Set<String> setList = new LinkedHashSet<>();
		setList.addAll(list);
		
		System.out.println("elimination duplicates by set  : " +setList);
		


	}

}
