package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomSortByMarks {

	public static void main(String[] args)
	{
		
		
		Course c1 = new Course(1,"Technical");
		Course c2 = new Course(2,"Sales");
		Course c3 = new Course(3,"Tax");
		
		HashMap<Student,Course> map = new HashMap<>();
		
		map.put(new Student(1,"Rushi",78.0f,c1), c1);
		map.put(new Student(2,"Vinayak",88.0f,c2), c2);
		map.put(new Student(3,"Akash",71.0f,c3), c3);
		
		
		sortbymarks(map);
		
	}

	private static void sortbymarks(HashMap<Student, Course> map) 
	{
		ArrayList<Student> al = new ArrayList<>(map.keySet());
		
		
		Collections.sort(al,new MarksComparator());
		
		LinkedHashMap<Student,Course> li = new LinkedHashMap<>();
		
		for(Student s:al)
		{
			li.put(s, map.get(s));
		}
		
		for(Map.Entry<Student, Course> en : li.entrySet())
		{		
			 System.out.println("Key "+en.getKey()+" || Value : "+en.getValue());
			 
		}
	}

}
