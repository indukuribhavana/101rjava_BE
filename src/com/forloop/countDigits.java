package com.forloop;

public class countDigits {

	public static void main(String[] args) {
		int num = 987654;
		int temp = num;
		int count = 0;
		
		while(num !=0) {
			count++;
			num = num/10;		
		}
		System.out.println("Enter a Number : " + temp);
		System.out.println("Total Digits : " + count);
	}
	

}
