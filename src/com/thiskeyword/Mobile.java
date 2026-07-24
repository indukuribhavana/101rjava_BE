package com.thiskeyword;

public class Mobile {
	String Brand;
	String Model;
	int Price;
	
	public String getbrand() {
		return Brand;
	}
	
	public String getmodel() {
		return Model;
	}
	
	public int getprice() {
		return Price;
	}
	
	public void setbrand(String Brand) {
		this.Brand = Brand;
	}
	
	public void setmodel(String Model) {
		this.Model = Model;
	}
	
	public void setprice(int Price) {
		this.Price = Price;
	}
	
	public void setMobileDetails() {
		Brand = "Samsung";
		Model = "S24";
		Price = 80000;
	}
	
	public void displayDetails() {
		System.out.println("Mobile Details");
		System.out.println("------------------");
		System.out.println("Brand : " + Brand);
		System.out.println("Model : " + Model);
		System.out.println("Price : " + Price);
	}

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.setMobileDetails();
		mob.displayDetails();

	}

}
