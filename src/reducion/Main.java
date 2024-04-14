package reducion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		System.out.println(list.stream().collect(Collectors.reducing(0, (a,b)->a+b)));
		
		System.out.println(list.stream().reduce(0, (a,b)->a+b));
		
		list.stream().count();
	

	}

}
