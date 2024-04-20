package thread.test;

public class PrinterThread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(PrinterThread::printer);
		t1.start();
		
		Thread t2 = new Thread(PrinterThread::printer);
		t2.start();

	}
	
	public static void printer() {
		for (int i = 1; i <= 500; i++) {
			System.out.println(i);
			
		}
	}

}
