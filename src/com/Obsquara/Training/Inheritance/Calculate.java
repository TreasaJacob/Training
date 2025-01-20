package com.Obsquara.Training.Inheritance;

public class Calculate extends GetData{
	int hra,pf,c;
	public void cal()
	{
	     hra= (5*basicpay)/100;
		 pf = (20*basicpay)/100;
		 System.out.println("HRA : " +hra);
		 System.out.println("PF :" +pf);
	}
	
	
}
