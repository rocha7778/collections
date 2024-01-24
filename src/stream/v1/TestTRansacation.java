package stream.v1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestTRansacation {

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
		
		Comparator<Transaction> c = (t1, t2) -> t1.getValue()>t2.getValue()?1:0;
		
		
		
		transactions.stream().filter(t -> t.getYear() ==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);
		System.out.println("Using Comparator lambda funtion");
		transactions.stream().filter(t -> t.getYear() ==2011).sorted(c).forEach(System.out::println);
		
		System.out.println("Unique city of the trader work");
		transactions.stream().map(t -> t.getTrader()).map(trader -> trader.getCity()).distinct().toList().forEach(System.out::println);
		
		System.out.println("TRader from Cambrige");
		transactions.stream().map(t -> t.getTrader())
		.filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge"))
		.sorted(Comparator.comparing(Trader::getName)).distinct().forEach(System.out::println);
		
		
		System.out.println("All traders");
		transactions.stream().map(t -> t.getTrader())
		.sorted(Comparator.comparing(Trader::getName)).distinct().forEach(System.out::println);
		
		var traderInMilan = transactions.stream().map(t -> t.getTrader()).filter(trader -> trader.getCity().equalsIgnoreCase("Milan")).findAny();
		
		System.out.println(traderInMilan);
		
		
		System.out.println(" transaction from TRader that live in Cambrige");
		transactions.stream().filter( t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge")).forEach(System.out::println);
		
		
		
		System.out.println(" transaction higest");
		var resultTransactionHigest=  transactions.stream().map(t -> t.getValue()).max(Integer::compareTo);
		
		System.out.println(" transaction higest" + resultTransactionHigest);
		
		
		
		System.out.println(" transaction lowest");
		var resultTransactionlowest=  transactions.stream().map(t -> t.getValue()).min(Integer::compareTo);
		
		System.out.println(" transaction min" + resultTransactionlowest);
		
		
		
		
		
		
		

	}

}
