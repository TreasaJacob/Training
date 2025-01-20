package com.Obsquara.Training.Inheritance;

public class TotalSalary extends Calculate {
	int totalsalary;
	public void totalsal()
	{
		
		totalsalary =basicpay+hra-pf-deduction+bonus ;
		System.out.println("Total salary :" +totalsalary);
		
	}

	public static void main(String[] args) {
		TotalSalary obj1 = new TotalSalary();
		obj1.getdata();
		obj1.cal();
		obj1.totalsal();
		
		System.out.println("Salary Slip");
		System.out.println("Basic pay:" +obj1.basicpay);
		System.out.println("HRA:" + obj1.hra);
		System.out.println("PF:" + obj1.pf);
		System.out.println("Deduction:" + obj1.deduction);
		System.out.println("Bonus:" + obj1.bonus);
		System.out.println("Total salary :" +obj1.totalsalary);	

	}

}
