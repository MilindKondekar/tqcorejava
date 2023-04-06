package com.typepromotion;

public class Ambiguity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//display(9,7.8f)
		
		
	}

	static void display(int a, double d)
	{
		System.out.println("Method 1:");
		System.out.println(a+d);
	}
	
	static void display(long l , float f)
	{
		System.out.println("Method 2:");
		System.out.println(l+f);
	}
	
}
