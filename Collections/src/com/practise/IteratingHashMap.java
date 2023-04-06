package com.practise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashMap<String,Integer> h1 = new HashMap<>();
		h1.put("Ramesh", 65);
		h1.put("Suresh", 87);
		h1.put("Naresh", 77);
		
		System.out.println(h1);
		
		Set<String >  set = h1.keySet();
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		Collection<Integer> marks = h1.values();
		
		for(Integer m:marks)
		{
			System.out.println(m);
		}
		
		Set<String> set2 = h1.keySet();
		
		Iterator<String> itr = set2.iterator();
		
		while(itr.hasNext())
		{
			String k = itr.next();
			System.out.println(k+" "+h1.get(k));
		}
		
	}

}
