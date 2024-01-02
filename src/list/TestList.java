package list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.Chair;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Chair> list = new ArrayList<>();
		
	Integer a = new Integer(3);
	Integer b = new Integer(3);
	
	boolean result = a==b;
	
	if(result) {
		System.out.println("Equal");
	}	
	
		
		
		Chair c1 = new Chair(0, 0, "nike", "blue");
		Chair c2 = new Chair(0, 0, "nike", "red");
		Chair c3 = new Chair(0, 0, "nike", "red");
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(null);
		
		Predicate<Object> p = o -> o!= null;
		
		list.stream().filter(e ->p.test(e)).toList().forEach(System.out::println);
		
		
		Chair [] arrayChairs = {c1,c2,c3};
		
		
		
	
		
		
		
		
		

	}

}
