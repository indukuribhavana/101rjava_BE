//package com.forloop;
//
//public class Example{
//	public static boolean isHarshad(int num) {
//
//        int temp = num;
//        int sum = 0;
//
//        while (temp != 0) {
//            int digit = temp % 10;
//            sum = sum + digit;
//            temp = temp / 10;
//        }
//
//        return num % sum == 0;
//    }
//
//	public static void main(String[] args) {
//		int num = 18;
//
//        if (isHarshad(num)) {
//            System.out.println("Harshad Number");
//        } else {
//            System.out.println("Not a Harshad Number");
//        }
//	}
//
//}

package com.forloop;

public class Example {
	public static boolean isUgly(int num) {
		if(num <= 0) {
			return false;
		}
		while(num%2==0) {
			num = num/2;
		}
		while(num%3==0) {
			num = num/3;
		}
		while(num%5==0) {
			num = num/5;
		}
		return num == 1;
	}

	public static void main(String[] args) {
		int num = 14;
		if (isUgly(num)) {
			System.out.println("Ugly Number");
		}
		else {
			System.out.println("Not an Ugly Number");
		}
	}

}