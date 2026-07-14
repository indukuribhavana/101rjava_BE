package com.ifStatements;

public class ifStatements {
	public boolean isdivisibleby5 (int num) {
		return num %5 == 0;
	}
	public static void main(String[] args) {
		ifStatements obj = new ifStatements(); 
		
		System.out.println("Is 15 is divisible by 5? " + obj.isdivisibleby5(15));

	}

}
