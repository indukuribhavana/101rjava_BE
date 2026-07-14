package com.ifStatements;

public class numberCheck {
	public String checkNumber(int num) {
		if(num > 0) {
			return "Positive";
		}
		else if (num < 0) {
			return "Negative";		
			}
		else {
			return "Zero";
		}
	}
	public static void main(String[] args) {
		numberCheck obj = new numberCheck();
		
		System.out.println("Check -5 : " + obj.checkNumber(-5));

	}

}
