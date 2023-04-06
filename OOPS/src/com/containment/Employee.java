package com.containment;

import java.util.Scanner;

public class Employee 
{
	
	private int id;
	private String name;
	private Department department;
	
	
	Employee()
	{
		
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setDepartment(Department department)
	{
		this.department=department;
	}
	
	public Department getDepartment()
	{
		return department;
	}
	
	
}
