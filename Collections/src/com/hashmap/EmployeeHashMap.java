package com.hashmap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

	public static void main(String[] args) 
	{
		

		
		HashMap<Employee,String> emp = new HashMap<>();
		
		emp.put(new Employee(1,"Rakesh"), "Programmer");
		emp.put(new Employee(2,"Rajesh"), "Coder");
		emp.put(new Employee(3,"Rakesh"), "Programmer");
		
		System.out.println(emp);
		
		for(Map.Entry<Employee, String> en: emp.entrySet())
		{
			System.out.println(en.getKey()+" ");
			System.out.println(en.getValue()+" ");
		}
	}

}
