package com.forloop;

public class revNum {

	public static void main(String[] args) {
		int rev  = 0;
		int i = 1234;
		while(i!=0) {
			int rem = i % 10;
			rev = rev * 10 +rem;
			i/=10;
		}
		System.out.println(rev);

	}

}
