package com.stack;

public class Employee
{

	private int id;
	private String ename;
	private float salary;


	Employee()
	{

	}

	Employee(int id, String ename, float salary)
	{
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getEname()
	{
		return ename;
	}

	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	public float getSalary() 
	{
		return salary;
	}

	public void setSalary(float salary) 
	{
		this.salary = salary;
	}

	
	public String toString() 
	{
		return "Employee id=" + id + ", ename=" + ename + ", salary=" + salary ;
	}

      
}
