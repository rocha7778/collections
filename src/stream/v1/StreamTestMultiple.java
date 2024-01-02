package stream.v1;

import java.util.Arrays;
import java.util.List;

import lambdasinaction.chap4.Dish;

public class StreamTestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		var result = list.stream().reduce(0,(a,b)-> a+b);
		var resultOptional = list.stream().reduce((a,b)-> a+b);
		
		System.out.println(result);
		System.out.println(resultOptional);
		
		
		 List<Dish> menu =
		            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
		                    new Dish("beef", false, 700, Dish.Type.MEAT),
		                    new Dish("chicken", false, 400, Dish.Type.MEAT),
		                    new Dish("french fries", true, 530, Dish.Type.OTHER),
		                    new Dish("rice", true, 350, Dish.Type.OTHER),
		                    new Dish("season fruit", true, 120, Dish.Type.OTHER),
		                    new Dish("pizza", true, 550, Dish.Type.OTHER),
		                    new Dish("prawns", false, 400, Dish.Type.FISH),
		                    new Dish("salmon", false, 450, Dish.Type.FISH));
		 
		 
		 menu.stream().count();

	}

}
