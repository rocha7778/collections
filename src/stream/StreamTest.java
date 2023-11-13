package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList(Arrays.asList("one", "two"));
	     Stream<String> sl = l.stream();
	     l.add("three");
	     String s = sl.collect(Collectors.joining(" "));
	     
	     System.out.println(s);

	}

}
