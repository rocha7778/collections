package collection.framework;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new ArrayDeque<>(2);
		
		queue.add("Hola 1");	
		queue.add("Hola 2");	
		queue.add("Hola 3");
		queue.add("Hola 4");
		
		System.out.println("Queue size: " + queue.size());
		
		System.out.println("Getting value from queue: " + queue.poll());
		System.out.println("Getting value from queue: " + queue.poll());
		System.out.println("Getting value from queue: " + queue.poll());
		System.out.println("Getting value from queue: " + queue.poll());
		
		
		

	}

}
