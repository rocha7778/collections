package completable.future.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CmpletableFutureTEst {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		var greetting = CmpletableFutureTEst.calculateAsync4();

		while (!greetting.isDone()) {
			System.out.println("I am not done yet");
			Thread.sleep(400); // Sleep a bit to avoid tight loop and excessive CPU usage
		}

		System.out.print(greetting.get());

	}

	public static Future<String> calculateAsync2() throws InterruptedException {
		return CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(3000); // Simulate delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Hello";
		});
	}

	public static Future<String> calculateAsync3() throws InterruptedException {

		return CompletableFuture.supplyAsync(() -> "Hello").thenApply(future -> future + " Word");

	}

	public static Future<String> calculateAsync4() throws InterruptedException {

		return CompletableFuture.supplyAsync(() -> "Hello")
				.thenCompose(future -> CompletableFuture.supplyAsync(() -> future + " World"));

	}

}
