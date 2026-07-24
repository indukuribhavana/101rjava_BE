package com.forloop;

public class automorphicNum {

	public static void main(String[] args) {
		int num = 25;
        int square = num * num;
        int temp = num;
        int digits = 1;

        while (temp >= 10) {
            digits = digits * 10;
            temp = temp / 10;
        }

        if (square % (digits * 10) == num) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is Not an Automorphic Number");
        }

	}

}
