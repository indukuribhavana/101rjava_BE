package com.forloop;

public class calMarks {

    public void calculateMarks() {

        int total = 0;
        int[] marks = {90, 85, 80, 95, 88};

        for (int i = 0; i < 5; i++) {
            total = total + marks[i];
        }

        double average = (double) total / 5;

        System.out.println("Total Marks : " + total);
        System.out.println("Average Marks : " + average);
    }

    public static void main(String[] args) {
        calMarks obj = new calMarks();
        obj.calculateMarks();
    }
}