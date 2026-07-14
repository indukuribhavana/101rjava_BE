package com.forloop;

public class sumOfNum {
	public void calSum(int sum) {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		sumOfNum obj = new sumOfNum();
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum = sum + i;
		}
		obj.calSum(sum);

	}

}
