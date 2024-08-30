package abstrac.classes.patterns;

public class CuerposBordes {
	
	public static void main(String[] args) {
		String fileName = "mlm/mlm.plaza.csv";
		ReaderFile.readFile(fileName, CalculatorOfSeaterNumber::extraerNumeroPuestos);
		
		/*String line = "Sillon Individual Ocacional Vintage";
		int numeroPuestos = CalculatorOfSeaterNumber.extraerNumeroPuestos(line);
		String hola = ("Titulo: " + line+ " -> Número de puestos: " + numeroPuestos);
		System.out.println(hola);
        */
		System.out.println("Total registros analizados " + ReaderFile.count);
		System.out.println("Total registros con puesto zer0 " + ReaderFile.countZero);
		System.out.println("Total registros con un puesto " + ReaderFile.count1);
		System.out.println("Total registros con puesto mayor a 1 " + ReaderFile.countGt1);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Total registros con 0 puesto  " + ReaderFile.zeroCuerpos);
	}
}
