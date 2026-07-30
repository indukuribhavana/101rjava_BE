package com.scanners;

import java.util.Scanner;

public class BankProcessor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name : ");
        String customerName = sc.nextLine();

        System.out.print("Enter Customer Address : ");
        String customerAddress = sc.nextLine();

        System.out.print("Enter Customer Phone Number : ");
        long phoneNumber = sc.nextLong();

        System.out.print("Enter Initial Deposit Amount : ");
        double balance = sc.nextDouble();

        // Create object
        BankApplication account = new BankApplication(
                customerName,
                customerAddress,
                phoneNumber,
                balance);

        // Show Initial Balance
        account.showBalance();

        // Deposit
        System.out.print("Enter Deposit Amount : ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdraw
        System.out.print("Enter Withdrawal Amount : ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Show Final Balance
        account.showBalance();

        sc.close();
    }
}