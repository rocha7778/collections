package list.lazy.test;

import java.util.Iterator;

public class IterableLazzyList<T> implements Iterator<T> {

	private MyList<T> list;

	public IterableLazzyList(MyList<T> list) {
		super();
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return  !list.isEmpty();
	}

	
	@Override
	public T next() {
        if (hasNext()) {
            T value = list.head();
            list = list.tail();
            return value;
        }
        return null;
    }
}
