package com.forloop;

public class sunnyNum {

	public static void main(String[] args) {
		int num = 8;
        int next = num + 1;
        boolean isSunny = false;

        for (int i = 1; i <= next; i++) {

            if (i * i == next) {
                isSunny = true;
                break;
            }
        }

        if (isSunny) {
            System.out.println(num + " is a Sunny Number");
        } else {
            System.out.println(num + " is Not a Sunny Number");
        }

	}

}
