package com.Obsquara.Training.Aggregation;

public class LineItem {
	int quantity;
	Product pro;

	public LineItem(int quantity, Product pro) {
		this.quantity = quantity;
		this.pro = pro;
	}
	public void print()
	{
		System.out.println("Quantity of the product : " + quantity);
		System.out.println("Product id : " + pro.id );
		System.out.println("Product name : " + pro.name );
		System.out.println("Product description : " + pro.description );
		
	}

	public static void main(String[] args) {
		Product pro = new Product(1001,"Pen","Blue color");
		LineItem obj = new LineItem(50,pro);
		obj.print();
	}

}
