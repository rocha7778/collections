package testcode;

import java.util.List;

public class ValorBuscadoStream {
	
	public static void main(String[] args) {

		List<Integer> list = List.of(3, 4, 8, 11, 19, 23);
		int variable27 = 27;

		calcular23(list, variable27);

	}
	
	public static void calcular23(List<Integer> list, int valorBuscado) {
		
		list.stream()
		.flatMap(i -> list
				.stream()
				.filter(j -> i+j==valorBuscado)
				.map(j -> new int [] {i,j}))
		.findFirst()
		.ifPresent(pairs ->{
			System.out.println(pairs[0]);
			System.out.println(pairs[1]);
		});
		
	}

}
