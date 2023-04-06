package com.customlinkedhashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomLinkedHashMapDemo {

	public static void main(String[] args)
	{
		ArrayList<Employee> al = new ArrayList<>();
		
		Department d1 = new Department(1,"Sales");
		Department d2 = new Department(2,"Hr");
		Department d3 = new Department(3,"Manager");

		
		al.add(new Employee(1,"Vinayak",9000));
		al.add(new Employee(2,"Rushi",5000));
		al.add(new Employee(3,"Akash",7000));
		al.add(new Employee(4,"Onkar",9000));
		al.add(new Employee(5,"Shreyas",4000));
		
		
		LinkedHashMap<Employee, Department> li = new LinkedHashMap<>();
		li.put(new Employee(1,"Vinayak",9000), d1);
		li.put(new Employee(2,"Rushi",5000), d2);
		li.put(new Employee(3,"Akash",7000), d3);
		
		
		for(Map.Entry<Employee, Department> en:li.entrySet())
		{
			
		}
		
	}

	

}
