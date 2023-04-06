package com.exception;

public class NestedTry2 {
	
	public static void nestedTry()
	{
		int i= Integer.parseInt("abc");
		
	}

	public static void main(String[] args) {
		
		try
		{
		nestedTry();
		}
		catch(Exception e)
		{
			System.out.println("Main:"+e);
		}

	
	}

}
