package com.thiskeyword;

public class Employee {
	int EmployeeId;
	String EmployeeName;
	int Salary;
	
	public int getempid() {
		return EmployeeId;
	}
	
	public String getempName() {
		return EmployeeName;
	}
	
	public int getsal() {
		return Salary;
	}
	
	public void setempid(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}
	
	public void setempName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}
	
	public void setsal(int Salary) {
		this.Salary = Salary;
	}
	
	public void setEmployeeDetails() {
		EmployeeId = 1001;
		EmployeeName = "Ravi";
		Salary = 45000;
	}
	
	public void displayDetails() {
		System.out.println("Employee Details");
		System.out.println("------------------");
		System.out.println("Employee Id : " + EmployeeId);
		System.out.println("Employee Name : " + EmployeeName);
		System.out.println("Salary : " + Salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmployeeDetails();
		emp.displayDetails();

	}

}
