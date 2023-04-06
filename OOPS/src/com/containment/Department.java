package com.containment;

public class Department {

	private int id;
	private String deptName;
	private String location;
	
	Department()
	{
		
	}

	public Department(int id, String deptName, String location) 
	{
		
		this.id = id;
		this.deptName = deptName;
		this.location = location;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getDeptName()
	{
		return deptName;
	}

	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location) 
	{
		this.location = location;
	}

	
	public String toString() 
	{
		return "Department id=" + id + ", deptName=" + deptName + ", location=" + location ;
	}
	
	
	
	
	
}
