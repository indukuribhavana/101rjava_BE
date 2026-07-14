package com.forloop;

public class oddNumbers {
	public void oddnum(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		oddNumbers obj = new oddNumbers();
		for(int i = 1; i<=10; i++) {
			if (i%2==1) {
				obj.oddnum(i);
			}
		}

	}

}
