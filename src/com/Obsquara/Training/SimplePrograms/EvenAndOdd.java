package com.Obsquara.Training.SimplePrograms;

public class EvenAndOdd {

	public static void main(String[] args) {
		int evencount=0;
		int oddcount=0;
		for(int i=10;i<=20;i++)
		{
		if( i % 2==0)
		{
		evencount=evencount+1;
		}
		}
		System.out.println("Even number count : " +evencount);
		for(int i=10;i<=20;i++)
		{
		if( i % 2 !=0)
		{
		oddcount=oddcount+1;
		}
		}
		System.out.println("Odd number count : " +oddcount);


	}

}
