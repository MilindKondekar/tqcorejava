package com.exception;

public class MutliCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		multiCatch();
	}

	private static void multiCatch() 
	{
		String str = "";
		
		try
		{
			for(int j=0;j<=str.length();j++)
			{
				str.charAt(10);
			}
		}
		
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	
	
	
	
}
