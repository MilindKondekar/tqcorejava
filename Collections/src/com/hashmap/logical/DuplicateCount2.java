package com.hashmap.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCount2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		createMap(al);

	}

	
	public static void createMap(ArrayList<Integer>list)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		/*for(Integer n:list)
		{
			
			String nwords = convertWord(n);
			if(map.containsKey(nwords))
			{
				map.put(nwords, map.get(nwords)+1);
			}
			
			else
				map.put(nwords, 1);
		}*/
		
		for(Integer i:list)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			
			
			else
			{
				map.put(i, 1);
			}
			
		}
		
		for(Map.Entry<Integer, Integer> en: map.entrySet())
		{
			
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		
	}


/*	private static String convertWord(Integer n) 
	{
		int ch=n;
		switch(ch)
		{
		case 1: 
		}
		
		return null;
	}*/
	
	
}
