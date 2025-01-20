package com.Obsquara.Training.Encapsulation;

public class User {

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.setPin(12356);
		int n = obj.getPin();
		System.out.println("Pin: " +n);
		

	}

}
