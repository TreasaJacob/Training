package com.Obsquara.Training.String;

public class DuplicateStringArray {

	public static void main(String[] args) {
    String[] a = {"Hello", "Hello", "Hai", "Helen"};
        
        // Loop through the array to check for duplicates
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equalsIgnoreCase(a[j])) {
                    System.out.println(a[i]);
                   // break; // Break after finding the first duplicate for this string
                }
            }
        }
	}
}
    


