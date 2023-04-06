package com.vectors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TraverseVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String>  v = new Vector<>(); 
		
		v.add("Red ");
		v.add("Yellow");
		v.add("Blue");
		
		v.add("Violet ");
		v.add("Indigo");
		v.add("Purple");
	
		
		System.out.println();
		//using Iterator
		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		//using ListIterator
		ListIterator<String> litr = v.listIterator(v.size());
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		System.out.println();
		//using enhanced for loop
		
		for(String v1:v)
		{
			System.out.println(v1);
		}
		
		
		//using normal for loop
		
		System.out.println("Using Enumeration");
		Enumeration<String> en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}

}
