package collection.framework;

import java.util.List;

public class MyThredList implements Runnable {

	private List<String> myList;

	/**
	 * @param myList
	 */
	public MyThredList(List<String> myList) {
		super();
		this.myList = myList;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 100; i++) {
			myList.add(RandomStringGenerator.generateRandomString());
		}
		
	}

}
