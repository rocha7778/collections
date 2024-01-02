package list.lazy.test;

import java.util.Iterator;
import java.util.function.Predicate;

public class Empty <T> implements MyList<T> {

	@Override
	public T head() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyList<T> tail() {
		// TODO Auto-generated method stub
		 return null;
	}

	@Override
	public MyList<T> filter(Predicate<T> p) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
