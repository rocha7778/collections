package Threads.callable.then.combine;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ThenCombineExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		
		System.out.println("Retrieving weight.");
		CompletableFuture<Double> pesoService = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return 65.0;
		});
		
		
		System.out.println("Retrieving height.");
		CompletableFuture<Double> alturaService = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return 177.8;
		});
		
		
		System.out.println("Calculating BMI.");
		CompletableFuture<Double> combinedFuture = pesoService
		        .thenCombine(alturaService, (weightInKg, heightInCm) -> {
		    Double heightInMeter = heightInCm/100;
		    return weightInKg/(heightInMeter*heightInMeter);
		});
		
		
		System.out.println("Your BMI is - " + combinedFuture.get());

	}

}
