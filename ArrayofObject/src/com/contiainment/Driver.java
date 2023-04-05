package com.contiainment;

public class Driver 
{

	private String name;
	private int id;
	
	Driver()
	{
		
	}

	public Driver(String name, int id) 
	{
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	
	public String toString()
	{
		return "Driver name=" + name + ", id=" + id ;
	}
	
	
	
	
	
}
