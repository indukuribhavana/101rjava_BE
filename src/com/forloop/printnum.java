package com.forloop;

public class printnum {
	public void printNum(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		printnum obj = new printnum();
		for(int i = 1; i<=20; i++) {
			obj.printNum(i);
		}
	}
}
