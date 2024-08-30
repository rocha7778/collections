package stream.v1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TransactionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), 
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), 
				new Transaction(mario, 2012, 700), 
				new Transaction(alan, 2012, 950));
		
		System.out.println("Transaction in 2011 and sorted by value");
		
		transactions.stream()
		.filter(t -> t.getYear() == 2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.forEach(System.out::println);
		
		System.out.println("Unique city of the trader word");
		
		transactions.stream()
		.map(t -> t.getTrader().getCity())
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("Find all traders from Cambridge and sorte them by name");
		
		transactions.stream()
		.map(t -> t.getTrader())
		.distinct()
		.filter(t -> t.getCity().equalsIgnoreCase("Cambridge"))
		.sorted(Comparator.comparing(Trader::getName))
		.forEach(System.out::println);
		;
		
		
		System.out.println("Return all trader's name");
		
		transactions.stream()
		.map(t -> t.getTrader().getName())
		.distinct()
		.sorted()
		.forEach(System.out::println);
		;
		
		System.out.println("Highest transaction value");
		
		var higestTrnasactionValue = transactions.stream()
		.map(t -> t.getValue())
		.reduce(Integer::max);
		
		System.out.println("Highest transaction value : "+higestTrnasactionValue);
		
		
		
		System.out.println("Lowest transaction value");
		
		var lowestTrnasactionValue = transactions.stream()
		.map(t -> t.getValue())
		.reduce(Integer::min);
		
		System.out.println("Lowest transaction value : "+lowestTrnasactionValue);
		
		
		

	}

}
