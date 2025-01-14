package com.Obsquara.Training.String;

public class StringJoin {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = " Dear Students";
		String s2 = s.concat(s1);
		System.out.println("Concatenated string :" +s2 );
		StringLength obj = new StringLength();
        obj.print();
	}

}
