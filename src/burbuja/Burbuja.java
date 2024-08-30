package burbuja;

public class Burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 4, 8, 9, 7, 3, 0, 1, 5 };
		
		sortBurbuja(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		String ITEM_DESCRIPTION_PATH = "/items/%s/description";
		String formattedPath = String.format(ITEM_DESCRIPTION_PATH, "MLA833493647");

		System.out.println(formattedPath);
		
		String name = "JavaConceptOfTheDay".substring(4);
        
        System.out.println(name);

	}

	public static void sortBurbuja(int[] arr) {

		int length = arr.length - 1;
		int aux = 0;

		for (int i = 0; i < length; i++) {
			int internalLength = length - i;
			for (int j = 0; j < internalLength; j++) {
				System.out.println("i: " + i + ", j: " + j); // Print i and j values

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
