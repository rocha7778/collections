package generic;

public class Test<T> {

	private T t;

	public Test() {
	}

	public Test(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	public <V> void m1(Wrapper<V>a, Wrapper<V>b, T c) {
		
	}

}
