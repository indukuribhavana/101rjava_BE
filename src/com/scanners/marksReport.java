package com.scanners;

import java.util.Scanner;

public class marksReport {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Java Marks : " );
		int java = sc.nextInt();

		System.out.println("Enter SQL Marks : " );
		int sql = sc.nextInt();

		System.out.println("Enter HTML Marks : " );
		int html = sc.nextInt();

		System.out.println("Enter CSS Marks : " );
		int css = sc.nextInt();
		
		System.out.println("Enter JavaScript Marks : " );
		int js = sc.nextInt();
		
		int total = java + sql + html + css + js;
		double avg = (total)/5;
		double percentage = (total / 500.0) * 100;
		
		System.out.println("Total Marks : " + total);
		System.out.println("Average : " + avg);
		System.out.println("Percentage : " + percentage + "%");
		
		
	}

}
