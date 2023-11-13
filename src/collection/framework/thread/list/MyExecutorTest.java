package collection.framework.thread.list;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorTest {

	private ArrayList<Integer> taskList = new ArrayList<Integer>();
	private Object object = new Object();
	
	private void launch(){
		
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        	executorService.execute(new MyThread(taskList));
        	executorService.execute(new MyThread(taskList));
        	executorService.shutdown();
	}
	
	public static void main(String[] args) {
		MyExecutorTest test = new MyExecutorTest();
		test.launch();
		
	}
}