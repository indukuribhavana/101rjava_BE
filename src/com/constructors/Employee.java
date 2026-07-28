package com.constructors;

public class Employee {
	int empId;
	String empName;
	String empDesg;
	double Salary;
	int Rating;
	
	public Employee(int empId, String empName, String empDesg, double Salary, int Rating) {
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
		this.Salary = Salary;
		this.Rating = Rating;
	}
	
	public int getempid() {
		return empId;
	}
	
	public String getempname() {
		return empName;
	}
	
	public String getempdesg() {
		return empDesg;
	}
	
	public double getsal() {
		return Salary;
	}
	
	public int getrating() {
		return Rating;
	}
	
	public void setempid(int empId) {
		this.empId = empId;
	}
	
	public void setempname(String empName) {
		this.empName = empName;
	}
	
	public void setempdesg(String empDesg) {
		this.empDesg = empDesg;
	}
	
	public void setsal(double Salary) {
		this.Salary = Salary;
	}
	
	public void setrating(int Rating) {
		this.Rating = Rating;
	}
	
	public void promoteEmployee(String desg) {
		if (Rating >= 4) {
			Salary += (Salary * 0.20);
			System.out.println("Updated Salary : " + Salary);
			this.empDesg = desg;
		}
		else {
			System.out.println("No Promotion");
		}
	}
}
