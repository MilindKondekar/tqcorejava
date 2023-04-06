package com.customhashmaplogical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToHashMap {

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
		
		countNoOfEmp(al);
	}

	private static void countNoOfEmp(ArrayList<Employee> al) 
	{
		HashMap<Department, Integer> map = new HashMap<>();
		
		for(Employee emp:al)
		{
			Department d = emp.getDept();
			if(map.containsKey(d))
			{
				map.put(d, map.get(d)+1);
			}
			
			else
			{
				map.put(d,1);
			}
			
		}
		
		
		for(Map.Entry<Department,Integer> en : map.entrySet())
		{
			System.out.println(en.getKey().deptName+" : "+en.getValue());
		}
		
	}

}
