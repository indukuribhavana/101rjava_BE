package com.get_set;

public class Employee {
	
	String employeeName;
	int basicSalary;
	
	public void setemployeeName(String name) {
		employeeName = name;
	}
	
	public String getemployeeName() {
		return employeeName;
	}
	
	public void setbasicSalary(int salary) {
		basicSalary = salary;
	}
	
	public int getbasicSalary() {
		return basicSalary;
	}
	
	public double calculateHRA() {
		return basicSalary * 0.20;
	}
	
	public double calculateDA() {
		return basicSalary * 0.10;
	}
	
	public double calculateGrossSalary() {
		return basicSalary + calculateHRA() + calculateDA();
	}
	
	public void displaySalaryDetails() {
		System.out.println("Employee Name : " + getemployeeName());
		System.out.println("Basic Salary : " + getbasicSalary());
		System.out.println("HRA : " + calculateHRA());
		System.out.println("DA : " + calculateDA());
		System.out.println("Gross Salary : " + calculateGrossSalary());
	}

}
