package com.scanners;

import java.util.Scanner;

public class Bank {

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

        // Create Account
        BankApplication account = new BankApplication(
                customerName,
                customerAddress,
                phoneNumber,
                balance);

        int option;

        do {

            System.out.println("\n**** Select an Option from Below ****");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your option [1-4] : ");
            option = sc.nextInt();

            switch (option) {

            case 1:
                System.out.print("Enter Withdrawal Amount : ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;

            case 2:
                System.out.print("Enter Deposit Amount : ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;

            case 3:
                account.showBalance();
                break;

            case 4:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid option");
            }

        } while (option != 4);

        sc.close();
    }
}