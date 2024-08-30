package collection.framework.iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NaturalNumbersIterator naturalNumber = new NaturalNumbersIterator();
		
		while(naturalNumber.hasNext()) {
			System.out.println("Number: "+ naturalNumber.next());
		}
		
	}

}
