package com.containment;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		enterDetails(e1);
		showDetails(e1);
		
	}

	
	public static void enterDetails(Employee e1)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id");
		e1.setId(sc.nextInt());
		System.out.println("Enter Name ");
		e1.setName(sc.next());
        System.out.println("Enter Department Id ");
        e1.setDepartment(new Department());
        e1.getDepartment().setId(sc.nextInt());
        System.out.println("Enter Department Name ");
        e1.getDepartment().setDeptName(sc.next());
        System.out.println("Enter Location ");
        e1.getDepartment().setLocation(sc.next());
	}
	
	public static void showDetails(Employee e1)
	{
		System.out.println("Employee Id : "+e1.getId()
		                   +"\nEmployee Name : "+e1.getName()
		                   +"\nDepartment Id : "+e1.getDepartment().getId()
		                   +"\nDepartment Name :"+e1.getDepartment().getDeptName()
		                   +"\nLocation : "+e1.getDepartment().getLocation());
	}
}
