package com.forloop;

public class amstrongNum {
	public int getPower(int base, int exp) {
		int power = 1;
		for (int i = 1; i<=exp; i++) {
			power = power * base;
		}
		return power;
	}
	
	public int getCount(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}
	
	public boolean isAmstrong(int num) {
		int count = getCount(num);
		int temp = num;
		int sum = 0;
		while(num != 0) {
			int base  = num%10;
			sum = sum + getPower(base, count);
			num = num/10;
			
		}
		return temp == sum;
	}

	public static void main(String[] args) {
		amstrongNum obj = new amstrongNum();
		System.out.println(obj.isAmstrong(153));

	}

}
