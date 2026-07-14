package com.variables;

public class Employee {
	public static int companyCode = 101;
	public static float empBonus = 5000;
	
	int empId;
	double empSalary;
	

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empId = 1;
		emp1.empSalary = 25000;
		
		Employee emp2 = new Employee();
		emp2.empId= 2;
		emp2.empSalary = 20000;
		
		System.out.println("Employee 1 Company code : " + companyCode);
		System.out.println("Employee 1 Bonus : " + empBonus);
		System.out.println("Employee 1 ID : " + emp1.empId);
		System.out.println("Employee 1 salary : " + emp1.empSalary);
		
		System.out.println("Employee 2 Company code : " + companyCode);
		System.out.println("Employee 2 Bonus : " + empBonus);
		System.out.println("Employee 2 ID : " + emp2.empId);
		System.out.println("Employee 2 salary : " + emp2.empSalary);
		

	}

}
