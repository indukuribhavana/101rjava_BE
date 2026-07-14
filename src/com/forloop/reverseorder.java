package com.forloop;

public class reverseorder {
	public void printReverseOrder(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		reverseorder obj = new reverseorder();
		for(int i = 10; i>=1; i--) {
			obj.printReverseOrder(i);
		}

	}

}
