package com.polymorphism;

import java.util.Scanner;

public class TestFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SchoolFess f = new SchoolFess();
		Scanner sc  =new Scanner(System.in);
		
		System.out.println("Enter Student Name");
		f.setStudentName(sc.next());
		
		System.out.println("Enter ScholarShip ID if any or else  Enter N.A");
		String str = sc.next();
		String ntr ="N.A";
		
		if(ntr.equalsIgnoreCase(str))
		{
			f.fees(f.getStudentName());
		}
		
		else
		{
			
			f.fees(f.getStudentName(), f.getSchoolarShipId());
		}
		
		System.out.println(" Student Name : "+f.getStudentName()
		                   +"\n Applicable Fees :"+f.getFees());
	}

}
