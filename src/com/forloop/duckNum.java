package com.forloop;

public class duckNum {

	public static void main(String[] args) {
		int num = 1203;
        int temp = num;
        boolean isDuck = false;

        while (temp != 0) {

            int digit = temp % 10;

            if (digit == 0) {
                isDuck = true;
                break;
            }

            temp = temp / 10;
        }

        if (isDuck) {
            System.out.println(num + " is a Duck Number");
        } else {
            System.out.println(num + " is Not a Duck Number");
        }

	}

}
