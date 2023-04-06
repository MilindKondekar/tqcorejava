package com.hashmap.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCount {

	public static void main(String[] args) 
	{
		
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		al.add("B");
			
		list(al);

	}

	private static void list(ArrayList<String> al)
	{
		HashMap<String, Integer> h1 = new HashMap<>();
		
		for(String s:al)
		{
			if(h1.containsKey(s))
			{
				h1.put(s, h1.get(s)+1);
			}
			
			else
			{
				h1.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer> en:h1.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
	}

}
