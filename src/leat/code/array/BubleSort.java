package leat.code.array;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int arr [] = new int[] {0,2,1,2};
		blubleSort(arr);
		
		for(int i=0; i < arr.length;i++) {
			System.out.println("[i]==>"+arr[i]);
		}
		
		int arr2 [] = new int[] {0,2,1,2};
		
		Arrays.sort(arr2);
		
		System.out.println("sort by Array");
		
		for(int i=0; i < arr2.length;i++) {
			System.out.println("[i]==>"+arr[i]);
		}

	}
	
	

	public static void blubleSort(int [] arr) {
		
		int length = arr.length -1;
		
		for(int i=0; i<length;i++) {
			for(int j=0;j< length - i ; j++) {
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
	}

}
