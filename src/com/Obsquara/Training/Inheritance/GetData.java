package com.Obsquara.Training.Inheritance;

import java.util.Scanner;

public class GetData {
	Scanner sc = new Scanner(System.in);
	int basicpay,deduction,bonus;
	public void getdata()
	{
		
		System.out.println("Enter the basicpay : ");
		basicpay = sc.nextInt();
		System.out.println("Enter the deduction : ");
		deduction = sc.nextInt();
		System.out.println("Enter the bonus : ");
		bonus =sc.nextInt();	
		
	}

}
