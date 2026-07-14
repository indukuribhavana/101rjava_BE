package com.operators;

public class rightshift {

	public static void main(String[] args) {
		int number = 40;
		int shiftPositions = 2;
		
		System.out.println("Enter Number : " + number);
		System.out.println("Enter Shift Positions : " + shiftPositions);
		System.out.println("Result After Right Shift : " + (number >> shiftPositions));
	}

}
