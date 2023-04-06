package com.hashmap.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sort {

	public static void main(String[] args) 
	{
		HashMap<String,Double> h1 = new HashMap<>();
		h1.put("Ramesh", 65.0);
		h1.put("Suresh", 87.0);
		h1.put("Naresh", 77.0);

		
		sort(h1);
		
	}

	private static void sort(HashMap<String, Double> h1)
	{
		ArrayList<Double> al = new ArrayList<>(h1.values());
		
		Collections.sort(al);
		
		System.out.println(al);
		
		LinkedHashMap<String, Double> li = new LinkedHashMap<>();
		
		for(Double d:al)
		{
			for(Map.Entry<String, Double> en: h1.entrySet())
			{
				if(en.getValue()==d)
				{
					String s = en.getKey();
					if(!li.containsKey(s))
					{
						li.put(s, d);
					}
				}
			}		
		}
		
		for(Map.Entry<String, Double> en: li.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
	}

}
