package com.calcultor;

public class calculator {
	int a = 20;
	int b = 10;
	int addition;
	int subtraction;
	int multiplication;
	int division = a/b;;
	
	public void add() {
		addition = a + b;
		System.out.println("Addition : " + addition);
	}
	
	public void sub() {
		subtraction = a - b;
		System.out.println("Subtraction : " + subtraction);
	}
	
	public void mul() {
		multiplication = a * b;
		System.out.println("Multiplication : " + multiplication);
	}
	
	public void div() {
		division = a / b;
		System.out.println("Division : " + division);
	}

	public static void main(String[] args) {
		

	}

}
