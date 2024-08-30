package sdk.meli;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Class<?>> taskClasses = List.of(
            SearchContextTask.class,
            CartTask.class
        );

        // Iterate over the list and perform some action
        for (Class<?> taskClass : taskClasses) {
            System.out.println("Class name: " + taskClass.getName());

            try {
                Object instance = taskClass.getDeclaredConstructor().newInstance();
                System.out.println("Instance created: " + instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class SearchContextTask {
    @Override
    public String toString() {
        return "SearchContextTask instance";
    }
}

class CartTask {
    @Override
    public String toString() {
        return "CartTask instance";
    }
}
