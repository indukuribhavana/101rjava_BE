package com.scanners;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int attempts = 0;
		do {
			System.out.println("Enter userName : ");
			String userName = sc.nextLine();
			
			System.out.println("Enter Password : ");
			String Password = sc.nextLine();
			if(userName.equals("admin@123") && Password.equals("Password")) {
				System.out.println("Login Success");
				break;
			}
			else {
				attempts++;
				System.out.println("You have a " + (attempts-3) + "left");
			}
		}while(attempts<3);
		
		if(attempts == 3) {
			System.out.println("Try after 24hrs");
		}

	}

}
