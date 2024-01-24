package generic;

import java.util.function.Predicate;

public class TestExtendAndSupperGeneric {

	public static void main(String[] args) {

		WrapperUtil<Integer> wu = new WrapperUtil<Integer>();
		Wrapper<Integer> n1 = new Wrapper<Integer>(10);
		Wrapper<Integer> n4 = new Wrapper<Integer>(10);
		
		Wrapper<Long> n2 = new Wrapper<Long>(10L);
		Wrapper<Long> n3 = new Wrapper<Long>(10L);

		Integer numer1 = Integer.valueOf(10);
		Integer numer2 = Integer.valueOf(10);
		
		var result = numer1+numer2;
		
		System.out.println(wu.sum(n1, n2));
		
		System.out.println(wu.sumInteger(n1, n4));
		
		Predicate<Integer> number = n -> n>10;
		Predicate<Wrapper> wapperTest = n -> n.get()!=null;
		Predicate<WrapperChild> wapperChild = n -> n.get()!=null;
		
		 
		
		System.out.println(number.test(20));
		
		WrapperChild<Integer> wc = new WrapperChild<Integer>(numer2);
		
		wapperTest.test(wc);
		String hola = new String("Hola");
		
		wu.print(numer1);
		wu.print(hola);
		
		
		
		
		
		

	}

}
