package com.variabless;

public class SchoolApplication {
	public static String schoolName = "Sri Chaitanya";
	
	String StudentName;
	int rollno;
	
	public static void main(String[] args) {
		
		int marks = 90;
		
		SchoolApplication stuname = new SchoolApplication();
		stuname.StudentName = "Bhavana";
		
		SchoolApplication roll = new SchoolApplication();
		roll.rollno = 6;
		
		System.out.println("School Name : " + schoolName);
		System.out.println("Student Name : " + stuname.StudentName);
		System.out.println("Roll No : " + roll.rollno);
		System.out.println("Marks : " + marks);
	}

}
