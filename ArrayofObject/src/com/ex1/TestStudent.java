package com.ex1;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

	static Scanner sc = new Scanner(System.in);
	
	public static void enterDetails(Student s)
	{
		System.out.println("Enter the id");
		s.setId(sc.nextInt());
		
		System.out.println("Enter Name");
		s.setName(sc.next());
		
		System.out.println("Enter the marks");
		s.setMarks(sc.nextInt());
		
		System.out.println("Enter the age");
		s.setAge(sc.nextInt());
	}
	
}
