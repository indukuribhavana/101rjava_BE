package com.switchCase;

public class calculator {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 5;
		char operator = '*';
		
		System.out.println("Enter First Number : " + num1);
		System.out.println("Enter Second Number : " + num2);
		System.out.println("Enter Operator : " + operator);
		
		switch (operator) {
		case '+' :
			System.out.println("Result : " + num1 + num2);
			break;
			
		case '-' :	
			System.out.println("Result : " + (num1 - num2));
			break;
			
		case '*' :	
			System.out.println("Result : " + (num1 * num2));
			break;	
			
		case '/' :	
			if (num2 != 0) {
				System.out.println("Result : " + (num1/num2));
			}
			else {
				System.out.println("Division by 0 is not possible");
			}
			
		case '%' :	
			if (num2 != 0) {
				System.out.println("Result : " + (num1%num2));
			}
			else {
				System.out.println("Division by 0 is not possible");
			}	
		}

	}

}
