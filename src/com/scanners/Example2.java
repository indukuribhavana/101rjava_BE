package com.scanners;

import java.util.Scanner;

public class Example2 {
	public void getData(String name, int id, long phnNo, String street, int pincode) {
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(phnNo);
		System.out.println(street);
		System.out.println(pincode);
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name = sc.next();
		
		System.out.println("Enter id : ");
		byte id = sc.nextByte();
		
		System.out.println("Enter phnNo : ");
		long phnNo = sc.nextLong();
		
		System.out.println("Enter street : ");
		String street = sc.next();
		
		System.out.println("Enter pincode : ");
        int pincode = sc.nextInt();
        
        new Example2().getData(name, id, phnNo, street, pincode);
        
        sc.close();
	}

}
