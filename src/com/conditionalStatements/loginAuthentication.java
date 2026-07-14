package com.conditionalStatements;

public class loginAuthentication {

	public static void main(String[] args) {
		String userName = "admin";
		String password = "1234";		
		
		if(userName == "admin" && password == "1234") {
			System.out.println("Enter Username : " + userName);
			System.out.println("Enter Password : " + password);
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Invalid Username or Password");
		}
	}

}
