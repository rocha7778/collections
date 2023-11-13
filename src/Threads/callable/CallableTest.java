package Threads.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Runtime runtime = Runtime.getRuntime();
		int nNucleos = runtime.availableProcessors();
		ExecutorService executor = Executors.newFixedThreadPool(nNucleos);
		Future<Integer> resultado = executor.submit(new Sum());

		try {
			int result = resultado.get();
			System.out.println("Resultado " + result);

		} catch (Exception e) {
			MuchMoneyException cause = (MuchMoneyException) e.getCause();
			if (cause instanceof MuchMoneyException) {
				System.out.println("The customer has too much money");
			}
			e.printStackTrace();
		} finally {
			executor.shutdown();
		}
	}
}
