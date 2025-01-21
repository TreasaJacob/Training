package com.Obsquara.Training.Aggregation;

public class StudentDetails {
	String name;
	int id;
	StudentAddress add;
	
	public StudentDetails(String name, int id, StudentAddress add) {
		this.name = name;
		this.id = id;
		this.add = add;
	}

	
	
	
	public void print()
	{
		System.out.println("Name :" +name);
	System.out.println("Id : " +id);
	System.out.println("Address : " +add.housename +add.city +add.district + add.state +add.country +add.pincode);
	}

	public static void main(String[] args) {
	
	StudentAddress add = new StudentAddress("jewel home","changanacherry","kottayam","kerala","India",688506);
	StudentDetails obj = new StudentDetails("Treasa",111,add);
	obj.print();
	}

}
