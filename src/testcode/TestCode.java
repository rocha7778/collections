package testcode;

import java.util.List;

public class TestCode {

	public record numberFound(Integer a, Integer b) {};
	
	public static void main(String[] args) {

		List<Integer> list = List.of(3, 4, 8, 11, 19, 23);
		int variable27 = 27;

		calcularRecord(list, variable27);

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
		    System.out.println("Valor Buscado " + valorBuscado);
		});
	}
	
	public static void calcularRecord(List<Integer> list, int valorBuscado) {
		
		list.stream()
		.flatMap(i -> list.stream()
				     .filter(j -> (i+j == valorBuscado)).map(j -> new numberFound(i,j)))
		.findFirst()
		.ifPresent(r -> System.out.println(r));
		
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
					System.out.println("Valor Buscado " + valorBuscado);
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
