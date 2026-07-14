package com.forloop;

public class printtable {

    public void Table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {

        int num = 7; 

        System.out.println("Enter a Number : " + num);

        printtable obj = new printtable();
        obj.Table(num);
    }
}