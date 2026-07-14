package com.mobile;

public class Mobile {
	public static String brand = "Samsung";
	
	String model;
	int price;
	
	public static void brandInfo() {
		System.out.println("Brand : " + brand);
	}
	
	public void mobileInfo() {
		System.out.println("Mobile : " + model);
		System.out.println("Price : " + price);
	}
	
	public static void main (String [] args) {
		Mobile m1 = new Mobile();
		
		m1.model = "S24";
		m1.price = 80000;
		
		Mobile.brandInfo();
		m1.mobileInfo();
	}

}
