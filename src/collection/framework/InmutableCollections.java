package collection.framework;

import java.util.List;

public class InmutableCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = List.of(1,2,3);
		list.stream().forEach(System.out::println);
		

	}

}
