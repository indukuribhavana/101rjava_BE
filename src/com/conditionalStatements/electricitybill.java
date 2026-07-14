package com.conditionalStatements;

public class electricitybill {

	public static void main(String[] args) {
		int billAmount = 6000;
		System.out.println("Enter Bill Amount : " + billAmount);
		System.out.println("Original Bill : " + billAmount);
		if (billAmount > 5000) {
			System.out.println("Discount : " + billAmount*0.20);
			System.out.println("Final Amount : " + (billAmount-(billAmount*0.20)));
		}
		else if (billAmount > 3000) {
			System.out.println("Discount : " + billAmount*0.10);
			System.out.println("Final Amount : " + (billAmount-(billAmount*0.10)));
		}
		else {
			System.out.println("No Discount");
		}

	}

}
