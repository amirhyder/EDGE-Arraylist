package com.systems.ltd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void bubbleSortArrayList(List<Element> list) {
	    Element temp;
	    boolean sorted = false;

	    while (!sorted) {
	        sorted = true;
	        for (int i = 0; i < list.size()-1; i++) {
	            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
	                temp = list.get(i);
	                list.set(i, list.get(i + 1));
	                list.set(i + 1, temp);
	                sorted = false;
	            }
	        }
	    }
	}
	
	
	public static void main(String args[]) {
		
		List<Element> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
		    list.add(new Element(i));
		}

		// Move the elements to a random order
		Collections.shuffle(list);
		
		// Print list before sorting
		System.out.println("Before sorting");
		list.forEach(e -> System.out.print(e.getId() + ", "));

		// Sort the list
		bubbleSortArrayList(list);

		System.out.println();

		// Print sorted list
		System.out.println("After sorting");
		list.forEach(e -> System.out.print(e.getId() + ", "));
	}

}
