package com.assignment;

public class students {
	int javaMarks, sqlMarks, htmlMarks, cssMarks, jsMarks;
	int total;
	double percentage;
	public void calculatePercentage() {
		javaMarks = 90;
		sqlMarks = 90;
		htmlMarks = 90;
		cssMarks = 90;
		jsMarks = 90;
		
		total = (javaMarks + sqlMarks + htmlMarks + cssMarks + jsMarks);
		percentage = (total/500.0)*100;
		
		System.out.println("Student Percentage Report");
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage);
		
	}
	
	public static void main (String [] args) {
		students stu = new students();
		
		stu.calculatePercentage();
	}

}
