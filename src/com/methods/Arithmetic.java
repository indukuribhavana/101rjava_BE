package com.methods;

public class Arithmetic {
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public static void mul(int a , int b) {
		System.out.println(a*b);
	}
	
	public static void div(int a, int b) {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		add(10,20);
		sub(30,20);
		mul(10,20);
		div(20,10);
	}
}
