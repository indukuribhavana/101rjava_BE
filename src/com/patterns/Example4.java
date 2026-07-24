package com.patterns;

public class Example4 {

	public static void main(String[] args) {
		int n = 4;
		for(int i=1; i<=n; i++) {
			String str = "";
			
			for(int j=1; j<=i; j++) {
				str+="* ";
			}
			System.out.println(str);
		}
		

	}

}
