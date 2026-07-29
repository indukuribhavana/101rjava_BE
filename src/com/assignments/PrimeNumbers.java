package com.assignments;

public class PrimeNumbers {

    public static void primeNumbers(int start, int end) {

        for (int num = start; num <= end; num++) {

            if (num < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int start = 10;
        int end = 50;

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        primeNumbers(start, end);
    }
}