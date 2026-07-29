package com.assignments;

public class countDigits {

    public static int countDigits(int n) {

        if (n < 0) {
            n = -n;
        }

        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Number of digits = " + countDigits(num));
    }
}