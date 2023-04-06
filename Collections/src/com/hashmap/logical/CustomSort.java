package com.hashmap.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.customlinkedhashmap.Department;

public class CustomSort {

	public static void main(String[] args) 
	{
		Department d1 = new Department(1,"Sales");
		Department d2 = new Department(2,"Hr");
		Department d3 = new Department(3,"Manager");

		
		//sort(h1);
		
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
