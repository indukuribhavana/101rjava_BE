package com.switchCase;

public class calBill {

	public static void main(String[] args) {
		int units = 250;
		int bill;
		
		System.out.println("Enter Units Consumed : " + units);
		
		if (units <= 100) {
			bill = units * 2;
		}
		else if(units <=200 && units >=101) {
			bill = units * 3;
		}
		else {
			bill = units * 5;
		}
		System.out.println("Total Bill : " + bill);

	}

}
