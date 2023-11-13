package list;

import java.util.ArrayList;
import java.util.List;

import model.Chair;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Chair> list = new ArrayList<>();
		
		Chair c1 = new Chair(0, 0, "nike", "blue");
		Chair c2 = new Chair(0, 0, "nike", "red");
		
		list.add(c1);
		list.add(c2);
		
		System.out.println(list);
		
		list.remove(c2);
		
		
		System.out.println(list);

	}

}
