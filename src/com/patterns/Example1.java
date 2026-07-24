package com.patterns;

public class Example1 {

	public static void main(String[] args) {
		int n = 5; {
			for(int i=1; i<=n; i++) {
				String str = "";
				for(int j=1; j<=n; j++) {
					str+="* ";
				}
				System.out.println(str);
			}
			}
	}
}
