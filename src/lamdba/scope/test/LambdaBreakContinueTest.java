package lamdba.scope.test;

import java.util.function.Consumer;

public class LambdaBreakContinueTest {

	public static void main(String[] args) {

		Consumer<int[]> printers = ids -> {
			int printerCounter = 0;

			for(int id : ids) {
				int result = id % 2;
				if (result != 0) {
					continue;
				}
				

				System.out.println(id);
				printerCounter++;
				
				if(printerCounter==3) {
					break;
				}
			}
		};
		
		printers.accept(new int[] {1,2,3,4,5,6,7,8});
		
	}

}
