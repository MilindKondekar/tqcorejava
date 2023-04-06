package com.treeset;

import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		TreeSet<Student> t1 = new TreeSet<>();
		
		t1.add(new Student(1,"Rushi",70f));
		t1.add(new Student(2,"Vinayak",90f));
		t1.add(new Student(3,"Akash",80f));
		
		
		for(Student s: t1)
		{
			System.out.println(s);
		}
		
	}

}
