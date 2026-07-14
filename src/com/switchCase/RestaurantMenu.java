package com.switchCase;

public class RestaurantMenu {

	public static void main(String[] args) {
		int choice = 2;
		
		System.out.println("******** MENU ********");
		System.out.println("1.Pizza");
		System.out.println("1.Burger");
		System.out.println("1.Sandwich");
		System.out.println("1.Coffee");
		System.out.println("1.Exit"); 
		
		System.out.println("Enter Your Choice : " + choice);
		
		switch(choice) {
		case 1: 
			System.out.println("You Selected : Pizza");
			System.out.println("Prize : 250");
			break;
			
		case 2: 
			System.out.println("You Selected : Burger");
			System.out.println("Prize : 150");
			break;	
			
		case 3: 
			System.out.println("You Selected : Sandwich");
			System.out.println("Prize : 120");
			break;	
			
		case 4: 
			System.out.println("You Selected : Coffee");
			System.out.println("Prize : 80");
			break;	
			
		default:	
			System.out.println("Invalid Choice");
		}
	}

}
