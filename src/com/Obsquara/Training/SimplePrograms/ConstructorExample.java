package com.Obsquara.Training.SimplePrograms;

public class ConstructorExample {
int a ;
String name;

	public ConstructorExample(int a,String name) {
		this.a=a;
		this.name = name;	
		//System.out.println("Id : " +this.a);
		//System.out.println("Name : " +this.name);
		//this.print();
	}
	public void print() {
		System.out.println("Id : " +this.a);
		System.out.println("Name : " +this.name);
	}
	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample(101,"Treasa");
		ConstructorExample obj2 = new ConstructorExample(102,"Della");
        obj.print();
        obj2.print();
	}

}
