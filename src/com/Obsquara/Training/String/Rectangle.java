package com.Obsquara.Training.String;

public class Rectangle extends Shape {
	public void draw() 
	{
		super.draw();
		System.out.println("This is rectangle");
	}
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.draw();
	}

}
