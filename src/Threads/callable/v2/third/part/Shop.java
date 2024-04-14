package Threads.callable.v2.third.part;

import java.util.Random;

import Threads.callable.v2.third.part.Discount.Code;

public class Shop {

	private Random random = new Random();
	private String name;

	public Shop(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getPrice(String product) {
		Code[] codeList = Discount.Code.values();
		Discount.Code code = codeList[random.nextInt(codeList.length)];
		Double price =  calculatePrice(product);
		return String.format("%s:%.2f:%s:", this.name, price, code);
	}


	private double calculatePrice(String product) {
		delay();
		return random.nextDouble() * product.charAt(0) + product.charAt(1);
	}

	public void delay() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
