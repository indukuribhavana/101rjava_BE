package com.scanners;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Age : ");
		String gender = sc.next();
		
		if((age >=23 && gender.equals("female")) || (age >= 27 && gender.equals("male"))) {
				System.out.println("Voting");
		}
		else {
			System.out.println("!Voting");
		}
		sc.close();
		

	}

}
