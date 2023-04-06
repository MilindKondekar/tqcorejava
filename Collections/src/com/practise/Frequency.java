package com.practise;

import java.util.ArrayList;
import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Rushi");
		al.add("Vinayak");
		al.add("Akash");
		al.add("Shreyas");
		al.add("Rushi");
		al.add("Vinayak");
		
		freq(al);
	}

	private static void freq(ArrayList<String> al)
	{
		HashMap<String,Integer> map = new HashMap<>();
		
		for(String s:al)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			
			else
			{
				map.put(s, 1);
			}
		}
		
		System.out.println(map);
		
		
	}

}
