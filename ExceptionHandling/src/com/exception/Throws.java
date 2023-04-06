package com.exception;

import java.util.Scanner;

class Student {

	
	private int age;
	private int id;
	private String name;
	
	
	public Student() 
	{
		
	}


	public Student(int age, int id, String name) 
	{

		this.age = age;
		this.id = id;
		this.name = name;
	}


	public int getAge() 
	{
		return age;
	}


	public void setAge(int age) 
	{
		this.age = age;
	}


	public int getId()
	{
		return id;
	}


	public void setId(int id) 
	{
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


	
	public String toString() 
	{
		return "Student age=" + age + ", id=" + id + ", name=" + name ;
	}
	
}
	
	 class Throws
	{
		public static void main(String[] args) 
		{
			
			Student s = new Student();
			System.out.println("Enter name");
			Scanner sc = new Scanner(System.in);
			s.setName(sc.next());
			System.out.println("Enter ID");
			s.setId(sc.nextInt());
			System.out.println("Enter age");
			int age = sc.nextInt();
			
			if(age<=18 && age>0)
			{
				System.out.println("Less than 18 cannot vote");
				 throw new ArithmeticException();
			}
			
			else if(age<=0)
			{
				System.out.println("Age cannot be zero or less");
				 throw new ArithmeticException();
			}
			
			
			
		}
	}
	
	
	
	
	

