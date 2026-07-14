package com.assignment;

public class SI {
	int principle = 10000;
	int rate = 5;
	int time = 2;
	
	double interest = (principle * rate * time) / 100.0;
	public void calculateSI() {		
		System.out.println("Simple Interest Details");
		System.out.println("Principal : " + principle);
		System.out.println("Rate : " + rate);
		System.out.println("Time : " + time);
		System.out.println("Interest : " + interest);
		
	}

	public static void main(String[] args) {
		SI ass = new SI();
		ass.calculateSI();

	}

}
