package com.constructors;

public class BankProcessor {

    public static void main(String[] args) {


        BankAccount account = new BankAccount(1001, "Srujan", 10000);


        System.out.println("Account Number : " + account.getAccNo());
        System.out.println("Account Holder : " + account.getAccholder());
        System.out.println("Current Balance : ₹" + account.getbal());


        account.deposit(5000);

        account.withdraw(500);

    }
}