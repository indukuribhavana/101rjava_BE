package com.constructors;

public class BankAccount {
	int accountNumber;
	String accountHolder;
	double balance;
	
	BankAccount(int accountNumber,String accountHolder,double balance) {
	this.accountNumber = accountNumber;
	this.accountHolder = accountHolder;
	this.balance = balance;
	}
	
	public int getAccNo() {
		return accountNumber;
	}
	
	public String getAccholder() {
		return accountHolder;
	}
	
	public double getbal() {
		return balance;
	}
	
	public void setAccNo(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setAccholder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void setbal(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance = balance+amount;
			System.out.println("Updated Balance : " + balance);
			System.out.println("Deposit successful");
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void withdraw(double amount) {
		if((balance >= amount) && (amount > 0)) {
			balance = balance - amount;
			System.out.println("Deducts amounts : " + balance);
			System.out.println("Withdraw successful");
		}
		else {
			System.out.println("Insufficient balance and does not withdraw.");
		}
		
	}



}
