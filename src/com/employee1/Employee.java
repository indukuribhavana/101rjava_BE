package com.employee1;

public class Employee {
	public int employeeId = 1001;
	public String employeeName = "Ravi";
	public int salary = 45000;
	
	public void displayEmployee() {
		System.out.println("Employee Details");
		System.out.println("-----------------");
		System.out.println("Employee ID : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Salary : " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
