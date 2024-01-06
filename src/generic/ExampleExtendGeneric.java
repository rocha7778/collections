package generic;

public class ExampleExtendGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wrapper<Integer> integer = new Wrapper<Integer>(Integer.valueOf(10));
		Wrapper<? extends Number> numbersWrapper = integer;
		
		Double result = numbersWrapper.get().doubleValue();
		
		System.out.println("Result ---> " +result);
		
		
		
		
		WrapperUtil.copy(new Wrapper<Integer>(10),  new Wrapper<Integer>(30));
		Wrapper<Integer> wrapperInt2 = new Wrapper<Integer> (Integer.valueOf(10));
		Wrapper<String> wrpperString = new Wrapper<String>("Hola");
		
		Test<String> hola = new Test<String>("Hola");
		
		hola.m1(integer, wrapperInt2, "Hola2");
		

	}

}
