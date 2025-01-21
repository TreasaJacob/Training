package com.Obsquara.Training.Aggregation;

public class Student {
String name;
int id;
Address add;

	public Student(String name, int id, Address add) {
	super();
	this.name = name;
	this.id = id;
	this.add = add;
}
	public void display()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(add.housename);
		System.out.println(add.district);
		System.out.println(add.city);
		System.out.println(add.state);
		System.out.println(add.country);
		System.out.println(add.pin);
	}

	public static void main(String[] args) {
		Address add = new Address("villa", "alpy", "hh", "kerala", "india", 688506);
		Student obj = new Student("Treasa",101,add);
		obj.display();

	}

}
