package com.logical;

public class ExtractionOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		extract(254);
			
	}

	public static void extract(int num)
	{
		int x=0;
		int y=0;
		int a=1;
		while(num!=0)
		{
			x=num%10;
			System.out.println(x);
			y+=x;
			a *=x;
			num=num/10;
		}
		System.out.println("Addition is "+y);	
		System.out.println("Multiplication  is "+a);	
	}
	
}
