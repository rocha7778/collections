package Threads.callable.v1;

import java.util.List;

import Threads.callable.v1.DiscountCode.Code;

public class TestList {
	
	private  List<Shop> shops = ShopsList.shops;
	private  double result = Math.min(shops.size(), 100);
	
	
	
	

	public List<Shop> getShops() {
		return shops;
	}





	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}





	public double getResult() {
		return result;
	}





	public void setResult(double result) {
		this.result = result;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestList t = new TestList();
		
		System.out.println(""+t.getResult());
		
		Code discount = DiscountCode.Code.DIAMOND;
		
		System.out.println(discount);
		
		
		

	}

}
