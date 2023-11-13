package collection.framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add(null);
		list.add("3");

		System.out.println(list);

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add(null);
		linkedList.add(null);

		System.out.println(linkedList);
		System.out.println("First elemen in the LinkedList: " + linkedList.getFirst());
		System.out.println("last elemen in the LinkedList: " + linkedList.getLast());
		System.out.println("last elemen in the List: " + list.get(list.size() - 1));

		Vector<String> v = new Vector<String>();

		v.add("a");
		v.add("b");
		v.add("c");
		v.add(null);
		v.add("3");
		v.add("3");
		System.out.println("Vector inplementation");

		System.out.println(v);

		Stack<String> stack = new Stack<String>();

		stack.add("a");
		stack.add("b");
		stack.add("c");
		stack.add(null);
		stack.add("3");
		stack.add("3");
		System.out.println("stack inplementation");
		
		stack.add("Rocha");
		
		String top = stack.peek();

		System.out.println("Element at the top of the stack " + top);
		
		System.out.println(stack);
		
		stack.firstElement();
		
		ArrayList<String> listThreaded = new ArrayList<>();
		
		MyThredList myThredList1 = new MyThredList(listThreaded);
		MyThredList myThredList2 = new MyThredList(listThreaded);
		
		Thread t1 = new Thread(myThredList1);
		Thread t2 = new Thread(myThredList2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("The size of listThreaded is " + listThreaded.size());
		
		
		List<String> vectorThreaded = new Vector<>();
		
		MyThredList myThredVector1 = new MyThredList(vectorThreaded);
		MyThredList myThredVector2 = new MyThredList(vectorThreaded);
		
		 t1 = new Thread(myThredVector1);
		 t2 = new Thread(myThredVector2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("The size of vectorThreadedThreaded is " + vectorThreaded.size());
		
		
		System.out.println("SubList");
		list.subList(0, 3).stream().forEach(System.out::println);
		
		
		int [] array = new int [3];
		
		System.out.println("Length array " + array.length);
		System.out.println("Size arrayList" + list.size());
		
		
		

	}

}
