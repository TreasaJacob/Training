package com.Obsquara.Training.Interfaces;

public class SampleImpl implements A,B {
	@Override
	public void draw() {
		System.out.println("Drawing");
		
	}

	public static void main(String[] args) {
		SampleImpl obj = new SampleImpl();
		obj.draw();

	}

	

}
