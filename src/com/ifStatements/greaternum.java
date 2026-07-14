package com.ifStatements;

public class greaternum {
	public int findGreater(int num1,int  num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
		
	}
	public static void main(String[] args) {
		greaternum obj = new greaternum();
		
		System.out.println("Greater Number(10,25) : " + obj.findGreater(10,25));

	}

}
