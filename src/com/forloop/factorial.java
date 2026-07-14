package com.forloop;

public class factorial {
	public void calFac(int sum) {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int sum = 1;
		factorial obj = new factorial();
		for(int i = 1; i<=5; i++) {
			sum = sum * i;
		}
		obj.calFac(sum);

	}

}
