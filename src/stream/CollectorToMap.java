package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorToMap {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
		bookList.add(new Book("The Two Towers", 1954, "0345339711"));
		bookList.add(new Book("The Return of the King", 1955, "0618129111"));
		
		
		
		
		Map<String, String> booksByIsbn = bookList.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
		
//		Map<Integer, Book> booksByIsbnbyYear = bookList.stream().collect(
//			      Collectors.toMap(Book::getReleaseYear, Function.identity()));
		
		
		//System.out.println(booksByIsbnbyYear);
		
		Map<Integer,Book> booksbyYearRelease = bookList.stream().collect(Collectors.toMap(Book::getReleaseYear, Function.identity(),
			      (existing, replacement) -> existing));
		
		
		System.out.println(booksbyYearRelease);
		
	Map<Integer, List<Book>> list =	bookList.stream().collect(Collectors.groupingBy(Book::getReleaseYear, Collectors.toList()));
	
	System.out.println(list);
		
		
		

	}

}
