package equals.vs.compare.to;

import java.util.stream.Collectors;

import domain.chap2.Apple;

public class EqualsVsCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a1 = new Apple(10, "red");
		Apple a2 = new Apple(10, "red");
		
		System.out.println("a1 is equal to a2 "+ (a1.equals(a2)));
		System.out.println("a1 == a2 "+ (a1 == a2));
		
		
		

	}

}
