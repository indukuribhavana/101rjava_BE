package com.thiskeyword;

public class Student {
	int StudentId;
	String StudentName;
	String course;
	
	public int getStudentID() {
		return StudentId;
	}
	
	public String getStudentName() {
		return StudentName;
	}
	
	public String getcourse() {
		return course;
	}
	
	public void setStudentID(int StudentId) {
		this.StudentId = StudentId;
	}
	
	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}
	
	public void setcourse(String course) {
		this.course = course;
	}
	
	public void setDetails() {
		StudentName = "Rahul";
		StudentId = 101;
		course = "Java Full Stack";
	}
	
	public void displayDeatails() {
		System.out.println("Student Details");
		System.out.println("-----------------");
		System.out.println("Student ID : " + StudentId);
		System.out.println("Student Name : " + StudentName);
		System.out.println("Course : " + course);
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setDetails();
		stu.displayDeatails();
	}

}
