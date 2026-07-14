package com.assignment1;

public class Employee {
	static int basicSalary = 30000;
	static int hra = 5000;
	static int da = 3000;
	public static void salaryDetails() {
		System.out.println("******** Employee Salary ********");
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("HRA : " + hra);
		System.out.println("DA : " + da);
	}
	
	public static void grossSalary() {
		int grossSalary = (basicSalary + hra + da);
		System.out.println("Gross Salary : " + grossSalary);
	}

	public static void main(String[] args) {
		salaryDetails();
		grossSalary();
	}

}
