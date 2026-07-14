package com.get_set;

public class StudentApp {

	public static void main(String[] args) {
		student stu = new student();
		
		stu.studentName = "Ravi";
		stu.javaMarks = 90;
		stu.sqlMarks = 85;
		stu.webMarks = 95;
		
		stu.displayStudentDetails();

	}

}
