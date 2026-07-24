package com.student;

public class Student {
	int id;
	String name;
	String course;
public void setDeatils() {
	id = 101;
	name = "Rahul";
	course = "Java Full Stack";
		
	}
	
	public void displayDetails() {
		System.out.println("Stuent Details");
		System.out.println("---------------");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Course : " + course);
		
	}


	public static void main(String[] args) {
		

	}

}
