package collection.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListVsTreeSetTestOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer size = 10;

		List<String> list = new ArrayList<>();
		Set<String> set = new TreeSet<>();

		for (int i = 0; i < size; i++) {
			String randomString = RandomStringGenerator.generateRandomStringWithLength(3);
			list.add(randomString);
			set.add(randomString);
		}

		printCollections(list);
		printCollections(set);

		
		

	}

	public static void printCollections(Collection c) {

		System.out.println(c);
	}

}
