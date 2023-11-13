package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1 = new  ArrayList<Integer>();
		list1.add(2);
		list1.add(2);
		list1.add(1);
		
		ArrayList<Integer> list2 = new  ArrayList<Integer>();
		
		list2.add(6);
		list2.add(5);
		list2.add(4);
		
		

	}
	
	public static List<Integer> sortedandMerge(ArrayList<Integer> list1,  ArrayList<Integer> list2){
		
		
		list1.addAll(list2);
		
		
		
		
		return null;
		
	}
	
	public static  List<Integer> sortList(ArrayList<Integer> list){
		Collections.sort(list);
		return list;
		
	}

}
