package burbuja;

import java.util.Iterator;

public class Burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 4, 8, 9, 7, 3, 0, 1, 5 };
		
		sortBurbuja(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		

	}

	public static void sortBurbuja(int[] arr) {

		int length = arr.length - 1;
		int aux = 0;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				   int arr_j = arr[j];
				   int arr_j_1 = arr[j+1];
				if (arr_j > arr_j_1) {
					aux = arr_j;
					arr[j] =arr_j_1;
					arr[j + 1] = aux;
				}
			}
		}
	}
}
