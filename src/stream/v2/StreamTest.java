package stream.v2;

import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        
        Stream.iterate(new int[]{0,1},  t -> new int[]{t[1],t[0]+t[1]})
        .limit(20)
        .forEach(t->System.out.println("("+t[0]+","+t[1]+")"));


        System.out.println("Generate");
        Stream.generate(Math::random)
        .limit(5)
        .forEach(System.out::println);
    }
    
}
