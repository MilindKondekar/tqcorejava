package com.arraylistlogical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseArrayList {

	public static void main(String[] args)
	{
		
		ArrayList<String>  al1 = new ArrayList<>();
		al1.add("Java");
		al1.add("Python");
		al1.add("Dotnet");
		al1.add("C");
		
		
		reverse(al1);

	}

	
	public static void reverse(ArrayList<String> al)
	{
		/*Iterator<String> itr = al.iterator();
		ListIterator<String> itr2 = al.listIterator(al.size());
		*/
		
		String temp;
		for(int i =0,j=al.size()-1;i<al.size()/2;i++,j--)
		{
			temp = al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
			
		}
		
		System.out.println(al);
		
	}
}
