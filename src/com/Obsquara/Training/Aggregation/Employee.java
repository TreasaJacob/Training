package com.Obsquara.Training.Aggregation;

public class Employee {
	String name;
	int id;
	Car ecar;
	Bike ebike;
	public Employee(String name, int id, Car ecar, Bike ebike) {
		this.name = name;
		this.id = id;
		this.ecar = ecar;
		this.ebike = ebike;
	}
	public void display()
	{
		System.out.println("Employee Name : " + name);
		System.out.println("Id : " + id);
		System.out.println("Car Details : " +ecar.color + ecar.carName + ecar.regNo);
		System.out.println("Bike Details : " +ebike.bikeName + ebike.regNo );
	}


	public static void main(String[] args) {
		Car ecar = new Car("Black","Tata Altroz","KL-33M-7080");
		Bike ebike = new Bike("Himalayan","Kl-66-82929");
		Employee obj = new Employee("Alex",505,ecar,ebike);
		obj.display();
	}

}
