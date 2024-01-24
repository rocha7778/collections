package thread.test;

public class BalanceUpdate {

	private static int balance = 100;

	public static void main(String[] args) {

		startBalanceUpdateThread();
		startBalanceMonitorThread();
		
	}

	public static void startBalanceUpdateThread() {

		Thread t = new Thread(() -> {
			while (true) {
				updateBalance();
			}
		});

		t.start();

	}

	public static void startBalanceMonitorThread() {
		
		Thread t = new Thread(() -> {
			monitorBalance();
		});
		
		t.start();

	}

	public static void updateBalance() {
		// Add 10 to balance and subtract 10 from balance
		balance = balance + 10;
		balance = balance - 10;
	}

	public static void monitorBalance() {
		int b = balance;
		if (b != 100) {
			System.out.println("Balance changed: " + b);
			System.exit(0); // Exit the program
		}
	}

}
