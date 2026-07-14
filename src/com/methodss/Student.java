package com.methodss;

public class Student {
	public static String collegeName = "ABC College";
	
    String studentName;
	int studentID;
	
	public static void collegeInfo() {
		System.out.println("collegeName : " + collegeName);
	}
	
	public void studentInfo() {
		System.out.println("studentID : " + studentID);
		System.out.println("studentName : " + studentName);
	}

	public static void main(String[] args) {
		
		Student stu = new Student();
		
		stu.studentID = 101;
		stu.studentName = "Ravi";
		
		Student.collegeInfo();
		stu.studentInfo();
	}

}
