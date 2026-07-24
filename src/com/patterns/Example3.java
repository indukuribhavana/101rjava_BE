package com.patterns;

public class Example3 {

	public static void main(String[] args) {
		int n = 4;
		for(int i=n; i>=1; i--) {
			String str = "";
			
			for(int j=i; j>=1; j--) {
				str+="* ";
			}
			System.out.println(str);
		}

	}

}
