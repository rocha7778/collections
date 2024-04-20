package lambdasinaction.chap4;

public class GetCalories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var max = Dish.menu.stream().map(Dish::getCalories).max((c1,c2)->c1>c2?1 : c2>c1?-1: 0);
		System.out.println("Max "+max.get());
		
		Dish.menu.stream().distinct().forEach(System.out::println);
		
		
	}

}
