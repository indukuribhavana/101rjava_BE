package com.assignments;

public class Factors {

    public static void factors(int n) {

        if (n < 0) {
            n = -n; 
        }

        System.out.print("Factors: ");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int num = 36;

        System.out.println("Number = " + num);
        factors(num);
    }
}