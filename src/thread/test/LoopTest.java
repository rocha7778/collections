package thread.test;

public class LoopTest extends Thread {

	public static int x =0;
	
	
	
	@Override
	public void run() {
		for(int i=0; i<10_000_000; i++) {
			x = x + 1;
		}
	}
}
