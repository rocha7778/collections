package collection.framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new TreeSet<>();
		set.add("z");
		set.add("t");
		set.add("d");
		set.add("a");

		System.out.println("printing Set");
		System.out.println(set);

		Set<String> haSset = new HashSet();
		haSset.add("z");
		haSset.add("t");
		haSset.add("d");
		haSset.add("a");

		System.out.println("printing HashSet");

		System.out.println(haSset);

		Set<String> linkedhashSset = new LinkedHashSet();
		linkedhashSset.add("z");
		linkedhashSset.add("t");
		linkedhashSset.add("d");
		linkedhashSset.add("a");

		System.out.println("printing linkedhashSset");

		System.out.println(linkedhashSset);

	}

}
