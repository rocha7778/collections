package generic;

public class WrapperUtil<T> {

	public Double sum(Wrapper<? extends Number> n1, Wrapper<? extends Number> n2) {
		return n1.get().doubleValue() + n2.get().doubleValue();
	}

	public static <T> void copy(Wrapper<T> source, Wrapper<T> dest) {
		T value = source.get();
		dest.set(value);

	}

	public <V> void m1(Wrapper<V> a, Wrapper<V> b, T c) {

	}

	public <V> void m2(Wrapper<V> a, Wrapper<V> b, T c) {
	}

}
