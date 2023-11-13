package collection.framework.thread.list;

import java.util.List;

class MyThread implements Runnable{

	private List<Integer> myList;
	private Object host;
	
	public MyThread(List<Integer> list){
		this.myList = list;
	}
	
	private  void updateList(int i){
			myList.add(i);
	}
	
	@Override
	public void run() {
		for( int i = 0; i < 100;i++){
			updateList(i);
		}
		System.out.println("end: " + myList.size());
	}
}
