package com.ifStatements;

public class vote {
	public boolean canVote(int age) {
		if (age> 18) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		vote obj = new vote();
		System.out.println("Can Vote (Age 20) : " + obj.canVote(20));

	}

}
