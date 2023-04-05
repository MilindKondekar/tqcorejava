package com.ex1;

import java.util.Scanner;

public class TestDoctor {

	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
	     Doctor d[]  = new Doctor[1];	
	     
	     for(int i=0;i<d.length;i++)
	     {
	    	 d[i] = new Doctor();
	    	 enterDetails(d[i]);
	    	
	     }
	     

	     getdetails(d);
	}

	
	public static void enterDetails(Doctor d)
	{
		System.out.println("Enter Doc ID");
		d.setDocId(sc.nextInt());
		
		System.out.println("Enter Doc Name");
		d.setDocName(sc.next());
		
		System.out.println("Enter A number of Patients");
		int x = sc.nextInt();
		d.setPatient(new Patient[x]);
		
		for(int i=0;i<x;i++)
		{
			d.getPatient()[i] = new Patient();
			System.out.println("Enter Patient Id");
			d.getPatient()[i].setpId(sc.nextInt());
			System.out.println("Enter Name");
			d.getPatient()[i].setpName(sc.next());
		}
		
	}
	
	
	public static void getdetails(Doctor []d)
	{
		for(Doctor doc:d)
		{
			System.out.println("Doc ID:"+doc.getDocId()+
			                   "\nDoc Name:"+doc.getDocName());
			
			for(Patient p:doc.getPatient())
			{
				System.out.println("Patient ID:"+p.getpId()+
				                  "\nPatient Name:"+p.getpName());
			}
		}
	}
}
