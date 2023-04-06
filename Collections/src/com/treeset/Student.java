package com.treeset;

public class Student implements Comparable<Student>
{

	int id;
	String name;
	float marks;
	
	Student()
	{
		
	}

	public Student(int id, String name, float marks) 
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) 
	{
	
		if(this.marks==o.marks)
		{
			if(this.name.equals(o.name))
			{
				return 0;
			}
		}
		
		else if(this.marks>o.marks)
		{
			return 1;
		}
	
		else
		{
			return -1;
		}
		return 0;
			
	}
	
	
	
}
