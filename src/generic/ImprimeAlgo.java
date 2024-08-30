package generic;

public class ImprimeAlgo <T> {
	
	T algo;
	
	public void print(T algo) {
		System.out.println("What whe have to print is: "+ algo);
	}
	
	
	public static void main(String[] args) {
		ImprimeAlgo<String> algo = new ImprimeAlgo<String>();
		algo.print("Algo");
	}

}
