package collection.framework.collectors.team;

import java.util.ArrayList;
import java.util.List;

import lambdasinaction.chap4.Dish;

public class CollectorsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Dish> list = Dish.menu.stream().collect(new CollectorsInterfaceTest<>());
		List<Dish> list2 = Dish.menu.stream().collect(ArrayList::new, List::add, List::addAll);
	}

}
