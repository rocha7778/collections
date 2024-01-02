package list.lazy.test;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LazyList<T> implements MyList<T> {

	final T head;
	final Supplier<MyList<T>> tail;
	

	public LazyList(T head, Supplier<MyList<T>> tail) {
		this.head = head;
		this.tail = tail;
	}

	public T head() {
		return head;
	}

	public MyList<T> tail() {
		return tail.get();
	}

	public boolean isEmpty() {
		return false;
	}

	public MyList<T> filter(Predicate<T> p) {
		return isEmpty() ? this : p.test(head()) ? new LazyList<>(head(), () -> tail().filter(p)) : tail().filter(p);
	}

	@Override
	public Iterator<T> iterator() {
		return new IterableLazzyList<T>(tail.get());
	}

}
