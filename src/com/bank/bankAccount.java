package com.bank;

public class bankAccount {
	public String bankName = "SBI";
	private double balance = 50000.0;
	protected String branchName = "Hyderabad";
	int accountNumber = 123456;
	
	public void bankName() {
		System.out.println("Bank name : " + bankName);
	}
	
	protected void Branchname() {
		System.out.println("Branch name : " + branchName);
	}
	
	void AccountNumber() {
		System.out.println("Account Number : " + accountNumber);
	}
	
	private void Balance() {
		System.out.println("Balance : " + balance);
	}

	public static void main(String[] args) {
		bankAccount obj = new bankAccount();
		obj.bankName();
        obj.Branchname();
        obj.AccountNumber();
        obj.Balance();
	}

}
