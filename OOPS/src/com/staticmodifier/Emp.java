package com.staticmodifier;

public class Emp {

	 String Employee ;
	 static String company ="HCL";
	 static int numofinstance;
	
	static
	{
		numofinstance=0;
	}
	
	{
		numofinstance++;
	}
	
	
	public Emp(String employee) 
	{
	
		Employee = employee;
	}
	
	
	public static void main(String[] args) 
	{
		Emp e1 = new Emp("Mil");
		
		
		System.out.println("NumofInstance :"+Emp.numofinstance);
		
	}
	
	

}
