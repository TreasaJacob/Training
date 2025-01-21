package com.Obsquara.Training.Aggregation;

public class Book {
	String bookName;
	int price;
    Author auth;
    
	public Book(String bookName, int price, Author auth) {
		this.bookName = bookName;
		this.price = price;
		this.auth = auth;
	}
	public void display()
	{
		System.out.println("Book Name : " + bookName);
		System.out.println("Price : "+price);
		System.out.println("Author name : "+auth.authorName);
		System.out.println("Place : " +auth.place);
		System.out.println("Age : "+auth.age);
	}
	

	public static void main(String[] args) 
	{
		Author auth = new Author("John f Kennedy","Uk",80);
		Book obj = new Book("Feathers",800,auth);
		obj.display();

	}

}
