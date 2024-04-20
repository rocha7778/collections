package mercado;

import java.util.Arrays;
import java.util.List;

public class Mercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		funList(Arrays.asList('a','b','c'));

	}
	
	public static void funList(List<Character> list) {
		int i=0;
		int j= list.size()-1;
		
		while(i<j) {
			Character element = list.get(j-1);
			list.set(j-1, list.get(i));
			list.set(i, element);
			i++;
			j--;
		}
		
		System.out.println(list);
		
	}

}
