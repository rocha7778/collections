package stream.v1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPratices {

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
		
		transactions
		.stream()
		.filter(t -> t.getYear()==2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.forEach(t -> System.out.println(t));
		
		transactions
		.stream()
		.map(t -> t.getTrader().getCity()).distinct()
		.forEach(t -> System.out.println(t));
		
		
		transactions
		.stream()
		.map(t -> t.getTrader())
		.filter(t -> t.getCity().equalsIgnoreCase("Cambridge"))
		.distinct()
		.sorted(Comparator.comparing(Trader::getName))
		.forEach(t -> System.out.println(t));
		
		
	Map<Integer, List<Transaction>> result44 = transactions.stream().collect(Collectors.groupingBy(Transaction::getYear));
	
	
	var resutl55 = transactions.stream().collect(Collectors.reducing(0, Transaction::getValue, (i,j) -> i+j));
	var resutl56 = transactions.stream().mapToInt(t ->t.getValue()).sum();
	
	System.out.println("Total transactions value " +resutl55);
	System.out.println("Total transactions value " +resutl56);
	
	
	System.out.println(result44);
		
		
		
		
		
		
		
		

	}

}
