package anagram;

import java.util.Arrays;

public class Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     m1(new int [] {1,2,3,4,5,6,7});		

	}
	
	public static void m1(int[] list) {
		int i=0;
		int j = list.length;
		while(i<j) {
			
			int element = list[j-1];
			list[j-1] = list[i];
			list[i]=element;
			
			
			
		
			i++;
			j--;
			
		}
		
		
		
		Arrays.stream(list).forEach(System.out::println);
		
	}

}
