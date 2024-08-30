package stream.flat.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Container {
    private final List<String> items;

    public Container(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }
}

public class FlatMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Container> containers = List.of(
		            new Container(List.of("one", "three", "five")),
		            new Container(List.of("seven", "eight", "two")),
		            new Container(List.of("four", "nine", "six"))
		        );
		 
		 containers.stream()
		 .flatMap(innerList -> 
		 innerList.getItems().stream().filter(item -> item.length() > 3))
		 .forEach(System.out::println);;
		 
		 flatMapArray();
		 flatMapPair();

	}
	
	private static void flatMapArray() {
		String [] array = {"Hello", "World"};
		
		Stream<String> streamOfString = Arrays.stream(array);
		
		streamOfString
		.map(str -> str.split(""))
		.flatMap(arr -> Arrays.stream(arr))
		.distinct()
		.forEach(System.out::println);
	}
	
	private static void flatMapPair() {
		List<Integer> numbers1 = List.of(1,2,3);
		List<Integer> numbers2 = List.of(3,4);
		
		// [1,3], [1,4], [2,3],[2,4],[3,3],[3,4]
		
		numbers1.stream()
		.flatMap(i -> numbers2.stream()
				.map(j ->  "[" + i + ","+j+"]"))
		.forEach(System.out::println);
	}

}
