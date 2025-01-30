package com.Obsquara.Training.ArrayListSample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List <String> s = new ArrayList <String> ();
		s.add("Blue");
		s.add("Red");
		s.add("Yellow");
		Iterator <String> it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
