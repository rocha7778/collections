package testcode;

import java.util.List;
import java.util.Optional;

public class TestCode {

	public static void main(String[] args) {

		List<Integer> list = List.of(3, 4, 8, 11, 19, 23);
		int variable27 = 27;

		calcular23(list, variable27);

	}
	
	public static void calcular23(List<Integer> list, int valorBuscado) {
		
		list.stream()
		.flatMap(i -> 
		         list.stream()
				.filter( j -> (i+j == valorBuscado))
				.map(j -> new int[] {i,j}))
		.findFirst()
		.ifPresent(pair -> {
			System.out.println("primer valor " + pair[0]);
		    System.out.println("segundo valor " + pair[1]);
		});
	}

	public static void calcular(List<Integer> list, int valorBuscado) {

		// buscar dos numeros que en la lista que al sumarlos sea igual al parametro i
		// ejemplo List 1,2,3,4,5,6 i = 7 resutl = 5,2
		int result = 0;

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == valorBuscado) {
					System.out.println("primer valor " + list.get(i));
					System.out.println("segundo valor " + list.get(j));
					return;
				}
			}

		}

	}

	public static void calcular3(List<Integer> list, int valorBuscado) {
		
		list.stream().flatMap(i -> 
		              list.stream()
		              .filter(j -> (i+j == valorBuscado))
	                  .map(j -> new int[] {i,j}))
		.findFirst().ifPresent(
				pair -> {
					System.out.println("primer valor " + pair[0]);
				    System.out.println("segundo valor " + pair[1]);
				}
				);	
	
	
	

	}

	public static void calcular2(List<Integer> list, int valorBuscado) {

		list.stream().flatMap(
				i -> list.stream().filter(j -> i + j == valorBuscado && !i.equals(j)).map(j -> new int[] { i, j }))
				.findFirst().ifPresent(pair -> {
					System.out.println("primer valor " + pair[0]);
					System.out.println("segundo valor " + pair[1]);
				});

	}

}
