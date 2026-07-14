package com.forloop;

public class ATM {

    public static void main(String[] args) {
    	int bal = 10000;
    	System.out.println("******** ATM MENU ********");
    	System.out.println("Exit Enter Your Choice : 1");
    	System.out.println("Current Balance : " + bal);
    	
    	int deposit = 2000;
    	System.out.println("Exit Enter Your Choice : 2");
    	System.out.println("Enter Deposit Amount : " + deposit);
    	System.out.println("Amount Deposited Successfully.");
    	bal = bal + deposit;
    	System.out.println("Current Balance : " + bal);
        
    	int withdraw = 3000;
    	System.out.println("Exit Enter Your Choice : 3");
    	System.out.println("Enter withdraw Amount : " + withdraw);
    	if(bal <= withdraw) {
    		System.out.println("Withdraw Successful"); }
    	
    	System.out.println("Current Balance : " + (bal-withdraw));
    	
    	System.out.println("Exit Enter Your Choice : 4");
    	System.out.println("Thank You for Using Our ATM!");
    }
}