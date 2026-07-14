package com.conditionalStatements;

public class ATM {

	public static void main(String[] args) {
		int accountBalance = 10000;
		int withdrawalAmount = 2500;
		
		if(withdrawalAmount <= accountBalance) {
			System.out.println("Enter Account Balance : " + accountBalance);
			System.out.println("Enter withdrawal Amount : " + withdrawalAmount);
			System.out.println("Transaction Successful");
			System.out.println("Remaining Balance : " + (accountBalance-withdrawalAmount));
		}
		else {
			System.out.println("Insufficient Balance.");
		}

	}

}
