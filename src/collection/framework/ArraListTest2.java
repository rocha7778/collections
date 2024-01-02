package collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArraListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = List.of("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");
		List<String> inUppercase = new ArrayList<>();

		names.stream().map(String::toUpperCase).forEach(name -> inUppercase.add(name)); // bad practice

		System.out.println(names);
		System.out.println(inUppercase);

	}

}
