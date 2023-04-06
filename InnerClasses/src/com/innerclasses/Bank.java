package com.innerclasses;

public class Bank 
{

	private static String bankName="SBI";
	String bankloc;
	int regNo;
	
	{
		bankloc = "Delhi";
		regNo=12345;
	}
	
	void displayBank()
	{
		System.out.println(bankName+" "+bankloc+" "+regNo);
	}
	
	
	 class Locker
	{
		int lockerId;
		String custName;
		//static  int lockerRent = 2000;
		
		void enterdetails()
		{
			
		}
		
		
	}
	
}
