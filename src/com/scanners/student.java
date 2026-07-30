package com.scanners;

import java.util.Scanner;

public class student {

    int studentId;
    String studentName;
    int age;
    String course;

    public void getStudentDetails(int studentId, String studentName, int age, String course) {

        System.out.println("Student Details");
        System.out.println("--------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID : ");
        int studentId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Student Name : ");
        String studentName = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Course : ");
        String course = sc.nextLine();

        student obj = new student();

        obj.getStudentDetails(studentId, studentName, age, course);

        sc.close();
    }
}