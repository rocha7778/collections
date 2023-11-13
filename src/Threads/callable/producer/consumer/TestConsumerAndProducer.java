package Threads.callable.producer.consumer;

public class TestConsumerAndProducer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		final ProducerConsumer pc = new ProducerConsumer();
		
		Thread th1 = new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					pc.produce();
					
				}catch( Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		});
		
		
		Thread th2 = new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					pc.consume();
					
				}catch( Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		});
		
		th1.start();
		th2.start();
		
		
		

	}

}
