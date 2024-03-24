package stream.java17;

public class FlatMapExample {

	public static void main(String[] args) {

		String str = "5 apples and 25 oranges.";
		
		str.chars()
		.filter(n -> !Character.isWhitespace(n))
		.filter(n -> !Character.isDigit(n))
		.forEach(c -> System.out.print((char)(c)));
	}

}
