package com.Obsquara.Training.Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("Treasa");
		String s= obj.getName();
		System.out.println("Name : " +s);
		obj.setId(123);
		int id = obj.getId();
		System.out.println("ID: " +id);
		
	}

}
