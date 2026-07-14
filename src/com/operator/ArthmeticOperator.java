package com.operator;

public class ArthmeticOperator {
	static int basicSalary = 25000;
	static int HRA = 5000;
	static int DA = 3000;
	static int grossSalary = basicSalary + HRA + DA;
	
	public static void main(String [] args) {
		
		ArthmeticOperator obj = new ArthmeticOperator();
		
		System.out.println("Gross Salary > 50000 : " + (grossSalary > 50000));
		
		grossSalary+=5000;
		System.out.println("Updated Gross Salary : " + grossSalary);
		
	}

}