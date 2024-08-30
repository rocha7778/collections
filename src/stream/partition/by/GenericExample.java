package stream.partition.by;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectorInterfaceTEst <String> hola = new CollectorInterfaceTEst<String>("Rocha");
		
		System.out.println(hola.getname());
		
		CollectorInterfaceTEst <Integer> number = new CollectorInterfaceTEst<Integer>(10);
		
		System.out.println(number.getname());
		

	}

}
