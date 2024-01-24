package burbuja.busqueda.binaria;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BusquedaBinaria {

	public static void main(String[] args) {

		Random rand = new Random();
		List<Integer> list = IntStream.generate(() -> rand.nextInt(100)).limit(100).boxed().sorted().collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		var result = binarySearch(list, 86, 0);
		
		System.out.println(result);
	}
	
	
	public static String binarySearch(List<Integer> list, int number, int contador) {
		
	    int size = list.size();
	    int middleOfList = size/2;
	    int valueOfMiddleOflist = list.get(middleOfList);
	    
	    if(size == 1 && (number != valueOfMiddleOflist)) {
	    	return "value not found";
	    }
	    
	    if(number == valueOfMiddleOflist) {
	    	return "value found value==" + number + "middle of the list =="+ middleOfList;
	    }
	    
	    if(number<= valueOfMiddleOflist) {
	    	list = list.subList(0, middleOfList);
	    }else {
	    	// buscar en la segunda mitad del array
	    	list = list.subList(middleOfList, size);
	    }
	    
	    System.out.println("Contador" + contador);
	    return binarySearch(list, number, ++contador);
	}

}
