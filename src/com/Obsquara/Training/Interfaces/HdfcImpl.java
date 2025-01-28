package com.Obsquara.Training.Interfaces;
import java.util.Scanner;

public class HdfcImpl implements RBI {
	public void recurringDeposit(int a,int d)
	{
	float totalamount = a*(1+d*rate);//since rate declared in interface ,we can access it directly since implemented 
	System.out.println("Total amount getting after  " +d+  " years is : "+totalamount);
	

  }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt = sc.nextInt();
		System.out.println("Enter duration");
		int duration = sc.nextInt();
		HdfcImpl obj = new HdfcImpl();
		obj.recurringDeposit(amt,duration);
		
		
	}
		

}
