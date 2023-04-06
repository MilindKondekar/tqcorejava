package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashDemo {

	public static void main(String[] args) 
	{
		
		HashMap<String,Integer> h1 = new HashMap<>();
		h1.put("Ramesh", 65);
		h1.put("Suresh", 87);
		h1.put("Naresh", 77);
		
		
		System.out.println(h1);
		
		
		// using keySet
		
        Set<String> keyset =  h1.keySet();
		
        /*for(String s:keyset)
        {
        	System.out.println(s);
        }*/
        
       System.out.println(h1.get("Ramesh")); 
        
		
	}

}
