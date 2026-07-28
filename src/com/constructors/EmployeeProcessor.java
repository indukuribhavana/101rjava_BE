package com.constructors;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee emp = new Employee(201, "Bob", "Developer", 50000.0, 5);
			
			System.out.println("Employee Id : " + emp.getempid());
			System.out.println("Employee Name : " + emp.getempname());
		    System.out.println("Employee Designation : " + emp.getempdesg());
		    System.out.println("Employee Salary : " + emp.getsal());
		    System.out.println("Employee Rating : " + emp.getrating());
		    
		    emp.promoteEmployee("Senior Developer");
		    System.out.println("Updated Designation : " + emp.getempdesg());

	}

}
