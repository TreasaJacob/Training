package com.Obsquara.Training.ArrayListSample;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementArrayList {

	public static void main(String[] args) {
		List <String> s = new ArrayList <String> ();
		s.add("Orange");
		s.add("Apple");
		s.add("Grapes");
		s.add("Kiwi");
		s.add("Strawberry");
		System.out.println(s);
		s.remove(2);
		System.out.println(s);
	}

}
