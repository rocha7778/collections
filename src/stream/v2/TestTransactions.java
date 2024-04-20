package stream.v2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import stream.v1.Trader;
import stream.v1.Transaction;

public class TestTransactions {

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

		Comparator<Transaction> c = (t1, t2) -> t1.getValue() > t2.getValue() ? 1 : 0;
		transactions.stream().filter(t -> t.getYear() == 2011).sorted(c).forEach(System.out::println);

		System.out.println("Unique city");

		transactions.stream().map(t -> t.getTrader().getCity()).distinct().forEach(System.out::println);

		System.out.println("Trades from Cambrige");

		transactions.stream().map(t -> t.getTrader()).distinct().

				filter(t -> t.getCity() == "Cambridge").forEach(System.out::println);
		System.out.println("");
		System.out.println("");

		System.out.println("Is any traded base in Milan");

		transactions.stream().map(t -> t.getTrader()).filter(t -> t.getCity() == "Milan").findAny()
				.ifPresent(t -> System.out.println(t));

		System.out.println("");
		System.out.println("");

		System.out.println("All traders name sorted alphabetic");
		transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted().forEach(System.out::println);

		System.out.println("Trades's transaction value from Cambrige");

		transactions.stream().filter(t -> t.getTrader().getCity() == "Cambridge").forEach(System.out::println);

		System.out.println("The higest transaction value");
		System.out.println("");
		System.out.println("");
		
		var higestValue = transactions.stream().mapToInt(t->t.getValue()).max();
		
		var higestValue2 = transactions.stream().map(t->t.getValue()).max(Integer::compareTo); 
		
		var higestValue3 = transactions.stream().map(t->t.getValue()).max((v1,v2) -> v1.compareTo(v2)); 
		
		System.out.println(higestValue);
		System.out.println(higestValue2);
		System.out.println(higestValue3);
		
		
var higestValue4 = transactions.stream().map(t->t.getValue()).min((v1,v2) -> v1.compareTo(v2)); 
		
		System.out.println(higestValue4);
		
		
		

	}

}
