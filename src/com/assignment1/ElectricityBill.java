package com.assignment1;

public class ElectricityBill {
    int units;
	static int costPerUnit = 8;
	public void unitDetails() {
		units = 250;
		System.out.println( "******** Electricity Bill ********");
		System.out.println("Units Consumed : " + units);
		System.out.println("Cost Per Unit : " + costPerUnit);
	}
	
	public static void calculateBill(ElectricityBill bill) {
		int totalbill = (bill.units*costPerUnit);
		System.out.println("Total Bill : " + totalbill);
	}

	public static void main(String[] args) {
		ElectricityBill bill = new ElectricityBill();
		bill.unitDetails();
        calculateBill(bill);

	}

}
