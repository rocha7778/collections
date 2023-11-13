package collection.framework;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriotityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new PriorityBlockingQueue<>(2);
		
		queue.add("Hola 2");	
		queue.add("Hola 1");	
		queue.add("Hola 4");
		queue.add("Hola 3");
		
		System.out.println("Queue size: " + queue.size());
		
		System.out.println("Getting value from queue: " + queue.poll());
		System.out.println("Getting value from queue: " + queue.poll());
		System.out.println("Getting value from queue: " + queue.poll());
		System.out.println("Getting value from queue: " + queue.poll());
		
		
		

	}

}
