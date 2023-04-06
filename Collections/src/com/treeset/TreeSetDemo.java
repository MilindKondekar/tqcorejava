package com.treeset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) 
	{

		 TreeSet<String> set1= new TreeSet<>();
	     // natural order.. asc of key
	            
			set1.add( "C");
			set1.add("Python");
			set1.add("Angular");
			set1.add( "Java");
			//set1.add(null);
			set1.add( "SpringBoot");
			set1.add( "HTML");
		
			System.out.println(set1);
			
			// 4 is included.. 7 is excluded
			//System.out.println(set1.subSet("Python", "Java"));
			
			
			Iterator<String> itr1 = set1.descendingIterator();
			
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
			
			
			System.out.println("==========================================");
			
			
			NavigableSet<String> nm = set1.descendingSet();
			
			for(String s:nm)
			{
				System.out.println(s);
			}
			
			
			
	}
}
