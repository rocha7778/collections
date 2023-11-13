package collection.framework;

import java.util.HashSet;
import java.util.Set;

public class SetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("a");
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add(null);
		hashSet.add("3");
		hashSet.add("3");
		
		
		System.out.println(hashSet);

	}

}
