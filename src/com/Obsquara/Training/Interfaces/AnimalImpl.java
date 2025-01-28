package com.Obsquara.Training.Interfaces;

public class AnimalImpl implements Carnivores,Herbivores {
	public void eat() {
		System.out.println("Eat other animals");
	}
	public void planteat() {
		System.out.println("Eat plants only");
	}
	

	public static void main(String[] args) {
		AnimalImpl obj = new AnimalImpl();
		obj.eat();
		obj.planteat();
		System.out.println("Example of a carnivore : " +carnivore);

	}

}
