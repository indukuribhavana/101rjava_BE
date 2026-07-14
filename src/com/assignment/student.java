package com.assignment;

public class student {
	int javaMarks, sqlMarks, htmlMarks, cssMarks, javascriptMarks; 
	int total;
	double percentage;
	public void readMarks() {
		javaMarks = 90;
		sqlMarks = 85;
		htmlMarks = 80;
		cssMarks = 95;
		javascriptMarks = 90;
	}
	
	public void calculatePercentage() {
		total = javaMarks + sqlMarks + htmlMarks + cssMarks + javascriptMarks;
		percentage = (total/500)*100;
		
		System.out.println("******** Student Report ******** ");
		System.out.println("Marks : ");
		System.out.println("Java : " + javaMarks);
		System.out.println("SQL : " + sqlMarks);
		System.out.println("HTML : " + htmlMarks);
		System.out.println("CSS : " + cssMarks);
		System.out.println("JavaScript : " + javascriptMarks);
	}
	
	public static void main(String [] args) {
		student stu = new student();
		stu.readMarks();
		stu.calculatePercentage();
	}
	

}
