package Threads.callable.producer.consumer;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumer {
	
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 16;
	
	
	
	public void produce() throws InterruptedException {
		int value = 0;
		
		while(true) {
			synchronized (this){
				
				int listSize = list.size();
				while( listSize  == capacity) {
					wait();
					
				}
				
				System.out.println("Producer procuded-" + value);
				list.add(value++);
				notify();
				
				Thread.sleep(300);
			}
		}
	}
	
	public void consume() throws InterruptedException {
		while(true) {
			synchronized(this) {
				
				while(list.size()== 0) {
					wait();
					
				}
				
				int val = list.removeFirst();
				System.out.println("Consumer consumer-" + val);
				notify();
				Thread.sleep(1000);
			}
		}
	}
	

}
