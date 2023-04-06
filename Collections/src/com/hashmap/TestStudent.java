package com.hashmap;

import java.util.HashMap;

public class TestStudent {

	public static void main(String[] args) 
	{
		
		HashMap<Student,Integer> h1 = new HashMap<>();
		
		h1.put(new Student(1,"Ramesh",53), 1);

		h1.put(new Student(2,"Suresh",70), 2);
		
		h1.put(new Student(1,"Ramesh",53), 2);
		
		h1.put(new Student(1,"Ramesh",54), 2);
		
		System.out.println(h1);
	}

}
