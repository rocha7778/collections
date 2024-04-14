package stream.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import stream.Book;

public class CollectorToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
		bookList.add(new Book("The Two Towers", 1954, "0345339711"));
		bookList.add(new Book("The Return of the King", 1955, "0618129111"));

		Map<Integer, Long> booksByYears = bookList.stream()
				.collect(Collectors.groupingBy(Book::getReleaseYear, Collectors.counting()));

		System.out.println(booksByYears);



		Map<Integer, List<String>> booksByYearsAndNAme = bookList.stream().collect(
				Collectors.groupingBy(Book::getReleaseYear, Collectors.mapping(Book::getName, Collectors.toList())));
		
		System.out.println(booksByYearsAndNAme);

	}

}
