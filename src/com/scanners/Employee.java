package com.scanners;

import java.util.Scanner;

public class Employee {
	int empId;
	String empname;
	double sal;
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id : " );
		int empId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee Name : " );
		String empname = sc.next();

		System.out.println("Enter Salary : " );
		double sal = sc.nextDouble();
		
		double hra = sal * 20 / 100;
        double da = sal * 10 / 100;
        double grossSalary = sal + hra + da;
        
        
    		System.out.println("Employee Details");
    		System.out.println("-------------------");
    		System.out.println("Employee ID : " + empId);
    		System.out.println("Employee Name : " + empname);
    		System.out.println("Basic Salary : " + sal);
    		System.out.println("Gross Salary : " + grossSalary);
	}

}
