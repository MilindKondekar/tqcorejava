package com.inheritance;

public class MobilePhone extends Phone
{

	String brand;
	String simCard;
	
	
	
	public void call()
	{
		System.out.println("Calling from mobile");
	}
	
	public void dial()
	{
		System.out.println("Dialing from mobile");
	}
	
}
