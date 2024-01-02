package list.lazy.test;

import java.util.function.Predicate;

interface MyList<T> extends Iterable<T>{
    public T head();

    public MyList<T> tail();

    default boolean isEmpty() {
        return true;
    }

    public MyList<T> filter(Predicate<T> p);
}
