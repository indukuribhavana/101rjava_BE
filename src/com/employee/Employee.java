package com.employee;

public class Employee {
	public static String companyName = "Infosys";
	
	public int employeeId;
	public String employeeName;
	
	public static void companyInfo() {
		System.out.println("Company Name : " + companyName);
	}
	
	public void employeeInfo() {
		System.out.println("Employee ID : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.employeeId = 1001;
		emp.employeeName = "Ram";
		
		Employee.companyInfo();
        emp.employeeInfo();

	}

}
