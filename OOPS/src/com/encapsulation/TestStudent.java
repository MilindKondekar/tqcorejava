package com.encapsulation;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name");
		s1.setName(sc.next());
		System.out.println("Enter Student Id");
		s1.setId(sc.nextInt());
		System.out.println("Enter Student Age");
		s1.setAge(sc.nextInt());
		System.out.println("Enter Student Marks");
		s1.setMarks(sc.nextFloat());
		
		
		System.out.println("--------------Student Details------------");
		System.out.println(" Student Name :"+s1.getName()
		                  +"\n Student Age :"+s1.getAge()
		                  +"\n Student ID :"+s1.getId()
		                  +"\n Student Marks :"+s1.getMarks());
		
	}

}
