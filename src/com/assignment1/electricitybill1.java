package com.assignment1;

public class electricitybill1 {
	
	static int units;
	static int costPerUnit;
	static int total;
	
	public static void calculateBill() {
		units = 250;
		costPerUnit = 8;
		
		total = units * costPerUnit;
		
		System.out.println("Electricity Bill");
        System.out.println("Units Used : " + units);
        System.out.println("Cost Per Unit : " + costPerUnit);
	    System.out.println("Total Bill : " + total);

	}

	public static void main(String[] args) {
		calculateBill();

	}

}
