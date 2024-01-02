package list.lazy.test;

import java.util.Iterator;
import java.util.function.Predicate;

public class MyLinkedList<T> implements MyList<T> {
    final T head;
    final MyList<T> tail;

    public MyLinkedList(T head, MyList<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public T head() {
        return head;
    }

    public MyList<T> tail() {
        return tail;
    }

    public boolean isEmpty() {
        return false;
    }

    public MyList<T> filter(Predicate<T> p) {
        return isEmpty() ? this
                : p.test(head()) ? new MyLinkedList<>(
                        head(), tail().filter(p)) : tail().filter(p);
    }

	@Override
	public Iterator<T> iterator() {
		return new IterableLazzyList<T>(tail);
	}
}
