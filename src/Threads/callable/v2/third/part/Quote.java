package Threads.callable.v2.third.part;

import Threads.callable.v2.third.part.Discount.Code;

public class Quote {

	private final String shopName;
	private final double price;
	private final Discount.Code discountCode;

	public Quote(String shopName, double price, Code discountCode) {
		super();
		this.shopName = shopName;
		this.price = price;
		this.discountCode = discountCode;
	}
	
	public static Quote parse(String s) {
        String[] split = s.split(":");
        String shopName = split[0];
        String numberString = split[1].replace(',', '.');
        double price = Double.parseDouble(numberString);
        Discount.Code discountCode = Discount.Code.valueOf(split[2]);
        return new Quote(shopName, price, discountCode);
    }

	public String getShopName() {
		return shopName;
	}

	public double getPrice() {
		return price;
	}

	public Discount.Code getDiscountCode() {
		return discountCode;
	}

}
