package com.conditionalStatements;

public class employeeSalary {

	public static void main(String[] args) {
		int empSalary = 45000;
		System.out.println("Enter Employee Salary : " + empSalary);
		if(empSalary>50000) {
			System.out.println("Salary : " +empSalary);
			System.out.println("Bonus : " + empSalary*0.15);
			System.out.println("Total Salary : " + (empSalary + empSalary*0.15));
		}
		else if (empSalary>=30000 && empSalary<=50000) {
			System.out.println("Salary : " +empSalary);
			System.out.println("Bonus : " + empSalary*0.10);
			System.out.println("Total Salary : " + (empSalary + empSalary*0.10));
		}
		else if (empSalary<30000) {
			System.out.println("Salary : " +empSalary);
			System.out.println("Bonus : " + empSalary*0.05);
			System.out.println("Total Salary : " + (empSalary + empSalary*0.05));
		}
	}

}
