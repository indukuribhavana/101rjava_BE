package com.forloop;

public class neonNum {
	public static boolean isNeon(int num) {
		int temp = num;
		int square = num*num;
		int sum = 0;
		while(square != 0) {
			int rem = square%10;
			sum = rem+sum;
			square/=10;
		}
		return sum == temp;
	}
	public static void main(String[] args) {
		boolean result = isNeon(9);
		System.out.println(result);
	}

}
