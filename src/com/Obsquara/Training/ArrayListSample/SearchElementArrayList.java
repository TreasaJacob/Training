package com.Obsquara.Training.ArrayListSample;

import java.util.ArrayList;
import java.util.List;

public class SearchElementArrayList {

	public static void main(String[] args) {
		
			List <String> s = new ArrayList <String> ();
			s.add("Orange");
			s.add("Apple");
			s.add("Grapes");
			s.add("Kiwi");
			s.add("Strawberry");
			System.out.println(s);
		if(s.contains("Strawberry"))
		{
			System.out.println("List contains Strawberry" );
		}
		else
		{
			System.out.println("List does not contains Strawberry" );
		}
	}

}
