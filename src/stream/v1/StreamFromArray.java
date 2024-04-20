package stream.v1;

import java.util.Arrays;

public class StreamFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5};
		int total = Arrays.stream(arr).sum();
	}

}
