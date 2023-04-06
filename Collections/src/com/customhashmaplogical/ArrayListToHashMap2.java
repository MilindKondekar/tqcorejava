package com.customhashmaplogical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToHashMap2 {

	public static void main(String[] args)
	{
		ArrayList<Employee> al = new ArrayList<>();
		
		Department d1 = new Department(1,"Sales");
		Department d2 = new Department(2,"Hr");
		Department d3 = new Department(3,"Manager");

		
		al.add(new Employee(1,"Vinayak",9000,d1));
		al.add(new Employee(2,"Rushi",5000,d2));
		al.add(new Employee(3,"Akash",7000,d1));
		al.add(new Employee(4,"Onkar",9000,d2));
		al.add(new Employee(5,"Shreyas",4000,d3));
		
		countNamesOfEmp(al);
	}

	private static void countNamesOfEmp(ArrayList<Employee> al) 
	{
		HashMap<Department, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> names;
		
		for(Employee emp:al)
		{
			Department d = emp.getDept();
			if(map.containsKey(d))
			{
				names = map.get(d);
				names.add(emp.getName());
				map.put(d, names);
			}
			
			else
			{
				names = new ArrayList<>();
				names.add(emp.getName());
				map.put(d, names);
			}
			
		}
		
		
		for(Map.Entry<Department,ArrayList<String>> en : map.entrySet())
		{
			System.out.println(en.getKey().deptName+" : "+en.getValue());
		}
		
	}

}
