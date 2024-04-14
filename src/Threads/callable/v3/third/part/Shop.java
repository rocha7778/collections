package Threads.callable.v3.third.part;

import java.util.Random;

public class Shop {
	
	private String name;
	private Random random = new Random();
	
	public Shop(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice(String name) {
		return calculatePrice(name);
	}
	
	public String  getPriceNewFormat(String name) {
		 double price = calculatePrice(name);
		 int sizeListOfCode = Discount.Code.values().length;
		 Discount.Code code = Discount.Code.values()[random.nextInt(sizeListOfCode)];
		 return String.format("%s:%.2f:%s",name, price, code);
	}
	
	
	private double calculatePrice(String nameOfProduct) {

		delay();
		Random random = new Random();

		return random.nextDouble() * nameOfProduct.charAt(0) + nameOfProduct.charAt(1);
	}
	
	public void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + "]";
	}
	
	

}
