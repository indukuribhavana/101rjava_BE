package com.forloop;

public class printNumbers {
	public void printNum(int num, int val) {
		System.out.println(num + "+" + val + "=" + num * val);
	}

	public static void main(String[] args) {
		printNumbers obj = new printNumbers();
		for(int i=1; i<=10; i++) {
				obj.printNum(5,i);
		}

	}

}
