package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterate {

	public static void main(String[] args) 
	{
		
        ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Java");
		list1.add("Python");
		list1.add("Dotnet");
		
		
		Iterator<String> itr = list1.iterator();
		
		System.out.println("Using iterator");
		while(itr.hasNext())
		{
			
		    System.out.println(itr.next());	
		}
		
		System.out.println("Using list Iterator");
		
		ListIterator<String> litr = list1.listIterator(list1.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		
	}

}
