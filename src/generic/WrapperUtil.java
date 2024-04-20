package generic;

public class WrapperUtil<T> {

	public Double sum(Wrapper<? extends Number> n1, Wrapper<? extends Number> n2) {
		return n1.get().doubleValue() + n2.get().doubleValue();
	}
	
	public Integer sumInteger(Wrapper<? super Integer> n1, Wrapper<? super Integer> n2) {
		return ((Integer) n1.get()).intValue() + ((Integer) n2.get()).intValue();
	}
	
	
	
	

	public static <T> void copy(Wrapper<T> source, Wrapper<T> dest) {
		T value = source.get();
		dest.set(value);

	}
	
	public static <T> void print(T input) {
		System.out.println(input);
	}

	public <V> void m1(Wrapper<V> a, Wrapper<V> b, T c) {

	}

	public <V> void m2(Wrapper<V> a, Wrapper<V> b, T c) {
	}
	
	
	public static void process(Wrapper<Long>...nums) {
		
		System.out.println("nums[0]-->"+nums[0].get());
		
		Object [] obj = nums;
		obj[0] = new Wrapper<Long>(45L);
		Long ln = nums[0].get();
		
		System.out.println("nums[0]-->"+ln);
		
	}
	
	public static void process(Integer...nums ) {
		
	}

}
