package com.basics;

import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		int id =sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Expereince");
		float exp = sc.nextFloat();
		System.out.println("Enter Salary");
		float sal = sc.nextFloat();
		
		emp.EnterDetails(id, name, exp, sal);
		emp.DisplayDetails();
		emp.Increment();
		
		
	}

}
