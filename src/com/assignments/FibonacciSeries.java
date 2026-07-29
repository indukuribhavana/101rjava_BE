package com.assignments;

public class FibonacciSeries {
 
    public static void fibonacci(int n) {
        int a = 0, b = 1, c;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci Series:");
        fibonacci(n);
    }
}