package com.Obsquara.Training.Inheritance;

public class AdditionResult extends AddNumbers {
	public void div()
	{
	int v = super.add(50,50);
	System.out.println("Addition result : " + v);
	int res = v%10;
	System.out.println("Reminder when divided by 10 : " +res);
	if(res==0)
	{
		System.out.println("Result divisible by 10");
	}
	else
	{
		System.out.println("Result not divisible by 10");
	}
}

	public static void main(String[] args) {
		

		AdditionResult obj = new AdditionResult();
		obj.div();
		
		

	}
}


