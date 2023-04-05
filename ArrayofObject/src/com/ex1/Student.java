package com.ex1;

public class Student {

	private int id;
	private String name;
	private int age;
	private float marks;
	
	
	public Student()
	{
		
	}
	
	public Student(int id, String name, int age, float marks)
	{
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setMarks(float marks)
	{
		this.marks = marks;
	}
	
	public  float getMarks()
	{
		return marks;
	}
	
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}

	
	public String toString() 
	{
		return "id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks ;
	}

	
	
	
}
