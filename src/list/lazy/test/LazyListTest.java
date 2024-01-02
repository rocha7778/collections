package list.lazy.test;

import java.util.Iterator;

public class LazyListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyList<Integer> l = new MyLinkedList<>(5, new MyLinkedList<>(10, new Empty<Integer>()));

		System.out.println(l.head());

		LazyList<Integer> numbers = from(2);
		
		int two = numbers.head();
		int three = numbers.tail().head();
		int four = numbers.tail().tail().head();
		System.out.println(two + " " + three + " " + four);
		
		
		Iterator<Integer> i = l.iterator();
		
		while(i.hasNext()) {
			Integer value = i.next();
			System.out.println("Value from iterator "+value);
		}

	}

	public static LazyList<Integer> from(int n) {
		return new LazyList<Integer>(n, () -> from(n + 1));
	}

}
