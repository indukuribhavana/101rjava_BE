package com.operators;

public class bitwiseOperator {

	public static void main(String[] args) {
		int firstNumber = 12;
		int secondNumber = 10;
		
		System.out.println("Enter First Number : " + firstNumber);
		System.out.println("Enter Second Number : " + secondNumber);
		System.out.println("Bitwise AND : " + (firstNumber & secondNumber));
		System.out.println("Bitwise OR : " + (firstNumber | secondNumber));
		System.out.println("Bitwise XOR : " + (firstNumber ^ secondNumber));
	}

}
