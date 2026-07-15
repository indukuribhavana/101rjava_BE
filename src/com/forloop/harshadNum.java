package com.forloop;

public class harshadNum {
	public static boolean isHarshad(int num) {

        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        return num % sum == 0;
    }
	public static void main(String[] args) {
		int num = 18;

        if (isHarshad(num)) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
	}
}
