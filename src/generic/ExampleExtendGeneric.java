package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ExampleExtendGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer o;
		
		Wrapper<Integer> integer = new Wrapper<Integer>(Integer.valueOf(10));
		Wrapper<? extends Number> numbersWrapper = integer;
		
		Double result = numbersWrapper.get().doubleValue();
		
		//System.out.println("Result ---> " +result);
		
		new Exception();
		
		
		
		
		WrapperUtil.copy(new Wrapper<Integer>(10),  new Wrapper<Integer>(30));
		Wrapper<Integer> wrapperInt2 = new Wrapper<Integer> (Integer.valueOf(10));
		Wrapper<String> wrpperString = new Wrapper<String>("Hola");
		
		Test<String> hola = new Test<String>("Hola");
		
		hola.m1(integer, wrapperInt2, "Hola2");
		
		
		
		WrapperUtil.process(new Wrapper<Long>(10L), new Wrapper<Long>(20L), new Wrapper<Long>(30L));
		
		List<Number> list1 = new ArrayList<>();
		List<Long> list2 = new ArrayList<>();
		
		//list1 = list2; // compile exception list<a> is not a list<b>
		
		

	}

}
