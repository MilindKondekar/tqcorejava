package com.arraylistlogical;

import java.util.ArrayList;

public class RemoveDupli {

	public static void main(String[] args)
	{
	

		ArrayList<String>  al1 = new ArrayList<>();
		al1.add("Java");
		al1.add("Python");
		al1.add("Dotnet");
		al1.add("C");
		al1.add("Java");
		al1.add("Dotnet");
		
		removeDuplic(al1);
	

	}

	private static void removeDuplic(ArrayList<String> al1)
	{
		ArrayList<String>  al2 = new ArrayList<>();
		
		for(String s :al1)
		{
			if(!al2.contains(s))
			{
				al2.add(s);
			}
		}
		
		System.out.println(al2);
	}

}
