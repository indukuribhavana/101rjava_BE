package com.get_set;

public class student {
	String studentName;
	int javaMarks;
	int sqlMarks;
	int webMarks;
	
	public void setstudentname(String name) {
		studentName = name;
	}
	
	public String getstudentName() {
		return studentName;
	}
	
	public void setjavaMarks (int java) {
		javaMarks = java;
	}
	
	public int getjavaMarks() {
		return javaMarks;
	}
	
	public void setsqlMarks(int sql) {
		sqlMarks = sql;
	}
	
	public int getsqlMarks() {
		return sqlMarks;
	}
	
	public void setwebMarks(int web) {
		webMarks = web;
	}
	
	public int getwebMarks() {
		return webMarks;
	}
	
	public int calculateTotal() {
		return (javaMarks + sqlMarks + webMarks);
	}
	
	public double calculatePercentage() {
        return calculateTotal() / 3.0;
    }


	public void displayStudentDetails() {
		System.out.println("Student Name : " + getstudentName());
		System.out.println("Total : " + calculateTotal());
		System.out.println("Percentage : " + calculatePercentage());
	}

}
